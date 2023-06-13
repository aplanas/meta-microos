SUMMARY = "mDNSResponder Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Apple mDNSResponder compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libdns_sd-0.8-23.1.aarch64.rpm"
RPM_HASH = "e0160e3cc88020845f5100e3353b00befb3ef03a347319453db243d9f96e1385dd822d9a044ad28f1f954a57e973a00aa8a069b50e0e3247b0f1f210ef26d1f0"

RPROVIDES:${PN} += "avahi-compat-mDNSResponder \
libdns_sd \
libdns_sd(aarch-64) \
libdns_sd.so \
libdns_sd.so.1()(64bit) \
mDNSResponder-lib"

RDEPENDS:${PN} += "/sbin/ldconfig \
libavahi-client.so.3()(64bit) \
libavahi-common.so.3()(64bit) \
libc.so.6()(64bit)"

inherit rpm
