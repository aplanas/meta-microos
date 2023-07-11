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

RPM_NAME = "libICE-devel-1.1.1-1.4.aarch64.rpm"
RPM_HASH = "443309c501ab5c247aa07333bc9cfca57a49064aac7f466eed3d61ccf24ad651a64a48e4b77f0b664338d48f1ab8eb4d849bba0a6929e42c647d3a1a65974c0a"

RPROVIDES:${PN} += "libICE-devel \
pkgconfig-ice \
xorg-x11-libICE-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libICE6 \
pkgconfig-xproto"

inherit rpm
