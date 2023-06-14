SUMMARY = "A system for distributed real-time performance and health monitoring"
DESCRIPTION = "netdata is a system for distributed real-time performance and health monitoring. \
It provides insights, in real-time, of everything happening on the system it \
runs on (including applications such as web and database servers), \
using interactive web dashboards."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & MIT & BSD-3-Clause & LGPL-2.1-or-later & OFL-1.1 & CC-BY-4.0 & WTFPL"

PV = "1.39.1"

RPM_NAME = "netdata-1.39.1-1.1.aarch64.rpm"
RPM_HASH = "0990760afcb791fa75a794eb727c05c95c7c2478c7482b8c20d4440bbd49a4e77e3f75f2f31f160bdd7bec3612474db4efc98d55e8b47cae1b8a433cb132876c"

RPROVIDES:${PN} += "config-netdata \
netdata"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libcups.so.2 \
libgcc-s.so.1 \
libjson-c.so.5 \
liblz4.so.1 \
libm.so.6 \
libmnl.so.0 \
libnetfilter-acct.so.1 \
libprotobuf-3.21.12.so \
libsnappy.so.1 \
libssl.so.3 \
libstdc++.so.6 \
libuuid.so.1 \
libuv.so.1 \
libxenlight.so.4.17 \
libxenstat.so.4.17 \
libz.so.1 \
shadow"

inherit rpm
