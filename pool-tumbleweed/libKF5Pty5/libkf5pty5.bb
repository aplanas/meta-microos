SUMMARY = "Interfacing with pseudo terminal devices"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Pty5-5.106.0-1.1.aarch64.rpm"
RPM_HASH = "c042ffaae96bdd28ca030ae74be7c9874457df2aab3e54b2df0ca3bbfd9ed827987cd84fbaf74877b79f50357718beaaeb2d772b5bfad89d4542fcc5b9b6cbac"

RPROVIDES:${PN} += "libKF5Pty.so.5 \
libKF5Pty5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libKF5CoreAddons.so.5 \
libKF5I18n.so.5 \
libQt5Core.so.5 \
libc.so.6 \
libstdc++.so.6"

inherit rpm
