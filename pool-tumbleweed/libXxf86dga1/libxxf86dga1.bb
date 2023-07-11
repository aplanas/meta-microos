SUMMARY = "XFree86-DGA extension client library"
DESCRIPTION = "libXxf86dga provides the XFree86-DGA extension, which allows direct \
graphics access to a framebuffer-like region, and also allows \
relative mouse reporting, et al. It is mainly used by games and \
emulators for games."
LICENSE = "MIT"

PV = "1.1.6"

RPM_NAME = "libXxf86dga1-1.1.6-1.3.aarch64.rpm"
RPM_HASH = "79f2dc7debc420ca58a8309b9dc789aea75fb9e81d1f6f9a0d8f18a6852bf788d85f2885ccff50b1c14b5696901843bdb6c72a60a74516a39f5d638dbd34b258"

RPROVIDES:${PN} += "libXxf86dga.so.1 \
libXxf86dga1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXext.so.6 \
libc.so.6"

inherit rpm
