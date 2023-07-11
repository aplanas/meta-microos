SUMMARY = "Howl Compatibility Package for the Zeroconf/Bonjour D-Bus service"
DESCRIPTION = "Howl compatibility layer for Avahi. \
 \
Avahi is an implementation of the DNS Service Discovery and Multicast DNS \
specifications for Zeroconf Computing."
LICENSE = "LGPL-2.1-or-later"

PV = "0.8"

RPM_NAME = "avahi-compat-howl-devel-0.8-23.3.aarch64.rpm"
RPM_HASH = "f1d9593f5fe0926784a09c3f4e2e6002ba9f2538f931bcca380583563eed05ffdfe87d5ad374d3329def4a613c1ef5aa418be21c6c0f63d4c9e0080238ec37ae"

RPROVIDES:${PN} += "avahi-compat-howl-devel \
pkgconfig-avahi-compat-howl \
pkgconfig-howl"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libavahi-devel \
libhowl0"

inherit rpm
