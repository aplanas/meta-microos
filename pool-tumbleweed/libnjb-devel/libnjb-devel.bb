SUMMARY = "Nomad Jukebox API"
DESCRIPTION = "Nomad Jukebox API"
LICENSE = "BSD-3-Clause"

PV = "2.2.7"

RPM_NAME = "libnjb-devel-2.2.7-111.13.aarch64.rpm"
RPM_HASH = "7f44b740f929d0549ae327063572f35e24baa42d5051d498edce0c470b3a91f8eae88f05b5d96d26b38b801439cd92ae1efc7245230558b5e6b0557db38bb043"

RPROVIDES:${PN} += "libnjb-devel \
pkgconfig-libnjb"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libnjb \
libusb-devel"

inherit rpm
