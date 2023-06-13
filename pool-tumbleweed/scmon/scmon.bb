SUMMARY = "Smartcard hardware event monitor"
DESCRIPTION = "SCMon monitors smart cards, configured in a system-wide nss database, \
and broadcasts their insertion/removal over D-Bus. It also supports a \
few simple queries."
LICENSE = "GPL-2.0-only"

PV = "0.4"

RPM_NAME = "scmon-0.4-10.15.aarch64.rpm"
RPM_HASH = "2016de0feed4c4f1c3207b4319d53ce2cd362095534a6d6a3bfcb392df4f5f746daf728312a8dc4c6d62ae68f804c99fd988241f4c3d4e4f93b50c67216d0fe1"

RPROVIDES:${PN} += "config(scmon) \
scmon \
scmon(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libdbus-1.so.3()(64bit) \
libdbus-1.so.3(LIBDBUS_1_3)(64bit) \
libdbus-glib-1.so.2()(64bit) \
libglib-2.0.so.0()(64bit) \
libgobject-2.0.so.0()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
systemd"

inherit rpm
