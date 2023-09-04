SUMMARY = "Interfacing with pseudo terminal devices"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.109.0"

RPM_NAME = "libKF5Pty5-5.109.0-1.1.aarch64.rpm"
RPM_HASH = "c1b648f4f8daee4765fa107af6c14eb801b8225aa7cf2c9a6fe21b4b0c701630da464f9567cf63ed08f92f61be0b1539ea74c43e8a358b5ae595aa4363479ea3"

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
