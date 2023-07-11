SUMMARY = "Dynamic Host Configuration Protocol daemon"
DESCRIPTION = "Kea is a new DHCPv4/DHCPv6 server being developed by ISC in C++, a \
continuation of the DHCP server in the (ended) BIND10 project. The \
objective of this project is to provide a very high-performance, \
extensible DHCP server engine for use by enterprises and service \
providers, either as-is or with extensions and modifications."
LICENSE = "MPL-2.0"

PV = "2.2.0"

RPM_NAME = "kea-2.2.0-2.6.aarch64.rpm"
RPM_HASH = "3367fff6902e9511134a83aaa3944c0839f95681f48a3d41bef6488a92cb79b36e1363db9e08687200d963d31bc993c5ea76f67fd6cd02f845f94f1c02e7a142"

RPROVIDES:${PN} += "config-kea \
kea"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
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
