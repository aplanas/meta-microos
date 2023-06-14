SUMMARY = "Libraries for 'bind' and utilities to query and test DNS"
DESCRIPTION = "This package includes the utilities 'host', 'dig', and 'nslookup' used to \
test and query the Domain Name System (DNS) and also the libraries rquired \
for the base 'bind' package. The Berkeley Internet \
Name Domain (BIND) DNS server is found in the package named bind."
LICENSE = "MPL-2.0"

PV = "9.18.15"

RPM_NAME = "bind-utils-9.18.15-1.1.aarch64.rpm"
RPM_HASH = "bb1fb3f43fd984f0acbebb383f9edc1ad44b8bd7aa075ab6ed6fbba624bb3505770b00f52aa2a5e6f6ea03b6f901ec4811b787e9e9358f37adb4ebee40152dc6"

RPROVIDES:${PN} += "bind-utils \
bind9-utils \
bindutil \
config-bind-utils \
dns-utils \
libbind9-9.18.15.so \
libdns-9.18.15.so \
libirs-9.18.15.so \
libisc-9.18.15.so \
libisccc-9.18.15.so \
libisccfg-9.18.15.so \
libns-9.18.15.so"

RDEPENDS:${PN} += "/bin/bash \
/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
libjemalloc.so.2 \
libjson-c.so.5 \
libkrb5.so.3 \
libmaxminddb.so.0 \
libnghttp2.so.14 \
libssl.so.3 \
libuv.so.1 \
libxml2.so.2 \
libz.so.1"

inherit rpm
