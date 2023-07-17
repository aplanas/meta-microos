SUMMARY = "Qt6 D-Bus library"
DESCRIPTION = "The Qt D-Bus module is a library that can be used to perform \
inter-process communication using the D-Bus protocol."
LICENSE = "LGPL-2.1-with-Qt-Company-Qt-exception-1.1 | LGPL-3.0-only"

PV = "6.5.1"

RPM_NAME = "libQt6DBus6-6.5.1-4.1.aarch64.rpm"
RPM_HASH = "117524447cefec08b50e866f519bd9ed91cb34d97fdc09c31b8eb7de8ba6f86c526beef953297489f515ae67ee75b10f51e082c9257104e818bcfb43b66b3058"

RPROVIDES:${PN} += "libQt6DBus.so.6 \
libQt6DBus6"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt6Core.so.6 \
libQt6Core6 \
libc.so.6 \
libdbus-1.so.3 \
libstdc++.so.6"

inherit rpm
