SUMMARY = "Instrumentation System"
DESCRIPTION = "SystemTap is an instrumentation system for systems running Linux. \
Developers can write instrumentation to collect data on the operation \
of the system."
LICENSE = "GPL-2.0-or-later"

PV = "4.9"

RPM_NAME = "systemtap-4.9-1.2.aarch64.rpm"
RPM_HASH = "bde3777683177ad6b256b53448234218545026cc56f64938c3491559cf4587c551a39b57dd57984e6da63ffd3c8f64f3d9274c4b918b02a5fb0961b3712b2f08"

RPROVIDES:${PN} += "systemtap"

RDEPENDS:${PN} += "/usr/bin/bash \
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
