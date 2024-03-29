SUMMARY = "The D-Bus responder of sssd"
DESCRIPTION = "Provides the D-Bus responder of sssd, called InfoPipe, which allows \
information from sssd to be transmitted over the system bus."
LICENSE = "GPL-3.0-or-later"

PV = "2.9.2"

RPM_NAME = "sssd-dbus-2.9.2-1.1.aarch64.rpm"
RPM_HASH = "be09e9a7baf71ca707414dc2213cd6d720a1af41f834f2aea21ea048382b84d15b5ac3e548a258d09f72a4a10692a3a4226a6591cbf4b4695e26988cbad7c0fd"

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
