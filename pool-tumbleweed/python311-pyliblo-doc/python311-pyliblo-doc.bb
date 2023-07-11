SUMMARY = "Documentation for python-pyliblo"
DESCRIPTION = "This package contains HTML documentation, including tutorials and API \
reference for python-pyliblo."
LICENSE = "LGPL-2.1-or-later"

PV = "0.10.0"

RPM_NAME = "python311-pyliblo-doc-0.10.0-2.12.aarch64.rpm"
RPM_HASH = "282c71f21b647c9f156df174b5b24968f6446fa80f683e91d5c4251f0d5e533b284cbc83aec25ca738cca042518ab73858731f2d0107f718cca7d399ae60033b"

RPROVIDES:${PN} += "python3-pyliblo-doc \
python311-pyliblo-doc"

RDEPENDS:${PN} += "python311-pyliblo"

inherit rpm
