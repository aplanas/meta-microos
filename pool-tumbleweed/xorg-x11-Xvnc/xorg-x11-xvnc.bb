SUMMARY = "TigerVNC implementation of Xvnc"
DESCRIPTION = "This is the TigerVNC implementation of Xvnc."
LICENSE = "GPL-2.0-only & MIT"

PV = "1.13.1"

RPM_NAME = "xorg-x11-Xvnc-1.13.1-3.1.aarch64.rpm"
RPM_HASH = "31affeffc9207b61260cd0717718549345365c38258520656640c2a010b00543e5e3bfeb26fd7214563cbd9069ce9b9de7fa2118b2a965e35fb406e3062e18bb"

RPROVIDES:${PN} += "config(xorg-x11-Xvnc) \
group(vnc) \
tightvnc \
user(vnc) \
xorg-x11-Xvnc \
xorg-x11-Xvnc(aarch-64) \
xorg-x11-Xvnc:/usr/lib/vnc/with-vnc-key.sh"
RDEPENDS:${PN} += "/bin/awk \
/bin/bash \
/bin/hostname \
/bin/sh \
/usr/bin/perl \
dbus-1-x11 \
group(shadow) \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libXau.so.6()(64bit) \
libXdamage.so.1()(64bit) \
libXdmcp.so.6()(64bit) \
libXext.so.6()(64bit) \
libXfixes.so.3()(64bit) \
libXfont2.so.2()(64bit) \
libXrandr.so.2()(64bit) \
libXtst.so.6()(64bit) \
libXvnc.so.1()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libgcc_s.so.1()(64bit) \
libgcc_s.so.1(GCC_3.0)(64bit) \
libgcc_s.so.1(GCC_3.3.1)(64bit) \
libgmp.so.10()(64bit) \
libgnutls.so.30()(64bit) \
libgnutls.so.30(GNUTLS_3_4)(64bit) \
libgnutls.so.30(GNUTLS_3_6_3)(64bit) \
libhogweed.so.6()(64bit) \
libhogweed.so.6(HOGWEED_6)(64bit) \
libjpeg.so.8()(64bit) \
libjpeg.so.8(LIBJPEG_8.0)(64bit) \
libm.so.6()(64bit) \
libm.so.6(GLIBC_2.17)(64bit) \
libm.so.6(GLIBC_2.29)(64bit) \
libm.so.6(GLIBC_2.35)(64bit) \
libnettle.so.8()(64bit) \
libnettle.so.8(NETTLE_8)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
libpixman-1.so.0()(64bit) \
libstdc++.so.6()(64bit) \
libstdc++.so.6(CXXABI_1.3)(64bit) \
libstdc++.so.6(CXXABI_1.3.8)(64bit) \
libstdc++.so.6(CXXABI_1.3.9)(64bit) \
libstdc++.so.6(GLIBCXX_3.4)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.15)(64bit) \
libstdc++.so.6(GLIBCXX_3.4.21)(64bit) \
libsystemd.so.0()(64bit) \
libsystemd.so.0(LIBSYSTEMD_209)(64bit) \
libz.so.1()(64bit) \
openssl(cli) \
systemd \
sysuser-shadow \
windowmanager \
xauth \
xinit \
xkbcomp \
xkeyboard-config \
xorg-x11-fonts-core"

inherit rpm
