SUMMARY = "Streamlined Notification Daemon"
DESCRIPTION = "This notification daemon is an alternative to the \
mate-notification-daemon package. It follows the freedesktop \
notification specification and introduces some new policies for \
streamlining the user-experience by discouraging the use of actions \
and timeouts."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.35~bzr20191129"

RPM_NAME = "notify-osd-0.9.35~bzr20191129-1.16.aarch64.rpm"
RPM_HASH = "7c752a08ac8d0833ec7495dcdce8c72aa52a7dd9e05c42ff588b1273755760b61d39a7a6dfefd8135878550572e2cd87eec369a7df26a03f5f3c359feb1dd089"

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
