SUMMARY = "Instrumentation System"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
Developers can write instrumentation to collect data on the operation \
of the system."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-4.9-1.1.aarch64.rpm"
RPM_HASH = "b80ff39a8518f353942a46dbdfe57badc48e119062714720b70616363db51c7e482d129255b8399ba055e8debc3e6a5a6ce6e6e74b9df4fa5ee7fc6d57b13f0f"

RPROVIDES:${PN} += "systemtap"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6 \
libdw.so.1 \
libelf.so.1 \
libgcc-s.so.1 \
libjson-c.so.5 \
libm.so.6 \
libnspr4.so \
libnss3.so \
libsqlite3.so.0 \
libssl3.so \
libstdc++.so.6 \
systemtap-dtrace \
systemtap-runtime"

inherit rpm
