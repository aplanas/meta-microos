SUMMARY = "A highly DNS-, DoS- and abuse-aware loadbalancer"
DESCRIPTION = "dnsdist is a highly DNS-, DoS- and abuse-aware loadbalancer. Its goal in life \
is to route traffic to the best server, delivering top performance to \
legitimate users while shunting or blocking abusive traffic. \
 \
dnsdist is dynamic, in the sense that its configuration can be changed at \
runtime, and that its statistics can be queried from a console-like interface."
LICENSE = "GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "dnsdist-1.8.0-2.3.aarch64.rpm"
RPM_HASH = "01c9584e38d17eb549e4f3f82bb274e02beff3014f35865c3c0ffeb33b6f43f3a5f0680f2c5dc423e37a20d761c1621e3be48b5c85293e9ec56ea71b07afc672"

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
libre2.so.11 \
libsodium.so.23 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
sysuser-shadow"

inherit rpm
