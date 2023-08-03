SUMMARY = "GLX backend for the Video Acceleration API"
DESCRIPTION = "The libva library implements the Video Acceleration API. \
The library loads a hardware dependendent driver. \
 \
This is the VA/GLX runtime library."
LICENSE = "MIT"

PV = "2.19.0"

RPM_NAME = "libva-glx2-2.19.0-1.1.aarch64.rpm"
RPM_HASH = "a35ecd42d335423a0158d4097fb9f8aa44cafc0bb6c8e28162c098fc92aa083cf35a8af70c71fc14869deb25dbfaf24db749bec1169e4b3f493052ecdae812a1"

RPROVIDES:${PN} += "libva-glx.so.2 \
libva-glx2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libc.so.6 \
libva-x11.so.2 \
libva.so.2"

inherit rpm
