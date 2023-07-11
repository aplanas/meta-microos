SUMMARY = "mDNSResponder Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Apple mDNSResponder compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-compat-mDNSResponder-devel-0.8-23.3.aarch64.rpm"
RPM_HASH = "33a8a07f81fe5656f6e49f91fed3d6e344df5af8ef242fe48d16196c261b95fb74b7ddd7caff61478085931104f99a68d9bf21d7e5f819c2003cafce6c0cc647"

RPROVIDES:${PN} += "avahi-compat-mDNSResponder-devel \
mDNSResponder-devel \
pkgconfig-avahi-compat-libdns-sd"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libdns-sd"

inherit rpm
