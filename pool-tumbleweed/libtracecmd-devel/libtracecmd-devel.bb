SUMMARY = "Development files for libtracecmd"
DESCRIPTION = "Development files of the libtracecmd library"
LICENSE = "LGPL-2.1-only"

PV = "1.3.1"

RPM_NAME = "libtracecmd-devel-1.3.1-2.3.aarch64.rpm"
RPM_HASH = "cbf5c2c9f179283a9b1f409fea53c1b1a124d9a3ec6861a30a9f4721507c944b37d9a159ea16051ea84fe40dfc84f7e0ee3e5f0ba1bba6c64ed9ce567a8b677f"

RPROVIDES:${PN} += "libtracecmd-devel \
libtracecmd-devel(aarch-64) \
pkgconfig(libtracecmd)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libtracecmd1 \
pkgconfig(libtraceevent) \
pkgconfig(libtracefs) \
pkgconfig(libzstd)"

inherit rpm
