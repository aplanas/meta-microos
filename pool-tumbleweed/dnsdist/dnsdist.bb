SUMMARY = "A highly DNS-, DoS- and abuse-aware loadbalancer"
DESCRIPTION = "dnsdist is a highly DNS-, DoS- and abuse-aware loadbalancer. Its goal in life \
is to route traffic to the best server, delivering top performance to \
legitimate users while shunting or blocking abusive traffic. \
 \
dnsdist is dynamic, in the sense that its configuration can be changed at \
runtime, and that its statistics can be queried from a console-like interface."
LICENSE = "GPL-2.0-only"

PV = "1.8.1"

RPM_NAME = "dnsdist-1.8.1-1.1.aarch64.rpm"
RPM_HASH = "eea2a93071b1e005f54c387485e3a68c764ab1cdadea9f21feb4a775a51bfc8f934f92d706436aaa21033150d52f23138438f1e1bd7efba32aca9b47f16a2502"

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
