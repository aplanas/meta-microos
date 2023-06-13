SUMMARY = "Plugin to display information from applications in the Xfce panel"
DESCRIPTION = "A small plugin to display information from various applications \
consistently in the Xfce panel as described in \
Ubuntu's MessagingMenu design specification."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.1"

RPM_NAME = "xfce4-panel-plugin-indicator-2.4.1-1.7.aarch64.rpm"
RPM_HASH = "907329ad0f1a923a21eca9e5354070e8fae0a3c3ac4299c7026706303d0f1951ec5bca3396431a1c7e5d4cd1348a77bb2f8adf659204eac77c2d773e95da3e4a"

RPROVIDES:${PN} += "ayatana-indicator-renderer \
libindicator-plugin.so()(64bit) \
xfce4-panel-plugin-indicator \
xfce4-panel-plugin-indicator(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libayatana-ido3-0.4.so.0()(64bit) \
libayatana-indicator3.so.7()(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
xfce4-panel"

inherit rpm
