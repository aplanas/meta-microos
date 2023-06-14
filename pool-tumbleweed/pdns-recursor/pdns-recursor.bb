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

RPM_NAME = "pdns-recursor-4.8.4-1.2.aarch64.rpm"
RPM_HASH = "4d9d684ffdad5910aa5b85591407cb7d2f649aff456e4dab544798359db43001d3de1fabd03dd87656aff8bece35807db25fbe1ec1cc6984542cb6c7f66461ff"

RPROVIDES:${PN} += "bundled-json11 \
bundled-luawrapper \
bundled-probds \
bundled-protozero \
bundled-yahttp \
config-pdns-recursor \
pdns-recursor"

RDEPENDS:${PN} += "/bin/sh \
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
