SUMMARY = "The D-Bus responder of sssd"
DESCRIPTION = "Provides the D-Bus responder of sssd, called InfoPipe, which allows \
information from sssd to be transmitted over the system bus."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.0"

RPM_NAME = "sssd-dbus-2.9.0-1.1.aarch64.rpm"
RPM_HASH = "228e1e869e1d7c372cf6c789e79049085ed6ca0aa1b64e0fbcabd687a572a2448fe196b5b9e13f7fd4c0494b41884752fff097fc4216e856160f9e3d20e0f1cb"

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
