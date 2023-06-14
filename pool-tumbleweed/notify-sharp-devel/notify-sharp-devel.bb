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

RPM_NAME = "notify-sharp-devel-0.4.0.r3032-10.9.noarch.rpm"
RPM_HASH = "a4329a1d7deb13bfea48f37d2319aded33eb8ee42d36912783203d8462a0fc4cfb20d3fc017ded7cf1fe02c06350f90de7ac077e216f5a051d4ba6c6075a4d90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "notify-sharp-devel \
pkgconfig-notify-sharp"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
notify-sharp \
pkgconfig-gtk-sharp-2.0"

inherit rpm
