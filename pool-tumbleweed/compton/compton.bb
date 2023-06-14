SUMMARY = "A compositor for X11"
DESCRIPTION = "Compton was forked from Dana Jansens' fork of xcompmgr and refactored."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "compton-0.1.0-4.29.aarch64.rpm"
RPM_HASH = "2e4cd041c6cd97b60b63b5bf22c293ec9ae4449fde044505fecb1ff2c4edeca4b0aae4f95468de1d5013d73176a6bfc8f3e2a3080926eea7d578e049f56fdb5b"

RPROVIDES:${PN} += "compton"

RDEPENDS:${PN} += "/bin/sh \
desktop-file-utils \
hicolor-icon-theme \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libX11.so.6 \
libXcomposite.so.1 \
libXdamage.so.1 \
libXext.so.6 \
libXfixes.so.3 \
libXinerama.so.1 \
libXrandr.so.2 \
libXrender.so.1 \
libc.so.6 \
libconfig.so.11 \
libdbus-1.so.3 \
libm.so.6 \
libpcre.so.1"

inherit rpm
