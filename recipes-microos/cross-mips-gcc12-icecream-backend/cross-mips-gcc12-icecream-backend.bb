SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-mips-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "7f642ec3236dd70d09fb196677ad618894ba99cc129bad1f92b21e809836a1424b670d6621c3293080caf175717cee7771b2507e96b155661062de0d66b08d27"

RPROVIDES:${PN} += "cross-mips-gcc12-icecream-backend \
cross-mips-gcc12-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
