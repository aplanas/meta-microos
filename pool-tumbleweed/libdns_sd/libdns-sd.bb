SUMMARY = "mDNSResponder Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Apple mDNSResponder compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libdns_sd-0.8-23.3.aarch64.rpm"
RPM_HASH = "cd70787e877d1cd0c5c086e06f6ac46ac88c45fd0503ab5fa4df00ab61dd5354cb43ad8b0fdebda7bfbb4618cb8d0a620afbe8ddb78514ad79d2cf92b43c6785"

RPROVIDES:${PN} += "avahi-compat-mDNSResponder \
libdns-sd \
libdns-sd.so \
libdns-sd.so.1 \
mDNSResponder-lib"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6"

inherit rpm
