SUMMARY = "Development headers for libnbd"
DESCRIPTION = "This package contains development headers for libnbd."
LICENSE = "LGPL-2.1-or-later"

PV = "1.14.1"

RPM_NAME = "libnbd-devel-1.14.1-2.2.aarch64.rpm"
RPM_HASH = "1f4b1029187be453045a3eb49cef179597930972f7d4b58873c13ff6eca01ff3a372a7e8f0caf972c4d19a5f6f4fba971c9ffd604d3a4fb0302c7030f09d3654"

RPROVIDES:${PN} += "libnbd-devel \
pkgconfig-libnbd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnbd0"

inherit rpm
