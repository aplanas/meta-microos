SUMMARY = "wxWidgets Library"
DESCRIPTION = "Library for the wxWidgets cross-platform GUI. \
 \
This varaint of wxWidgets is built without STL types (such as \
std::string), and is provided for old programs which fail to use e.g. \
wxString and instead rely on the wxChar pointer API."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.5.1"

RPM_NAME = "libwx_gtk2u_core-suse-nostl3_0_5-3.0.5.1-4.2.aarch64.rpm"
RPM_HASH = "af4bebd0a33e344badd0c7fa87f3b68dba03a89563c0057627760fa97be52efda9498d7d0623c7846ef3e2fe1ef241fc1aea3630c9b7388355df484aed433dc9"

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
