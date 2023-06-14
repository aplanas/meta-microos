SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI. \
 \
This varaint of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_core-suse-nostl3_0_5-3.0.5.1-4.1.aarch64.rpm"
RPM_HASH = "4d1c653b8f4608c8be78a3f0261bd956b2e7100700142850c413c541b8bb06a2e089f08e6540cb303f42df4e55a26520cf6bc576a37b81dd90d9c955f2b6976b"

RPROVIDES:${PN} += "libwx-gtk2u-core-suse-nostl.so.3.0.5 \
libwx-gtk2u-core-suse-nostl3-0-5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSM.so.6 \
libX11.so.6 \
libc.so.6 \
libcairo.so.2 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libwx-baseu-suse-nostl.so.3.0.5"

inherit rpm
