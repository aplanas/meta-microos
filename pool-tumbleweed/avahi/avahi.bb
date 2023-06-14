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

RPM_NAME = "avahi-0.8-23.1.aarch64.rpm"
RPM_HASH = "9198e9ee8d9a1761107bf399c02e58e76c493c624d47c5486804dd0b14c245ed8b1b89d5fee9a95abf4fe40a94e64154124d7eb397dede9f2381dbfb6becfd38"

RPROVIDES:${PN} += "avahi \
config-avahi \
group-avahi \
mDNSResponder \
user-avahi"

RDEPENDS:${PN} += "/bin/sh \
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
