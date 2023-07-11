SUMMARY = "PEP517 for the Meson build system"
DESCRIPTION = "This package contains a Python module that implements PEP517 for \
the Meson build system."
LICENSE = "Apache-2.0"

PV = "0.2"

RPM_NAME = "python310-mesonpep517-0.2-1.2.noarch.rpm"
RPM_HASH = "dc508ee4d664c7bddc21893ce79fbfc3f6502c041d71939f24700c11c7f3556bd389e7e84f2a761ad7484df9c1dfa4e9f62c2104bb6ecbf746a8b4037afa7d29"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-mesonpep517 \
python310-mesonpep517 \
python3dist-mesonpep517"

RDEPENDS:${PN} += "meson \
python-abi \
python310-setuptools \
python310-toml \
python310-wheel"

inherit rpm
