SUMMARY = "wxWidgets basic GUI class library"
DESCRIPTION = "Basic GUI classes such as GDI classes or controls are in this \
library. All wxWidgets GUI applications must link against this \
library, only console mode applications need not."
LICENSE = "LGPL-2.1-or-later-WITH-WxWindows-exception-3.1"

PV = "3.2.2.1"

RPM_NAME = "libwx_gtk3u_core-suse-nostl9_0_0-3.2.2.1-3.1.aarch64.rpm"
RPM_HASH = "9c15942227ac3489e6855611a08ced79630777e733a980d69b359f27864b23216b8767b20ca21663fa182bbe2577b1e64587659252a15a6707299f8351c1b772"

RPROVIDES:${PN} += "libwx-gtk3u-core-suse-nostl.so.9.0.0 \
libwx-gtk3u-core-suse-nostl9-0-0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libSDL2-2.0.so.0 \
libSM.so.6 \
libX11.so.6 \
libXtst.so.6 \
libc.so.6 \
libcairo.so.2 \
libfontconfig.so.1 \
libgcc-s.so.1 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libjpeg.so.8 \
libm.so.6 \
libnotify.so.4 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpangoft2-1.0.so.0 \
libpng16.so.16 \
libstdc++.so.6 \
libtiff.so.6 \
libwx-baseu-suse-nostl.so.9.0.0"

inherit rpm
