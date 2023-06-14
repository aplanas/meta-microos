SUMMARY = "A repository storing auto-generated Qt5 D-Bus code"
DESCRIPTION = "dde-qt-dbus-factory is a repository storing auto-generated Qt5 D-Bus \
code. This can help DDE developers not having to copy code from other \
projects or re-generate code for the same D-Bus interface for new \
projects."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.22"

RPM_NAME = "libdframeworkdbus2-5.5.22-1.6.aarch64.rpm"
RPM_HASH = "c74c4401f53074e00d441d4ed9fea6daa8ef4e1ecb66432a8bd138f2b672def4ec0f4c1d73bb617afdafec0dd40c33a7ba0aa15963591f6cb94ef2066faad9e7"

RPROVIDES:${PN} += "libdframeworkdbus.so.2 \
libdframeworkdbus2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5DBus.so.5 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
