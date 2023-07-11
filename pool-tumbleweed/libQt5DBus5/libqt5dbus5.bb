SUMMARY = "Qt5 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-3.0-only | GPL-3.0-with-Qt-Company-Qt-exception-1.1"

PV = "5.15.10+kde129"

RPM_NAME = "libQt5DBus5-5.15.10+kde129-1.1.aarch64.rpm"
RPM_HASH = "75add5b8c3a8bcf35927ccffd2daf2dd4984de17bba14a7afbdfd4a2bca05af86ec478ca92a2c3702f037fcb73284dc909ae5b752e5443e432e82cdac955853b"

RPROVIDES:${PN} += "libQt5DBus.so.5 \
libQt5DBus5"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Core5 \
libc.so.6 \
libdbus-1.so.3 \
libstdc++.so.6"

inherit rpm
