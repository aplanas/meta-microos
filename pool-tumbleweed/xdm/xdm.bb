SUMMARY = "X Display Manager"
DESCRIPTION = "Xdm manages a collection of X displays, which may be on the local host \
or remote servers."
LICENSE = "MIT"

PV = "1.1.14"

RPM_NAME = "xdm-1.1.14-4.1.aarch64.rpm"
RPM_HASH = "a3089e1b2bbe51cf2d8c4da7a609e1df532ed245d98c4ffb088ab16f81578bd72be69afd7fedf6a0e153e3e92923aff33145cf0820b722cea05c37215e19cc39"

RPROVIDES:${PN} += "config(xdm) \
libXdmGreet.so()(64bit) \
xdm \
xdm(aarch-64)"
RDEPENDS:${PN} += "/bin/bash \
/bin/sh \
/sbin/startproc \
/usr/bin/mkdir \
/usr/bin/pidof \
/usr/bin/touch \
cpp \
fillup \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libX11.so.6()(64bit) \
libXau.so.6()(64bit) \
libXaw.so.7()(64bit) \
libXdmcp.so.6()(64bit) \
libXext.so.6()(64bit) \
libXft.so.2()(64bit) \
libXinerama.so.1()(64bit) \
libXmu.so.6()(64bit) \
libXpm.so.4()(64bit) \
libXrender.so.1()(64bit) \
libXt.so.6()(64bit) \
libc.so.6(GLIBC_2.36)(64bit) \
libcrypt.so.1()(64bit) \
libcrypt.so.1(XCRYPT_2.0)(64bit) \
libpam.so.0()(64bit) \
libpam.so.0(LIBPAM_1.0)(64bit) \
logrotate \
sessreg \
systemd \
xconsole \
xinit \
xli \
xmessage \
xrdb \
xset \
xsetroot \
xterm-bin"

inherit rpm