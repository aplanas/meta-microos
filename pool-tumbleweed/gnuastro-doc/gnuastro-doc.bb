SUMMARY = "Documentation for the GNU Astromomy Utilities"
DESCRIPTION = "Additional documentation for the GNU Astromomy Utilities."
LICENSE = "GPL-3.0-or-later"

PV = "0.20"

RPM_NAME = "gnuastro-doc-0.20-1.1.noarch.rpm"
RPM_HASH = "68bc114e3c3eeb5debcb78947b5582af062c82d927260f0a0bdb447a17af8dffdea4fb981e126abfeb1cad9078d0ca831454a44777c2716b308914bccf317aa3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnuastro-doc"

RDEPENDS:${PN} += ""

inherit rpm
