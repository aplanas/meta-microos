SUMMARY = "File support for setuptools declarative setup.cfg"
DESCRIPTION = "File support for setuptools declarative setup.cfg."
LICENSE = "Apache-2.0"

PV = "1.2.0"

RPM_NAME = "python311-setuptools-declarative-requirements-1.2.0-2.1.noarch.rpm"
RPM_HASH = "75ad2cbb1a05a94c83dd5f307a664c661da8507f26d674250850c3fa2d8cba69bbb02b5fb0cb8ab6a27f0f8b88e5ded9df9962a3fb604db41b550ad1690cfe7c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(setuptools-declarative-requirements) \
python311-setuptools-declarative-requirements \
python3dist(setuptools-declarative-requirements)"

RDEPENDS:${PN} += "python(abi) \
python311-setuptools \
python311-toml \
python311-wheel"

inherit rpm
