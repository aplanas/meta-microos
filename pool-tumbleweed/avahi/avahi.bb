SUMMARY = "D-Bus Service for Zeroconf and Bonjour"
DESCRIPTION = "Avahi is an implementation of the DNS Service Discovery and Multicast \
DNS specifications for Zeroconf Computing. It uses D-Bus for \
communication between user applications and a system daemon. The daemon \
is used to coordinate application efforts in caching replies, necessary \
to minimize the traffic imposed on networks. \
 \
The Avahi mDNS responder is now complete with features, implementing \
all MUSTs and the majority of the SHOULDs of the mDNS and DNS-SD RFCs. \
It passes all tests in the Apple Bonjour conformance test suite. In \
addition, it supports some nifty things, like correct mDNS reflection \
across LAN segments."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-0.8-23.3.aarch64.rpm"
RPM_HASH = "9d96bc9a3ea8dcd4058bc72ce050b6407280b2bdb689a4c314df769ffd817ce7d8f79a61e83138ff43ea66ab260982eb398d6552a6415371ea4ff3cf0f02ceb6"

RPROVIDES:${PN} += "avahi \
config-avahi \
group-avahi \
mDNSResponder \
user-avahi"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libavahi-common.so.3 \
libavahi-core.so.7 \
libc.so.6 \
libdaemon.so.0 \
libdbus-1.so.3 \
libexpat.so.1 \
nss-mdns \
sudo \
sysuser-shadow"

inherit rpm
