SUMMARY = "IRC to other Chat Networks Gateway (Devel files)"
DESCRIPTION = "BitlBee is a gateway between instant messaging and an IRC client. \
With it, one's IRC client program can be reused and no extra IM program \
will need to run. \
 \
This package contains development files for external plugins."
LICENSE = "GPL-2.0-only"

PV = "3.6"

RPM_NAME = "bitlbee-devel-3.6-4.5.aarch64.rpm"
RPM_HASH = "dfb0254944844c76ee24a1d9bed2d46206ce039ec7f1e51cbb4f21c4fd30eb113aac20f865c38bc24991b1b535113a3ae59d21e44c5454b1d3f3adb7c02c8064"

RPROVIDES:${PN} += "bitlbee-devel \
pkgconfig-bitlbee"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
bitlbee \
pkgconfig-glib-2.0"

inherit rpm
