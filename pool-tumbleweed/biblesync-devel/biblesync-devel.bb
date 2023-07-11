SUMMARY = "Development files for biblesync"
DESCRIPTION = "This package contains libraries and header files for developing applications \
that use biblesync."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "biblesync-devel-2.1.0-1.10.aarch64.rpm"
RPM_HASH = "70f29d8e32ed7c8642507b9634f39cc844cef498c88dee11f7f6379e871eef295c560d24073b25c6f9497a7c8081915b5e8f0d0481b02342559991d4916cbc6e"

RPROVIDES:${PN} += "biblesync-devel \
pkgconfig-biblesync"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbiblesync2-0 \
libuuid-devel"

inherit rpm
