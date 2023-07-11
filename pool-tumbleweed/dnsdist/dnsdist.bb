SUMMARY = "A highly DNS-, DoS- and abuse-aware loadbalancer"
DESCRIPTION = "dnsdist is a highly DNS-, DoS- and abuse-aware loadbalancer. Its goal in life \
is to route traffic to the best server, delivering top performance to \
legitimate users while shunting or blocking abusive traffic. \
 \
dnsdist is dynamic, in the sense that its configuration can be changed at \
runtime, and that its statistics can be queried from a console-like interface."
LICENSE = "GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "dnsdist-1.8.0-2.2.aarch64.rpm"
RPM_HASH = "e34410881d611df8aea9acd435f9f32a3294534afb0eb586a41110f13672981aaeba3aa0c0dd4a09d1ac8c1c22d960ff44252215d56fe75c295ddc3237ce15f1"

RPROVIDES:${PN} += "config-dnsdist \
dnsdist"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libedit.so.0 \
libfstrm.so.0 \
libgcc-s.so.1 \
liblmdb-0.9.30.so \
libluajit-5.1.so.2 \
libm.so.6 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
libnghttp2.so.14 \
libre2.so.10 \
libsodium.so.23 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
