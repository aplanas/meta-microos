SUMMARY = "Development package for opal"
DESCRIPTION = "Static libraries and header files for development with opal."
LICENSE = "MPL-1.0"

PV = "3.18.8"

RPM_NAME = "libopal-devel-3.18.8-2.9.aarch64.rpm"
RPM_HASH = "4110163983db904bc590151660be87076a0705ef227e27c5a870786e2ade3efe4101d3caa6808589f7459b4ccce8fed6db0aab90825015a92e4c779ebc3423d0"

RPROVIDES:${PN} += "libopal-devel \
opal-devel \
pkgconfig-opal"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libopal3-18-8 \
pkgconfig-libsrtp2 \
pkgconfig-ptlib \
pkgconfig-speexdsp"

inherit rpm
