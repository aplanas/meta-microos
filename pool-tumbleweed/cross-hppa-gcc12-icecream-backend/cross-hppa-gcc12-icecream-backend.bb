SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-hppa-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "bfce2626402cbe5341333276ee09b954284d5d3460f58bc10d29ba54b2c23544e98f70de738257598d067db7e7257e7b3719ae5aa047fddcf89cb4e26005ba7d"

RPROVIDES:${PN} += "cross-hppa-gcc12-icecream-backend \
cross-hppa-gcc12-icecream-backend(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
