SUMMARY = "Documentation for python-pyliblo"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python311-pyliblo-doc-0.10.0-2.11.aarch64.rpm"
RPM_HASH = "5d02e01dd97c99f782df34f3c393f20775550b4a8edabfad0d25332899e2172edc1520fed8028fe2c4ef1926120fbc2d37b6dfb4c89918a6ee3b36bc32693425"

RPROVIDES:${PN} += "python311-pyliblo-doc \
python311-pyliblo-doc(aarch-64)"

RDEPENDS:${PN} += "python311-pyliblo"

inherit rpm
