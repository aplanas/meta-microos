SUMMARY = "X Display Manager"
DESCRIPTION = "Xdm manages a collection of X displays, which may be on the local host \
or remote servers."
LICENSE = "MIT"

PV = "1.1.14"

RPM_NAME = "xdm-1.1.14-4.2.aarch64.rpm"
RPM_HASH = "fc916b7e255d683571a799381fbf34fb4397c456ffee9d19a23679ccd52230b4f4efa75875a846a9ffd8d6b7673ac21a9b58d2c4abb962245af93207e23dbd0a"

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
