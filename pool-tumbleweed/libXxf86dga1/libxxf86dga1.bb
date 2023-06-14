SUMMARY = "XFree86-DGA extension client library"
DESCRIPTION = "libXxf86dga provides the XFree86-DGA extension, which allows direct \
graphics access to a framebuffer-like region, and also allows \
relative mouse reporting, et al. It is mainly used by games and \
emulators for games."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libXxf86dga1-1.1.6-1.2.aarch64.rpm"
RPM_HASH = "7d2f688832cd1a161a0648d7b4f18273a2aa3d3426ab837cec623bd521cb51e4f001288c066e1f20d1532d43a877968fd1035706c072ab6d2d3d39d6561dbd0e"

RPROVIDES:${PN} += "libXxf86dga.so.1 \
libXxf86dga1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
