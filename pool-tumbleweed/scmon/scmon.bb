SUMMARY = "Smartcard hardware event monitor"
DESCRIPTION = "SCMon monitors smart cards, configured in a system-wide nss database, \
and broadcasts their insertion/removal over D-Bus. It also supports a \
few simple queries."
LICENSE = "GPL-2.0-only"

PV = "0.4"

RPM_NAME = "scmon-0.4-10.16.aarch64.rpm"
RPM_HASH = "ac644b40a31fa09eb7c242c6594523e191d72eac30ff9d14404551776edf82d314220ac31b9d33b800fb124bc8b2ace5e09feceef4c2e9fa63d620c8487b1737"

RPROVIDES:${PN} += "config-scmon \
scmon"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libdbus-1.so.3 \
libdbus-glib-1.so.2 \
libglib-2.0.so.0 \
libgobject-2.0.so.0 \
libnspr4.so \
libnss3.so \
systemd"

inherit rpm
