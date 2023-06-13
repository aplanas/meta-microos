SUMMARY = "Documentation for German dictionaries"
DESCRIPTION = "Documentation for German, Swiss, and Austrian dictionaries for the ispell \
and myspell spell checkers."
LICENSE = "GPL-2.0+"

PV = "20161207"

RPM_NAME = "igerman98-doc-20161207-2.14.noarch.rpm"
RPM_HASH = "8561bb257249f716055d87d1b3577d968c6d66a9aca64b6fa12f14402cd3153e859f9214b965c968b71876364d11dfb17a52fd9cec548cab8a444d6996260fd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "igerman98-doc"

RDEPENDS:${PN} += ""

inherit rpm
