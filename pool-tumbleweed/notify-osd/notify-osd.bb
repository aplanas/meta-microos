SUMMARY = "Streamlined Notification Daemon"
DESCRIPTION = "This notification daemon is an alternative to the \
mate-notification-daemon package. It follows the freedesktop \
notification specification and introduces some new policies for \
streamlining the user-experience by discouraging the use of actions \
and timeouts."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.35~bzr20191129"

RPM_NAME = "notify-osd-0.9.35~bzr20191129-1.15.aarch64.rpm"
RPM_HASH = "ee6fbe17570cb787b11cc519c6129f0bb9def2c655be07aade8b18c67016db596abd4232b88827d89701cad8737c441b8aacb6f98fc41f6e7771447c9fc0ce30"

RPROVIDES:${PN} += "dbus(org.freedesktop.Notifications) \
notify-osd \
notify-osd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libatk-1.0.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libcairo.so.2()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libgdk-3.so.0()(64bit) \
libgdk_pixbuf-2.0.so.0()(64bit) \
libgio-2.0.so.0()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libgtk-3.so.0()(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.27)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libpango-1.0.so.0()(64bit) \
libpangocairo-1.0.so.0()(64bit) \
libpixman-1.so.0()(64bit) \
libwnck-3.so.0()(64bit)"

inherit rpm
