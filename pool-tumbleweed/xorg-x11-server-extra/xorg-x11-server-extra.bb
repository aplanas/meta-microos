SUMMARY = "Additional Xservers Xephyr, Xnest)"
DESCRIPTION = "This package contains additional Xservers (Xephyr, Xnest)."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-extra-21.1.8-1.3.aarch64.rpm"
RPM_HASH = "e637ce0513750ca226d87145b18cb88619cfea6b71dbdb7db19604224aa9fbedde084e8564788605a2972d129b1c3683e6efb6fd06e16122ee7d05c7fee9982f"

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
