SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "13.1.1+git7364"

RPM_NAME = "cross-sparcv9-gcc13-icecream-backend-13.1.1+git7364-1.2.aarch64.rpm"
RPM_HASH = "56c3164c716ecc18090280c81286030d48be9a41cb3b8a526dcd4af9477df41bac22b440ff056c02351212c08a61dc13edeb16bc9f6357f1249c520fd4b3206e"

RPROVIDES:${PN} += "cross-sparcv9-gcc13-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
