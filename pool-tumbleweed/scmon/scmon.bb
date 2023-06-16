SUMMARY = "Smartcard hardware event monitor"
DESCRIPTION = "SCMon monitors smart cards, configured in a system-wide nss database, \
and broadcasts their insertion/removal over D-Bus. It also supports a \
few simple queries."
LICENSE = "GPL-2.0-only"

PV = "0.4"

RPM_NAME = "scmon-0.4-10.15.aarch64.rpm"
RPM_HASH = "2016de0feed4c4f1c3207b4319d53ce2cd362095534a6d6a3bfcb392df4f5f746daf728312a8dc4c6d62ae68f804c99fd988241f4c3d4e4f93b50c67216d0fe1"

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
