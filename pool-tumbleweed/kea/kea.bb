SUMMARY = "Dynamic Host Configuration Protocol daemon"
DESCRIPTION = "Kea is a new DHCPv4/DHCPv6 server being developed by ISC in C++, a \
continuation of the DHCP server in the (ended) BIND10 project. The \
objective of this project is to provide a very high-performance, \
extensible DHCP server engine for use by enterprises and service \
providers, either as-is or with extensions and modifications."
LICENSE = "MPL-2.0"

PV = "2.4.0"

RPM_NAME = "kea-2.4.0-1.1.aarch64.rpm"
RPM_HASH = "8c3bbcbbeb72e3929b4d11559b59d58becc7ff157b9f3c8215e31f896638d4917afe6c1079483d46ba3804a9036e503204de1577eda6a9c6311299eadcaddca3"

RPROVIDES:${PN} += "config-kea \
kea"

RDEPENDS:${PN} += "/usr/bin/python3 \
/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
libkea-asiolink.so.56 \
libkea-cc.so.54 \
libkea-cfgclient.so.51 \
libkea-cryptolink.so.38 \
libkea-d2srv.so.30 \
libkea-database.so.48 \
libkea-dhcp++.so.73 \
libkea-dhcp-ddns.so.41 \
libkea-dhcpsrv.so.89 \
libkea-dns++.so.42 \
libkea-eval.so.52 \
libkea-exceptions.so.23 \
libkea-hooks.so.77 \
libkea-http.so.56 \
libkea-log.so.48 \
libkea-process.so.57 \
libkea-stats.so.29 \
libkea-util.so.68 \
libm.so.6 \
libstdc++.so.6 \
shadow"

inherit rpm
