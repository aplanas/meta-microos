SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "cross-arm-gcc12-icecream-backend-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "62ad48b752ec28313fcda8e1d14b66a524b5f92da37e8c58dc34b8877c9d394cac1e9fe355f248ba722b590309312f5107a620c8f0201f52f55c077658d9fcab"

RPROVIDES:${PN} += "cross-arm-gcc12-icecream-backend"

RDEPENDS:${PN} += ""

inherit rpm
