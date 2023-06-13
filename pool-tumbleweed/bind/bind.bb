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
bind(aarch-64) \
bind8 \
bind9 \
config(bind) \
dns_daemon \
group(named) \
user(named)"

RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/touch \
bind-utils \
fillup \
ld-linux-aarch64.so.1()(64bit) \
libbind9-9.18.15.so()(64bit) \
libc.so.6()(64bit) \
libcap.so.2()(64bit) \
libcrypto.so.3()(64bit) \
libdns-9.18.15.so()(64bit) \
libisc-9.18.15.so()(64bit) \
libisccc-9.18.15.so()(64bit) \
libisccfg-9.18.15.so()(64bit) \
libjson-c.so.5()(64bit) \
libmaxminddb.so.0()(64bit) \
libnghttp2.so.14()(64bit) \
libns-9.18.15.so()(64bit) \
libuv.so.1()(64bit) \
libxml2.so.2()(64bit) \
libz.so.1()(64bit) \
sysuser-shadow"

inherit rpm
