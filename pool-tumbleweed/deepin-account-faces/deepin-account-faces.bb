SUMMARY = "Account faces for Linux Deepin"
DESCRIPTION = "Account face icons for Linux Deepin."
LICENSE = "CC0-1.0 & GPL-2.0-or-later"

PV = "1.0.12.1"

RPM_NAME = "deepin-account-faces-1.0.12.1-1.2.noarch.rpm"
RPM_HASH = "85c0b27842f146c9c86b3f3513a9df62bb058b4495bdf9b0efb8b00e03c1de97bc96fb8dcceb1b4cff229617bef4af42765143511ef2f78b18f3a0007656f4d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "deepin-account-faces"
RDEPENDS:${PN} += ""

inherit rpm
