SUMMARY = "Additional Xservers Xephyr, Xnest)"
DESCRIPTION = "This package contains additional Xservers (Xephyr, Xnest)."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-extra-21.1.8-1.1.aarch64.rpm"
RPM_HASH = "6105d7af57ef3a9afd481061bcf59e455b0cff1a6f78b2b594729895ea4ad78edb0158b98ded38c49e58819c8eec055e6f37405f68b4bc6e48880fd0d2125b2e"

RPROVIDES:${PN} += "xorg-x11-Xnest \
xorg-x11-server-extra"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11-xcb.so.1 \
libX11.so.6 \
libXau.so.6 \
libXdmcp.so.6 \
libXext.so.6 \
libXfont2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libepoxy.so.0 \
libm.so.6 \
libpixman-1.so.0 \
libsystemd.so.0 \
libudev.so.1 \
libxcb-icccm.so.4 \
libxcb-image.so.0 \
libxcb-keysyms.so.1 \
libxcb-randr.so.0 \
libxcb-render-util.so.0 \
libxcb-render.so.0 \
libxcb-shape.so.0 \
libxcb-shm.so.0 \
libxcb-util.so.1 \
libxcb-xkb.so.1 \
libxcb-xv.so.0 \
libxcb.so.1 \
libxshmfence.so.1 \
xkbcomp \
xkeyboard-config"

inherit rpm
