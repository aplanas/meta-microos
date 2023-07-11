SUMMARY = "A system for distributed real-time performance and health monitoring"
DESCRIPTION = "netdata is a system for distributed real-time performance and health monitoring. \
It provides insights, in real-time, of everything happening on the system it \
runs on (including applications such as web and database servers), \
using interactive web dashboards."
LICENSE = "Apache-2.0 & BSD-2-Clause & GPL-3.0-or-later & MIT & BSD-3-Clause & LGPL-2.1-or-later & OFL-1.1 & CC-BY-4.0 & WTFPL"

PV = "1.39.1"

RPM_NAME = "netdata-1.39.1-1.3.aarch64.rpm"
RPM_HASH = "4049a05a388713a92e6dde4116617f73abac990b29ec2fac42fe4a21b5931503e76dbf946337562bb70c94b04571874b5276c68ba3db7801d386ae7c4c2b829d"

RPROVIDES:${PN} += "config-netdata \
netdata"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/sh \
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
