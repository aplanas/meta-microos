SUMMARY = "A highly DNS-, DoS- and abuse-aware loadbalancer"
DESCRIPTION = "dnsdist is a highly DNS-, DoS- and abuse-aware loadbalancer. Its goal in life \
is to route traffic to the best server, delivering top performance to \
legitimate users while shunting or blocking abusive traffic. \
 \
dnsdist is dynamic, in the sense that its configuration can be changed at \
runtime, and that its statistics can be queried from a console-like interface."
LICENSE = "GPL-2.0-only"

PV = "1.8.0"

RPM_NAME = "dnsdist-1.8.0-2.1.aarch64.rpm"
RPM_HASH = "f1e6db34e6fcf0a60f5865c94df6e63a85c918a005dac51d024e39d550b73a439dcfe1e301b8d5b4776ea02fee7c5fdf758ca7ebbb081c278a8c1b3e0cb7c98b"

RPROVIDES:${PN} += "config-dnsdist \
dnsdist"

RDEPENDS:${PN} += "/bin/sh \
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
