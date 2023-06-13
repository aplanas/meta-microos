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

RPROVIDES:${PN} += "libwx_gtk2u_core-suse-nostl.so.3.0.5()(64bit) \
libwx_gtk2u_core-suse-nostl3_0_5 \
libwx_gtk2u_core-suse-nostl3_0_5(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libwx_baseu-suse-nostl.so.3.0.5()(64bit)"

inherit rpm
