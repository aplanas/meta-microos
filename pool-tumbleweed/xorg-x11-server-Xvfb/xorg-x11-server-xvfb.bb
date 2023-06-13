SUMMARY = "Virtual Xserver Xvfb"
DESCRIPTION = "This package contains the virtual Xserver Xvfb."
LICENSE = "MIT"

PV = "21.1.8"

RPM_NAME = "xorg-x11-server-Xvfb-21.1.8-1.1.aarch64.rpm"
RPM_HASH = "b5ca93da60478393c440f353e2a54334cefc9ae0591141491be0e161f09e70628195987b71fd50607ce18ec0d5213d8f9a73fa287c4af2cdf806335b571ce448"

RPROVIDES:${PN} += "xorg-x11-Xvfb \
xorg-x11-server-Xvfb \
xorg-x11-server-Xvfb(aarch-64) \
xorg-x11-server:/usr/bin/Xvfb"

RDEPENDS:${PN} += "Mesa \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libXau.so.6()(64bit) \
libXdmcp.so.6()(64bit) \
libXfont2.so.2()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypto.so.3()(64bit) \
libcrypto.so.3(OPENSSL_3.0.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libpixman-1.so.0()(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
xkbcomp \
xkeyboard-config"

inherit rpm
