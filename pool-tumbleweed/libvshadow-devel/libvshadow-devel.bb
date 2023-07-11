SUMMARY = "Development files for libvshadow"
DESCRIPTION = "The libvshadow-devel package contains libraries and header files for \
developing applications that use libvshadow. \
 \
The package contains /usr/share/doc/packages/libvshadow: \
 \
* OSDFC 2012: Paper - Windowless Shadow Snapshots \
* OSDFC 2012: Slides - Windowless Shadow Snapshots"
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20221030"

RPM_NAME = "libvshadow-devel-20221030-3.7.aarch64.rpm"
RPM_HASH = "b4cb730fbc9009131fa64019c49dd2e3a47038249c336910c8685f5e9affb04469811b6fa8aae2ecdc86df8efbace0fbc4ac6b71fb5a9e0d9417382d36d37e23"

RPROVIDES:${PN} += "libvshadow-devel \
pkgconfig-libvshadow"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvshadow1"

inherit rpm
