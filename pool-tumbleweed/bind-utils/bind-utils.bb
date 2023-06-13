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
bind-utils(aarch-64) \
bind9-utils \
bindutil \
config(bind-utils) \
dns_utils \
libbind9-9.18.15.so()(64bit) \
libdns-9.18.15.so()(64bit) \
libirs-9.18.15.so()(64bit) \
libisc-9.18.15.so()(64bit) \
libisccc-9.18.15.so()(64bit) \
libisccfg-9.18.15.so()(64bit) \
libns-9.18.15.so()(64bit)"

RDEPENDS:${PN} += "/bin/bash \
/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libcrypto.so.3()(64bit) \
libgssapi_krb5.so.2()(64bit) \
libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) \
libidn2.so.0()(64bit) \
libjemalloc.so.2()(64bit) \
libjson-c.so.5()(64bit) \
libkrb5.so.3()(64bit) \
libkrb5.so.3(krb5_3_MIT)(64bit) \
libmaxminddb.so.0()(64bit) \
libnghttp2.so.14()(64bit) \
libssl.so.3()(64bit) \
libuv.so.1()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit)"

inherit rpm
