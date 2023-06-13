SUMMARY = "Smart Bookmark Plugin for the Xfce Panel"
DESCRIPTION = "The Smartbookmark plugin follows the smart bookmark concept and allows users to \
send requests to websites through default browser."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "xfce4-smartbookmark-plugin-0.5.2-1.12.aarch64.rpm"
RPM_HASH = "f780b1e1a4b690ab075bdb7959daf018b03c1166a8ed9e8eeef91ae6777cab5e33171722718a8ec43c6d4405947c2acab08efb9142cba566dd041259e9df031a"

RPROVIDES:${PN} += "libsmartbookmark.so()(64bit) \
xfce4-panel-plugin-smartbookmark \
xfce4-smartbookmark-plugin \
xfce4-smartbookmark-plugin(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libgdk-3.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
xfce4-panel"

inherit rpm
