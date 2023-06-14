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

RPROVIDES:${PN} += "dbus-org.freedesktop.Notifications \
notify-osd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libX11.so.6 \
libatk-1.0.so.0 \
libc.so.6 \
libcairo.so.2 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libgdk-3.so.0 \
libgdk-pixbuf-2.0.so.0 \
libgio-2.0.so.0 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libgtk-3.so.0 \
libm.so.6 \
libpango-1.0.so.0 \
libpangocairo-1.0.so.0 \
libpixman-1.so.0 \
libwnck-3.so.0"

inherit rpm
