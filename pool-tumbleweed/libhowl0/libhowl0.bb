SUMMARY = "Howl Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Howl compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "libhowl0-0.8-23.3.aarch64.rpm"
RPM_HASH = "ac9c74c4ef557fc016830a7ac34c2250c43eeccdf8544f0a3fe0910133bfd3501d599b2d8835aff532547bc3b67f977c19516984970c0ef295076ee724cefe89"

RPROVIDES:${PN} += "avahi-compat-howl \
libhowl.so.0 \
libhowl0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavahi-client.so.3 \
libavahi-common.so.3 \
libc.so.6"

inherit rpm
