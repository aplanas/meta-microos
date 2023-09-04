SUMMARY = "Libraries for 'bind' and utilities to query and test DNS"
DESCRIPTION = "This package includes the utilities 'host', 'dig', and 'nslookup' used to \
test and query the Domain Name System (DNS) and also the libraries rquired \
for the base 'bind' package. The Berkeley Internet \
Name Domain (BIND) DNS server is found in the package named bind."
LICENSE = "MPL-2.0"

PV = "9.18.18"

RPM_NAME = "bind-utils-9.18.18-1.1.aarch64.rpm"
RPM_HASH = "5c59b075eadfe1d2d18d5b136eddf258bee887c3b72a99f8569a6b1d0655361e042013b3d2e7c0dfbad04f5f9b9261165c8e0453a2c0030077cc839fbffc66c2"

RPROVIDES:${PN} += "bind-utils \
bind9-utils \
bindutil \
config-bind-utils \
dns-utils \
libbind9-9.18.18.so \
libdns-9.18.18.so \
libirs-9.18.18.so \
libisc-9.18.18.so \
libisccc-9.18.18.so \
libisccfg-9.18.18.so \
libns-9.18.18.so"

RDEPENDS:${PN} += "/sbin/ldconfig \
/usr/bin/bash \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypto.so.3 \
libfstrm.so.0 \
libgssapi-krb5.so.2 \
libidn2.so.0 \
libjemalloc.so.2 \
libjson-c.so.5 \
libkrb5.so.3 \
libmaxminddb.so.0 \
libnghttp2.so.14 \
libprotobuf-c.so.1 \
libssl.so.3 \
libuv.so.1 \
libuv1 \
libxml2.so.2 \
libz.so.1"

inherit rpm
