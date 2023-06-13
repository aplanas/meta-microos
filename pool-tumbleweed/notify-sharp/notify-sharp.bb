SUMMARY = "A C# client implementation for Desktop Notifications"
DESCRIPTION = "notify-sharp is a C# client implementation for Desktop Notifications, \
i.e. notification-daemon. It is inspired by the libnotify API. \
 \
Desktop Notifications provide a standard way of doing passive pop-up \
notifications on the Linux desktop. These are designed to notify the \
user of something without interrupting their work with a dialog box \
that they must close. Passive popups can automatically disappear after \
a short period of time."
LICENSE = "MIT"

PV = "0.4.0.r3032"

RPM_NAME = "notify-sharp-0.4.0.r3032-10.9.noarch.rpm"
RPM_HASH = "394dadf69891469e577b4b079aa9f358bc9c1baa7d09dfabae7da5219ee18a5e08cf9ff6df4d3e7cc06b1b48d78913c9008f184573eb363e9564ef0ea6cf15ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono(notify-sharp) \
notify-sharp"

RDEPENDS:${PN} += "mono(dbus-sharp) \
mono(dbus-sharp-glib) \
mono(gdk-sharp) \
mono(glib-sharp) \
mono(gtk-sharp) \
mono(mscorlib)"

inherit rpm
