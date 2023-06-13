SUMMARY = "wxWidgets basic GUI class library"
DESCRIPTION = "Basic GUI classes such as GDI classes or controls are in this \
library. All wxWidgets GUI applications must link against this \
library, only console mode applications need not."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_core-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "1f8f758b2d5eaa57376302145e0ac914aad37b35a7870d4c43e080b70d6ab2bd1d7adad981aa3331db83249cdbb08acaa0cc69fa5dc5eb7dffe9cac73db3d732"

RPROVIDES:${PN} += "libwx_gtk2u_core-suse.so.9.0.0()(64bit) \
libwx_gtk2u_core-suse9_0_0 \
libwx_gtk2u_core-suse9_0_0(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libSM.so.6()(64bit) \
libX11.so.6()(64bit) \
libXtst.so.6()(64bit) \
libc.so.6()(64bit) \
libcairo.so.2()(64bit) \
libfontconfig.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libgdk-x11-2.0.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-x11-2.0.so.0()(64bit) \
libjpeg.so.8()(64bit) \
libm.so.6()(64bit) \
libnotify.so.4()(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpangoft2-1.0.so.0()(64bit) \
libpng16.so.16()(64bit) \
libpng16.so.16(PNG16_0)(64bit) \
libstdc++.so.6()(64bit) \
libtiff.so.6()(64bit) \
libwx_baseu-suse.so.9.0.0()(64bit)"

inherit rpm
