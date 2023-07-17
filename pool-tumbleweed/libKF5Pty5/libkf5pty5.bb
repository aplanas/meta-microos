SUMMARY = "Interfacing with pseudo terminal devices"
DESCRIPTION = "This library provides primitives to interface with pseudo terminal devices \
as well as a KProcess derived class for running child processes and \
communicating with them using a pty."
LICENSE = "LGPL-2.1-or-later"

PV = "5.108.0"

RPM_NAME = "libKF5Pty5-5.108.0-1.1.aarch64.rpm"
RPM_HASH = "e0304a9a473fe799df9ffadfe7eba67ae60460d0517615b9c70d4ead9e69d65b49d0c6437c5694f378c64eab5dc73c380ac3c81f7054af08c191b1bc028c2efe"

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
