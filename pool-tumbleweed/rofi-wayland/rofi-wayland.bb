SUMMARY = "A window switcher, run dialog and dmenu replacement"
DESCRIPTION = "This is a fork of rofi with added support for Wayland via the layer shell protocol."
LICENSE = "MIT"

PV = "1.7.5+wayland1+git.1679493688.d06095b"

RPM_NAME = "rofi-wayland-1.7.5+wayland1+git.1679493688.d06095b-1.1.aarch64.rpm"
RPM_HASH = "299012410a7a169f6f7f861bfbc3d6ee5e2bbcbba05c659e9f6368dff8d884aeecabe43890180f9d2fbbad51ec987e2cbb9c2fa49cd56f254895c2607fbf7591"

RPROVIDES:${PN} += "application() \
application(rofi-theme-selector.desktop) \
application(rofi.desktop) \
rofi-launcher \
rofi-wayland \
rofi-wayland(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgmodule-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libwayland-client.so.0()(64bit) \
libwayland-cursor.so.0()(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0(V_0.7.0)(64bit)"

inherit rpm
