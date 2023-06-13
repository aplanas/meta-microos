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

RPROVIDES:${PN} += "config(dnsdist) \
dnsdist \
dnsdist(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libedit.so.0()(64bit) \
libfstrm.so.0()(64bit) \
libgcc_s.so.1()(64bit) \
liblmdb-0.9.30.so()(64bit) \
libluajit-5.1.so.2()(64bit) \
libm.so.6()(64bit) \
libnetsnmp.so.40()(64bit) \
libnetsnmpagent.so.40()(64bit) \
libnghttp2.so.14()(64bit) \
libre2.so.10()(64bit) \
libsodium.so.23()(64bit) \
libssl.so.3()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
sysuser-shadow"

inherit rpm
