SUMMARY = "PEP517 for the Meson build system"
DESCRIPTION = "This package contains a Python module that implements PEP517 for \
the Meson build system."
LICENSE = "Apache-2.0"

PV = "0.2"

RPM_NAME = "python310-mesonpep517-0.2-1.1.noarch.rpm"
RPM_HASH = "37236d030b21feee29df4fb002c75d518e8561c7e3531806d70ae95cca258e7f10934a6a711111cc331181c61d5abea3ff1444ddab3923c5025b5307f2ff6aec"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mesonpep517 \
python3.10dist-mesonpep517 \
python310-mesonpep517 \
python3dist-mesonpep517"

RDEPENDS:${PN} += "meson \
python-abi \
python310-setuptools \
python310-toml \
python310-wheel"

inherit rpm
