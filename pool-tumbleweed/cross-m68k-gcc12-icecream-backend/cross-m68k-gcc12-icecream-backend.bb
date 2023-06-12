SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-m68k-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "a66783d6c3413d351755fefcec02698c9c6f89bc3de966e8013f032601dcd9d49576b84344a45a3d8c74265a51653fbbef7e623435094aa2133cc1234539bdf9"

RPROVIDES:${PN} += "cross-m68k-gcc12-icecream-backend \
cross-m68k-gcc12-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
