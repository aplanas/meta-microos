SUMMARY = "Development files for the X11 Inter-Client Exchange Library"
DESCRIPTION = "The Inter-Client Exchange (ICE) protocol is intended to provide a \
framework for building such protocols, allowing them to make use of \
common negotiation mechanisms and to be multiplexed over a single \
transport connection. \
 \
This package contains the development headers for the library found \
in libICE6."
LICENSE = "MIT"

PV = "1.1.1"

RPM_NAME = "libICE-devel-1.1.1-1.3.aarch64.rpm"
RPM_HASH = "221d455beb47d265f2bc598b20d4bab14bbd6cf04930ad1639a6e94cc9d9b47884bada471edb9e7f17d94846c7551c10ac964ce3530506ab8991ba4a11a88d14"

RPROVIDES:${PN} += "libICE-devel \
pkgconfig-ice \
xorg-x11-libICE-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libICE6 \
pkgconfig-xproto"

inherit rpm
