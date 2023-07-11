SUMMARY = "The D-Bus responder of sssd"
DESCRIPTION = "Provides the D-Bus responder of sssd, called InfoPipe, which allows \
information from sssd to be transmitted over the system bus."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.1"

RPM_NAME = "sssd-dbus-2.9.1-1.1.aarch64.rpm"
RPM_HASH = "6b889a69fc44d744e7262a1f5cc5e5265ffed70b7484436e0630302cb60b7638eea3503cdcba7c43f673e91150600eaf23aadd3388aa61e8c817d20aeaca4bc8"

RPROVIDES:${PN} += "sssd-dbus"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdhash.so.1 \
libifp-iface.so \
libldb.so.2 \
libpopt.so.0 \
libselinux.so.1 \
libsss-cert.so \
libsss-child.so \
libsss-debug.so \
libsss-iface.so \
libsss-sbus.so \
libsss-util.so \
libsystemd.so.0 \
libtalloc.so.2 \
libtdb.so.1 \
libtevent.so.0 \
sssd"

inherit rpm
