SUMMARY = "A window switcher, run dialog and dmenu replacement"
DESCRIPTION = "rofi is a popup window switcher roughly based on 'superswitcher', \
requiring only xlib and pango. This version started off as a clone of \
simpleswitcher, the version from Sean Pringle. Rofi developed extra \
features, like a run dialog, SSH launcher and can act as a drop-in \
dmenu replacement."
LICENSE = "MIT"

PV = "1.7.5"

RPM_NAME = "rofi-1.7.5-2.3.aarch64.rpm"
RPM_HASH = "896bc7a600b1fe6d700a64064a59aefcd8a57a2c3c677cc48b41d039d54fd9c4863aef268271ae672f4b9bc8d54f1b36fc446633e92a47022f25c541a2c8d31f"

RPROVIDES:${PN} += "application() \
application(rofi-theme-selector.desktop) \
application(rofi.desktop) \
rofi \
rofi(aarch-64) \
rofi-launcher"

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
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libstartup-notification-1.so.0()(64bit) \
libxcb-cursor.so.0()(64bit) \
libxcb-ewmh.so.2()(64bit) \
libxcb-icccm.so.4()(64bit) \
libxcb-randr.so.0()(64bit) \
libxcb-util.so.1()(64bit) \
libxcb-xinerama.so.0()(64bit) \
libxcb-xkb.so.1()(64bit) \
libxcb.so.1()(64bit) \
libxkbcommon-x11.so.0()(64bit) \
libxkbcommon-x11.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0()(64bit) \
libxkbcommon.so.0(V_0.5.0)(64bit) \
libxkbcommon.so.0(V_0.7.0)(64bit) \
xdg-utils"

inherit rpm
