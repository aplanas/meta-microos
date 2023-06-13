SUMMARY = "Dynamic Host Configuration Protocol daemon"
DESCRIPTION = "Kea is a new DHCPv4/DHCPv6 server being developed by ISC in C++, a \
continuation of the DHCP server in the (ended) BIND10 project. The \
objective of this project is to provide a very high-performance, \
extensible DHCP server engine for use by enterprises and service \
providers, either as-is or with extensions and modifications."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "kea-2.2.0-2.4.aarch64.rpm"
RPM_HASH = "35c7f0dbbd71dabdbfc903b3e27c42a5e80f557110d81940bda514f4ac6f27cc508ccf52af3fc43c9b6d1e9f89a6e053252134ef53e1f4a08205f1157b6e919f"

RPROVIDES:${PN} += "config(kea) \
kea \
kea(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
libkea-asiolink.so.40()(64bit) \
libkea-cc.so.39()(64bit) \
libkea-cfgclient.so.36()(64bit) \
libkea-cryptolink.so.28()(64bit) \
libkea-d2srv.so.16()(64bit) \
libkea-database.so.35()(64bit) \
libkea-dhcp++.so.54()(64bit) \
libkea-dhcp_ddns.so.29()(64bit) \
libkea-dhcpsrv.so.69()(64bit) \
libkea-dns++.so.30()(64bit) \
libkea-eval.so.39()(64bit) \
libkea-exceptions.so.13()(64bit) \
libkea-hooks.so.57()(64bit) \
libkea-http.so.42()(64bit) \
libkea-log.so.35()(64bit) \
libkea-process.so.40()(64bit) \
libkea-stats.so.18()(64bit) \
libkea-util.so.52()(64bit) \
libm.so.6()(64bit) \
libstdc++.so.6()(64bit) \
shadow"

inherit rpm
