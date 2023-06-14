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

PV = "3.0.3"

RPM_NAME = "notify-sharp3-3.0.3-1.17.noarch.rpm"
RPM_HASH = "6bb7c4f83fb3a34dee960f1926ea2df49d4f7996fe3312856956db42c4d705c5b25b4add68f53ae90f1e9688af3615122a4f146a7d982c4ca1fb8a55d2ca1118"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mono-notify-sharp \
notify-sharp3"

RDEPENDS:${PN} += "mono-dbus-sharp \
mono-dbus-sharp-glib \
mono-gdk-sharp \
mono-glib-sharp \
mono-gtk-sharp \
mono-mscorlib"

inherit rpm
