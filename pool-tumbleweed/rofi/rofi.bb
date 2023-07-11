SUMMARY = "A window switcher, run dialog and dmenu replacement"
DESCRIPTION = "rofi is a popup window switcher roughly based on 'superswitcher', \
requiring only xlib and pango. This version started off as a clone of \
simpleswitcher, the version from Sean Pringle. Rofi developed extra \
features, like a run dialog, SSH launcher and can act as a drop-in \
dmenu replacement."
LICENSE = "MIT"

PV = "1.7.5"

RPM_NAME = "rofi-1.7.5-2.4.aarch64.rpm"
RPM_HASH = "83f90dd2e2c37e75360dea580149f465cbf6a362ec0d1d4451671423d9e164eb983f59401a2a8d3d4f8760a1f12119b82072ac5aa3a5f8a9004c55a5e9171783"

RPROVIDES:${PN} += "rofi \
rofi-launcher"

RDEPENDS:${PN} += "/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcairo.so.2 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgmodule-2.0.so.0 \
libgobject-2.0.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libstartup-notification-1.so.0 \
libxcb-cursor.so.0 \
libxcb-ewmh.so.2 \
libxcb-icccm.so.4 \
libxcb-randr.so.0 \
libxcb-util.so.1 \
libxcb-xinerama.so.0 \
libxcb-xkb.so.1 \
libxcb.so.1 \
libxkbcommon-x11.so.0 \
libxkbcommon.so.0 \
xdg-utils"

inherit rpm
