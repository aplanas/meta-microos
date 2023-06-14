SUMMARY = "Virtual Xserver Xvfb"
DESCRIPTION = "This package contains the virtual Xserver Xvfb."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-Xvfb-21.1.8-1.1.aarch64.rpm"
RPM_HASH = "b5ca93da60478393c440f353e2a54334cefc9ae0591141491be0e161f09e70628195987b71fd50607ce18ec0d5213d8f9a73fa287c4af2cdf806335b571ce448"

RPROVIDES:${PN} += "xorg-x11-Xvfb \
xorg-x11-server-/usr/bin/Xvfb \
xorg-x11-server-Xvfb"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libXau.so.6 \
libXdmcp.so.6 \
libXfont2.so.2 \
libc.so.6 \
libcrypto.so.3 \
libm.so.6 \
libpixman-1.so.0 \
libsystemd.so.0 \
xkbcomp \
xkeyboard-config"

inherit rpm
