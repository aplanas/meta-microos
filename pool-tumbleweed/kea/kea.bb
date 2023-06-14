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

RPROVIDES:${PN} += "config-kea \
kea"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3 \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.40 \
libkea-cc.so.39 \
libkea-cfgclient.so.36 \
libkea-cryptolink.so.28 \
libkea-d2srv.so.16 \
libkea-database.so.35 \
libkea-dhcp++.so.54 \
libkea-dhcp-ddns.so.29 \
libkea-dhcpsrv.so.69 \
libkea-dns++.so.30 \
libkea-eval.so.39 \
libkea-exceptions.so.13 \
libkea-hooks.so.57 \
libkea-http.so.42 \
libkea-log.so.35 \
libkea-process.so.40 \
libkea-stats.so.18 \
libkea-util.so.52 \
libm.so.6 \
libstdc++.so.6 \
shadow"

inherit rpm
