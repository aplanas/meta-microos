SUMMARY = "Interfacing with pseudo terminal devices"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.107.0"

RPM_NAME = "libKF5Pty5-5.107.0-1.1.aarch64.rpm"
RPM_HASH = "208b3b5423062334427f2a13f3f1a4eb0bc06400ec8f8701406c8b2eb52d09ca285630c9c8cb74c1e123d8a80d326dd078e012f61f5e3b05878426d173a6654d"

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
