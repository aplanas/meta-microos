SUMMARY = "Instrumentation System"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
Developers can write instrumentation to collect data on the operation \
of the system."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-4.9-1.1.aarch64.rpm"
RPM_HASH = "b80ff39a8518f353942a46dbdfe57badc48e119062714720b70616363db51c7e482d129255b8399ba055e8debc3e6a5a6ce6e6e74b9df4fa5ee7fc6d57b13f0f"

RPROVIDES:${PN} += "systemtap \
systemtap(aarch-64)"

RDEPENDS:${PN} += "/bin/bash \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit) \
libdw.so.1()(64bit) \
libelf.so.1()(64bit) \
libgcc_s.so.1()(64bit) \
libjson-c.so.5()(64bit) \
libm.so.6()(64bit) \
libnspr4.so()(64bit) \
libnss3.so()(64bit) \
libsqlite3.so.0()(64bit) \
libssl3.so()(64bit) \
libstdc++.so.6()(64bit) \
systemtap-dtrace \
systemtap-runtime"

inherit rpm
