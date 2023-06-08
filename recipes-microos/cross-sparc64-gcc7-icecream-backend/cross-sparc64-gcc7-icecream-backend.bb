SUMMARY = "Icecream backend for the GNU C Compiler"
DESCRIPTION = "This package contains the icecream environment for the GNU C Compiler"
LICENSE = "GPL-3.0-or-later"

PV = "7.5.0+r278197"

RPM_NAME = "cross-sparc64-gcc7-icecream-backend-7.5.0+r278197-12.5.aarch64.rpm"
RPM_HASH = "44f9df4dab3d938bc2683f20c8b427cf8a6691cf1cf735ccd405991a9f5350030b09c0753266366f3908eea4c4b7e0fe207f6fffffda6c69d0b9c29e3d7d7174"

RPROVIDES:${PN} += "cross-sparc64-gcc7-icecream-backend cross-sparc64-gcc7-icecream-backend(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
