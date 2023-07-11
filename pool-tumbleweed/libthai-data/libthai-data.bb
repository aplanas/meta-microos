SUMMARY = "Data files for the Thai language support library"
DESCRIPTION = "LibThai is a set of Thai language support routines to aid \
incorporation of Thai language support into applications. It includes \
important Thai-specific functions, such as word breaking, input and \
output methods, and basic character and string support. \
 \
This package contains the data files for libthai."
LICENSE = "LGPL-2.1-or-later"

PV = "0.1.29"

RPM_NAME = "libthai-data-0.1.29-1.7.aarch64.rpm"
RPM_HASH = "1b5584dc09540e90f0ff7d65d1d16d5b1576bfcaddf63a0a52418701ef368d9b49706aad35b4ab712c5f832ba5a168fddc4350fbf576a1edbfde0bc1429fa707"

RPROVIDES:${PN} += "libthai-data"

RDEPENDS:${PN} += ""

inherit rpm
