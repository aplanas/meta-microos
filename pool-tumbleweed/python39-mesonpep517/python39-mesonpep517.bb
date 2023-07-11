SUMMARY = "PEP517 for the Meson build system"
DESCRIPTION = "This package contains a Python module that implements PEP517 for \
the Meson build system."
LICENSE = "Apache-2.0"

PV = "0.2"

RPM_NAME = "python39-mesonpep517-0.2-1.2.noarch.rpm"
RPM_HASH = "a630754117fb018127ae4929adf8297c11fc35229a1ad3c1e48add2b856222e28f00f02be2b6bab6a2631c4cab0596fcb5b342724c0403fd8fef18e88c3a742d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-mesonpep517 \
python39-mesonpep517 \
python3dist-mesonpep517"

RDEPENDS:${PN} += "meson \
python-abi \
python39-setuptools \
python39-toml \
python39-wheel"

inherit rpm
