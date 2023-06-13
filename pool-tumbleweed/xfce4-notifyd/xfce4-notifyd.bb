SUMMARY = "Simple Notification Daemon for Xfce"
DESCRIPTION = "Xfce4-notifyd is a simple, visually-appealing notification daemon for Xfce that \
implements the Freedesktop.org Desktop Notifications Specification."
LICENSE = "GPL-2.0-only"

PV = "0.8.2"

RPM_NAME = "xfce4-notifyd-0.8.2-1.3.aarch64.rpm"
RPM_HASH = "7c6085748b247f578ab44a2d3596ac7257a84115c33bdda493c2bbf3eef617c01ca0190151733152c23ed4353dffd5f660383683e98a14df8431087675326cc3"

RPROVIDES:${PN} += "application() \
application(xfce4-notifyd-config.desktop) \
libnotification-plugin.so()(64bit) \
notification-daemon-xfce \
xfce4-notifyd \
xfce4-notifyd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libnotify-tools \
libnotify.so.4()(64bit) \
libsqlite3.so.0()(64bit) \
libxfce4panel-2.0.so.4()(64bit) \
libxfce4ui-2.so.0()(64bit) \
libxfce4util.so.7()(64bit) \
libxfconf-0.so.3()(64bit) \
xfce4-notifyd-branding"

inherit rpm
