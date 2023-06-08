SUMMARY = "mDNSResponder Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Apple mDNSResponder compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-compat-mDNSResponder-devel-0.8-23.1.aarch64.rpm"
RPM_HASH = "a5e936da8f003b04a2f47b06c65a514e773fbc10de18f4a7db2cf7dc3459712096c7920fe39eb43a8dcfd91ba5cd3cc42ef41dbeb6f2ed7dec498aa41cc30c97"

RPROVIDES:${PN} += "avahi-compat-mDNSResponder-devel avahi-compat-mDNSResponder-devel(aarch-64) mDNSResponder-devel pkgconfig(avahi-compat-libdns_sd)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libavahi-devel libdns_sd"

inherit rpm
