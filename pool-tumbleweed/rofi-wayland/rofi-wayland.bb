SUMMARY = "A window switcher, run dialog and dmenu replacement"
DESCRIPTION = "This is a fork of rofi with added support for Wayland via the layer shell protocol."
LICENSE = "MIT"

PV = "1.7.5+wayland1+git.1679493688.d06095b"

RPM_NAME = "rofi-wayland-1.7.5+wayland1+git.1679493688.d06095b-1.1.aarch64.rpm"
RPM_HASH = "299012410a7a169f6f7f861bfbc3d6ee5e2bbcbba05c659e9f6368dff8d884aeecabe43890180f9d2fbbad51ec987e2cbb9c2fa49cd56f254895c2607fbf7591"

RPROVIDES:${PN} += "rofi-launcher \
rofi-wayland"

RDEPENDS:${PN} += "/bin/bash \
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
libwayland-client.so.0 \
libwayland-cursor.so.0 \
libxkbcommon.so.0"

inherit rpm
