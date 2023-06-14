SUMMARY = "Plugin to display information from applications in the Xfce panel"
DESCRIPTION = "A small plugin to display information from various applications \
consistently in the Xfce panel as described in \
Ubuntu's MessagingMenu design specification."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "xfce4-panel-plugin-indicator-2.4.1-1.7.aarch64.rpm"
RPM_HASH = "907329ad0f1a923a21eca9e5354070e8fae0a3c3ac4299c7026706303d0f1951ec5bca3396431a1c7e5d4cd1348a77bb2f8adf659204eac77c2d773e95da3e4a"

RPROVIDES:${PN} += "ayatana-indicator-renderer \
libindicator-plugin.so \
xfce4-panel-plugin-indicator"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libayatana-ido3-0.4.so.0 \
libayatana-indicator3.so.7 \
libc.so.6 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libxfce4panel-2.0.so.4 \
libxfce4ui-2.so.0 \
libxfce4util.so.7 \
libxfconf-0.so.3 \
xfce4-panel"

inherit rpm
