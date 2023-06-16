SUMMARY = "X Display Manager"
DESCRIPTION = "Xdm manages a collection of X displays, which may be on the local host \
or remote servers."
LICENSE = "MIT"

PV = "1.1.14"

RPM_NAME = "xdm-1.1.14-4.1.aarch64.rpm"
RPM_HASH = "a3089e1b2bbe51cf2d8c4da7a609e1df532ed245d98c4ffb088ab16f81578bd72be69afd7fedf6a0e153e3e92923aff33145cf0820b722cea05c37215e19cc39"

RPROVIDES:${PN} += "config-xdm \
libXdmGreet.so \
xdm"

RDEPENDS:${PN} += "/sbin/startproc \
/usr/bin/bash \
/usr/bin/mkdir \
/usr/bin/pidof \
/usr/bin/sh \
/usr/bin/touch \
cpp \
fillup \
ld-linux-aarch64.so.1 \
libX11.so.6 \
libXau.so.6 \
libXaw.so.7 \
libXdmcp.so.6 \
libXext.so.6 \
libXft.so.2 \
libXinerama.so.1 \
libXmu.so.6 \
libXpm.so.4 \
libXrender.so.1 \
libXt.so.6 \
libc.so.6 \
libcrypt.so.1 \
libpam.so.0 \
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
