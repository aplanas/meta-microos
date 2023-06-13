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

RPROVIDES:${PN} += "bundled(json11) \
bundled(luawrapper) \
bundled(probds) \
bundled(protozero) \
bundled(yahttp) \
config(pdns-recursor) \
pdns-recursor \
pdns-recursor(aarch-64)"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1()(64bit) \
libboost_context.so.1.82.0()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgcc_s.so.1()(64bit) \
liblua5.4.so.5()(64bit) \
libm.so.6()(64bit) \
libnetsnmp.so.40()(64bit) \
libnetsnmpagent.so.40()(64bit) \
libsodium.so.23()(64bit) \
libstdc++.so.6()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
pdns-common \
shadow"

inherit rpm
