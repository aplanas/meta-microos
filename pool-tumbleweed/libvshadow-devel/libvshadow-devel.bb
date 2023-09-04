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

RPM_NAME = "libvshadow-devel-20221030-4.1.aarch64.rpm"
RPM_HASH = "16c58f1b7f2decb6770d4bdd1bed86b258f83ea6b592c34bcadc59498edeef035f52e5376149f0271c5ca329b00177774161a16604401e37d9e25d1126e1415b"

RPROVIDES:${PN} += "libvshadow-devel \
pkgconfig-libvshadow"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libbfio-devel \
libvshadow1"

inherit rpm
