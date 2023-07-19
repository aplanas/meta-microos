SUMMARY = "Domain Name System (DNS) Server (named)"
DESCRIPTION = "Berkeley Internet Name Domain (BIND) is an implementation of the Domain \
Name System (DNS) protocols and provides an openly redistributable \
reference implementation of the major components of the Domain Name \
System.  This package includes the components to operate a DNS server."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-9.18.16-3.1.aarch64.rpm"
RPM_HASH = "33f6cf6ca7295a61b9f63d4a7a430f682ec8560e96e28f63cb1f1f49caf1d87292e623e13fe9941018d269959152b344da9bd7bdf0c4f6a78b4894e21c7a0671"

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
libbind9-9.18.16.so \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-9.18.16.so \
libfstrm.so.0 \
libisc-9.18.16.so \
libisccc-9.18.16.so \
libisccfg-9.18.16.so \
libjson-c.so.5 \
libmaxminddb.so.0 \
libnghttp2.so.14 \
libns-9.18.16.so \
libprotobuf-c.so.1 \
libuv.so.1 \
libxml2.so.2 \
libz.so.1 \
sysuser-shadow"

inherit rpm
