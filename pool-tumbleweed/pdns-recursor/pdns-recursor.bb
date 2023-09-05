SUMMARY = "Modern, advanced and high performance recursing/non authoritative nameserver"
DESCRIPTION = "PowerDNS Recursor is a non authoritative/recursing DNS server. Use this \
package if you need a dns cache for your network. \
 \
 \
Authors: \
-------- \
    http://www.powerdns.com"
LICENSE = "GPL-2.0-or-later"

PV = "4.9.1"

RPM_NAME = "pdns-recursor-4.9.1-1.1.aarch64.rpm"
RPM_HASH = "bd89925c227be644425c43a69c26341d461b68978c01737ef21a1f0b7c00f9a73b6cb9e21b1f9680206c03076f4ce2b981794daafab013916aad3a471be8204d"

RPROVIDES:${PN} += "bundled-json11 \
bundled-luawrapper \
bundled-probds \
bundled-protozero \
bundled-yahttp \
config-pdns-recursor \
pdns-recursor"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libboost-context.so.1.82.0 \
libc.so.6 \
libcrypto.so.3 \
libgcc-s.so.1 \
liblua5.4.so.5 \
libm.so.6 \
libnetsnmp.so.40 \
libnetsnmpagent.so.40 \
libsodium.so.23 \
libssl.so.3 \
libstdc++.so.6 \
libsystemd.so.0 \
pdns-common \
shadow"

inherit rpm
