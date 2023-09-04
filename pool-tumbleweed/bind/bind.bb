SUMMARY = "Domain Name System (DNS) Server (named)"
DESCRIPTION = "Berkeley Internet Name Domain (BIND) is an implementation of the Domain \
Name System (DNS) protocols and provides an openly redistributable \
reference implementation of the major components of the Domain Name \
System.  This package includes the components to operate a DNS server."
LICENSE = "MPL-2.0"

PV = "9.18.18"

RPM_NAME = "bind-9.18.18-1.1.aarch64.rpm"
RPM_HASH = "3fc39ffb43c73ec0f540cf55d9ff2bea0ce9c02d6e9671931af1c3e58fea3012735cd9977287149617d3594770e9adb8a28f2ab36240ca0fa42fb9ad3829c19c"

RPROVIDES:${PN} += "bind \
bind8 \
bind9 \
config-bind \
dns-daemon \
group-named \
user-named"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/perl \
/usr/bin/sh \
/usr/bin/touch \
bind-utils \
fillup \
ld-linux-aarch64.so.1 \
libbind9-9.18.18.so \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-9.18.18.so \
libfstrm.so.0 \
libisc-9.18.18.so \
libisccc-9.18.18.so \
libisccfg-9.18.18.so \
libjson-c.so.5 \
libmaxminddb.so.0 \
libnghttp2.so.14 \
libns-9.18.18.so \
libprotobuf-c.so.1 \
libuv.so.1 \
libxml2.so.2 \
libz.so.1 \
sysuser-shadow"

inherit rpm
