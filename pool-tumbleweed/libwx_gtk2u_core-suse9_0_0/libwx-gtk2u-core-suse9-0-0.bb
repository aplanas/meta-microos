SUMMARY = "wxWidgets basic GUI class library"
DESCRIPTION = "Basic GUI classes such as GDI classes or controls are in this \
library. All wxWidgets GUI applications must link against this \
library, only console mode applications need not."
LICENSE = "LGPL-2.1-or-later-with-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk2u_core-suse9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "1f8f758b2d5eaa57376302145e0ac914aad37b35a7870d4c43e080b70d6ab2bd1d7adad981aa3331db83249cdbb08acaa0cc69fa5dc5eb7dffe9cac73db3d732"

RPROVIDES:${PN} += "libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-core-suse9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSM.so.6 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-pixbuf-2.0.so.0 \
libgdk-x11-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-x11-2.0.so.0 \
libjpeg.so.8 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libwx-baseu-suse.so.9.0.0"

inherit rpm
