SUMMARY = "Development headers for Boost"
DESCRIPTION = "A collection of header-only libraries for Boost. This package \
installs the dafault version."
LICENSE = "MIT"

PV = "1.82.0"

RPM_NAME = "libboost_headers-devel-1.82.0-1.1.noarch.rpm"
RPM_HASH = "87bec689f5952910095f4a343eb55a8017d4d560f6fdfc33f4a4c2df485c09e4fe8bdf7767c21e856abb9b504e66eec8977a526b08501f5347a7cf55256f7ae9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libboost-headers-devel"

RDEPENDS:${PN} += "libboost-headers1-82-0-devel"

inherit rpm
