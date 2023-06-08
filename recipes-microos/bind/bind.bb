SUMMARY = "Domain Name System (DNS) Server (named)"
DESCRIPTION = "Berkeley Internet Name Domain (BIND) is an implementation of the Domain \
Name System (DNS) protocols and provides an openly redistributable \
reference implementation of the major components of the Domain Name \
System.  This package includes the components to operate a DNS server."
LICENSE = "MPL-2.0"

PV = "9.18.14"

RPM_NAME = "bind-9.18.14-1.1.aarch64.rpm"
RPM_HASH = "26d8778266db65402e50011b6568779588d020770130c359b2ba8ed42ae4919e8e2309c75169089c69fba1434877da94baefb81ea57ee7618b0cfb42f04df771"

RPROVIDES:${PN} += "bind bind(aarch-64) bind8 bind9 config(bind) dns_daemon group(named) user(named)"
RDEPENDS:${PN} += "/bin/bash /bin/sh /usr/bin/mkdir /usr/bin/perl /usr/bin/touch bind-utils fillup ld-linux-aarch64.so.1()(64bit) ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) libbind9-9.18.14.so()(64bit) libc.so.6(GLIBC_2.34)(64bit) libcap.so.2()(64bit) libcrypto.so.3()(64bit) libcrypto.so.3(OPENSSL_3.0.0)(64bit) libdns-9.18.14.so()(64bit) libisc-9.18.14.so()(64bit) libisccc-9.18.14.so()(64bit) libisccfg-9.18.14.so()(64bit) libjson-c.so.5()(64bit) libjson-c.so.5(JSONC_0.14)(64bit) libmaxminddb.so.0()(64bit) libnghttp2.so.14()(64bit) libns-9.18.14.so()(64bit) libuv.so.1()(64bit) libxml2.so.2()(64bit) libxml2.so.2(LIBXML2_2.4.30)(64bit) libxml2.so.2(LIBXML2_2.6.0)(64bit) libxml2.so.2(LIBXML2_2.6.3)(64bit) libz.so.1()(64bit) sysuser-shadow"

inherit rpm
