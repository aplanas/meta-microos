SUMMARY = "A tool to automatically upgrade syntax for newer versions"
DESCRIPTION = "A tool to automatically upgrade syntax for newer versions of the Python \
programming language."
LICENSE = "MIT"

PV = "3.4.0"

RPM_NAME = "python311-pyupgrade-3.4.0-1.3.noarch.rpm"
RPM_HASH = "0cbc82a8bd8250ac02fd67113e1091272e3d11ee6d942bca519d2a8e8ca37abb957e833e43fb9ed19d3d8bd60b6754b47abcaad4f39a351d0e9e27bd4d864141"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pyupgrade \
python3.11dist-pyupgrade \
python311-pyupgrade \
python3dist-pyupgrade"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-tokenize-rt \
update-alternatives"

inherit rpm
