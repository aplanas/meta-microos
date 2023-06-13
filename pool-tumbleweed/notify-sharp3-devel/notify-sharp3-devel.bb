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

RPM_NAME = "notify-sharp3-devel-3.0.3-1.17.noarch.rpm"
RPM_HASH = "bc5c0e2e69af1362982926f98fc547825272b0eb7c2ca3da34512cdbe51f40147a5aeb03839b19fa5e83e1b9d6fb7df423bc89f2e840d8bfe88b380b318816c5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "notify-sharp3-devel \
pkgconfig(notify-sharp-3.0)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
notify-sharp3 \
pkgconfig(gtk-sharp-3.0)"

inherit rpm
