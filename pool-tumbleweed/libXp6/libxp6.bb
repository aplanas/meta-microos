SUMMARY = "X Printing Extension client library"
DESCRIPTION = "libXp provides APIs to allow client applications to render to \
non-display devices."
LICENSE = "MIT"

PV = "1.0.4"

RPM_NAME = "libXp6-1.0.4-1.2.aarch64.rpm"
RPM_HASH = "f6f6f2670e1bba47a1f6005d3b09a5dcec72c30a0d5264a998fc3aac9461b1a0e557fd9ab5ba45432b2945b131627f03598dc6a907c61373f1c37e036c7731c9"

RPROVIDES:${PN} += "libXp.so.6 \
libXp6 \
xorg-x11-libXp"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
