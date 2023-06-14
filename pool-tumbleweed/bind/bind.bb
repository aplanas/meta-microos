SUMMARY = "Domain Name System (DNS) Server (named)"
DESCRIPTION = "Berkeley Internet Name Domain (BIND) is an implementation of the Domain \
Name System (DNS) protocols and provides an openly redistributable \
reference implementation of the major components of the Domain Name \
System.  This package includes the components to operate a DNS server."
LICENSE = "MPL-2.0"

PV = "9.18.15"

RPM_NAME = "bind-9.18.15-1.1.aarch64.rpm"
RPM_HASH = "f0a20a2f441f3c9810489fbb60383510dc4354f0d2da15e765e744f6fb1aa1392b390608a6fa356aca6cdfb9d609f29c9a464d41a58f4565ef1e291c8c1d7ebb"

RPROVIDES:${PN} += "bind \
bind8 \
bind9 \
config-bind \
dns-daemon \
group-named \
user-named"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
bind-utils \
fillup \
ld-linux-aarch64.so.1 \
libbind9-9.18.15.so \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-9.18.15.so \
libisc-9.18.15.so \
libisccc-9.18.15.so \
libisccfg-9.18.15.so \
libjson-c.so.5 \
libmaxminddb.so.0 \
libnghttp2.so.14 \
libns-9.18.15.so \
libuv.so.1 \
libxml2.so.2 \
libz.so.1 \
sysuser-shadow"

inherit rpm
