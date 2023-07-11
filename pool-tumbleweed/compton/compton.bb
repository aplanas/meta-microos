SUMMARY = "A compositor for X11"
DESCRIPTION = "Compton was forked from Dana Jansens' fork of xcompmgr and refactored."
LICENSE = "MIT"

PV = "0.1.0"

RPM_NAME = "compton-0.1.0-4.30.aarch64.rpm"
RPM_HASH = "3a667cdb67d4f333ebb108d073fe52f911f59d1aadfa5fb626ce50f985399fa55aa9a15b326ebf551d78445485f4e17b9fa7913a9c9197c276428a50d1e76530"

RPROVIDES:${PN} += "compton"

RDEPENDS:${PN} += "/usr/bin/sh \
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
