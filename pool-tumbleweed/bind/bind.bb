SUMMARY = "Domain Name System (DNS) Server (named)"
DESCRIPTION = "Berkeley Internet Name Domain (BIND) is an implementation of the Domain \
Name System (DNS) protocols and provides an openly redistributable \
reference implementation of the major components of the Domain Name \
System.  This package includes the components to operate a DNS server."
LICENSE = "MPL-2.0"

PV = "9.18.17"

RPM_NAME = "bind-9.18.17-1.1.aarch64.rpm"
RPM_HASH = "a3effee186084ab0fb34e421bc0c313efd3e3ad0115437f01c833a04c936497c084fd3c28bd89a96b7221aa7c8d01e14767f0da5a2aae2b048ddd6861b4cdaf3"

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
libbind9-9.18.17.so \
libc.so.6 \
libcap.so.2 \
libcrypto.so.3 \
libdns-9.18.17.so \
libfstrm.so.0 \
libisc-9.18.17.so \
libisccc-9.18.17.so \
libisccfg-9.18.17.so \
libjson-c.so.5 \
libmaxminddb.so.0 \
libnghttp2.so.14 \
libns-9.18.17.so \
libprotobuf-c.so.1 \
libuv.so.1 \
libxml2.so.2 \
libz.so.1 \
sysuser-shadow"

inherit rpm
