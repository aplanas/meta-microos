SUMMARY = "Chafa documentation"
DESCRIPTION = "Documentation for chafa."
LICENSE = "LGPL-3.0-or-later"

PV = "1.12.4"

RPM_NAME = "chafa-doc-1.12.4-1.3.noarch.rpm"
RPM_HASH = "58efc2c81a8261c9613e0b1c7b53b00ecc13d06244d4d4d84e5a8224f0dba822d5068251f849d2286b2b08d711d8d2c5bd53a59c45edddea7c78d4c29bf17ee4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "chafa-doc"
RDEPENDS:${PN} += ""

inherit rpm
