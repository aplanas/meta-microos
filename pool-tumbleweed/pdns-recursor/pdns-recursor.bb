SUMMARY = "Modern, advanced and high performance recursing/non authoritative nameserver"
DESCRIPTION = "PowerDNS Recursor is a non authoritative/recursing DNS server. Use this \
package if you need a dns cache for your network. \
 \
 \
Authors: \
-------- \
    http://www.powerdns.com"
LICENSE = "GPL-2.0-or-later"

PV = "4.8.4"

RPM_NAME = "pdns-recursor-4.8.4-1.3.aarch64.rpm"
RPM_HASH = "261cadf9e5d9e38fc65e63973bf7453b6ecda5f590cf7741017ea56f614fea220d2ca77eca2f3075a8b1a1dc527a8ad303a04f735e42abf865ad8fef3ec910d8"

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
libstdc++.so.6 \
libsystemd.so.0 \
pdns-common \
shadow"

inherit rpm
