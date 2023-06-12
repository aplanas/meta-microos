SUMMARY = "File Manager for the GNOME Desktop -- Extension Library"
DESCRIPTION = "Nautilus is the file manager for the GNOME desktop. \
 \
This package contains the library used by nautilus extensions."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-or-later"

PV = "44.2"

RPM_NAME = "libnautilus-extension4-44.2-1.1.aarch64.rpm"
RPM_HASH = "264bdd7b6409739314d0332fe1b8a2e3c46b86758b658314e9d3fd2556439c5523f525085eae86426062bf4c6a5c84a2176b34db59db7851541fe63b8c1de4ae"

RPROVIDES:${PN} += "libnautilus-extension.so.4()(64bit) \
libnautilus-extension4 \
libnautilus-extension4(aarch-64) \
libnautilus-image-properties.so()(64bit) \
libtotem-properties-page.so()(64bit)"
RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgexiv2.so.2()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgstpbutils-1.0.so.0()(64bit) \
libgstreamer-1.0.so.0()(64bit)"

inherit rpm
