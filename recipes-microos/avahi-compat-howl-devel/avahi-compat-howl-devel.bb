SUMMARY = "Howl Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Howl compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-compat-howl-devel-0.8-23.1.aarch64.rpm"
RPM_HASH = "96cc7f601c3d55d2ccc4e4faaaee8f5133c369180337394f08a44292d6ce4f8746c0d1d4bc598c3a60dadc0967d496902ad0290dd67e916d4d28b81f98358b02"

RPROVIDES:${PN} += "avahi-compat-howl-devel avahi-compat-howl-devel(aarch-64) pkgconfig(avahi-compat-howl) pkgconfig(howl)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libavahi-devel libhowl0"

inherit rpm
