SUMMARY = "Libraries for 'bind' and utilities to query and test DNS"
DESCRIPTION = "This package includes the utilities 'host', 'dig', and 'nslookup' used to \
test and query the Domain Name System (DNS) and also the libraries rquired \
for the base 'bind' package. The Berkeley Internet \
Name Domain (BIND) DNS server is found in the package named bind."
LICENSE = "MPL-2.0"

PV = "9.18.14"

RPM_NAME = "bind-utils-9.18.14-1.1.aarch64.rpm"
RPM_HASH = "ee2b6417958b64e59622d6bc0ec452d2ccc1cb3ac9d0d6543987cee7ab3cb7b2f93ec40a5175758a0bf49a4b6752b806a54b7f9c8c4c46b3088cc17cca7762e1"

RPROVIDES:${PN} += "bind-utils bind-utils(aarch-64) bind9-utils bindutil config(bind-utils) dns_utils libbind9-9.18.14.so()(64bit) libdns-9.18.14.so()(64bit) libirs-9.18.14.so()(64bit) libisc-9.18.14.so()(64bit) libisccc-9.18.14.so()(64bit) libisccfg-9.18.14.so()(64bit) libns-9.18.14.so()(64bit)"
RDEPENDS:${PN} += "/bin/bash /sbin/ldconfig ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libc.so.6(GLIBC_2.34)(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libgssapi_krb5.so.2()(64bit) libgssapi_krb5.so.2(gssapi_krb5_2_MIT)(64bit) libidn2.so.0()(64bit) libidn2.so.0(IDN2_0.0.0)(64bit) libjemalloc.so.2()(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libkrb5.so.3()(64bit) libkrb5.so.3(krb5_3_MIT)(64bit) libmaxminddb.so.0()(64bit) libnghttp2.so.14()(64bit) libssl.so.3()(64bit) libssl.so.3(OPENSSL_3.0.0)(64bit) libuv.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libz.so.1()(64bit)"

inherit rpm
