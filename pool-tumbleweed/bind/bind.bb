SUMMARY = "Domain Name System (DNS) Server (named)"
DESCRIPTION = "Berkeley Internet Name Domain (BIND) is an implementation of the Domain \
Name System (DNS) protocols and provides an openly redistributable \
reference implementation of the major components of the Domain Name \
System.  This package includes the components to operate a DNS server."
LICENSE = "MPL-2.0"

PV = "9.18.16"

RPM_NAME = "bind-9.18.16-2.1.aarch64.rpm"
RPM_HASH = "2a6521bc3414fd8e861861df00345db9d73bb6175ee1fde82173376025d28b32f0af81a3d228cf25b789185adb8ac5be6a2e909d9333d53ff93fa04548c04dda"

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
libisc-9.18.16.so \
libisccc-9.18.16.so \
libisccfg-9.18.16.so \
libjson-c.so.5 \
libmaxminddb.so.0 \
libnghttp2.so.14 \
libns-9.18.16.so \
libuv.so.1 \
libxml2.so.2 \
libz.so.1 \
sysuser-shadow"

inherit rpm
