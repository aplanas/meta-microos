SUMMARY = "A repository storing auto-generated Qt5 D-Bus code"
DESCRIPTION = "dde-qt-dbus-factory is a repository storing auto-generated Qt5 D-Bus \
code. This can help DDE developers not having to copy code from other \
projects or re-generate code for the same D-Bus interface for new \
projects."
LICENSE = "GPL-3.0-or-later"

PV = "5.5.22"

RPM_NAME = "libdframeworkdbus2-5.5.22-1.7.aarch64.rpm"
RPM_HASH = "4bef669edc4686a19cc8020402abe1fdf01fc8a14310b2d5e21a0439a4bc573be48807d14f2e5dd0d9f2f091c167bf15aff5b9f68dbfc71acfaed6e3f7f16378"

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
