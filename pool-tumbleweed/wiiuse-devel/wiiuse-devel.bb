SUMMARY = "Development files for wiiuse"
DESCRIPTION = "The wiiuse-devel package contains libraries and header files for \
developing applications that use wiiuse."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.15.5"

RPM_NAME = "wiiuse-devel-0.15.5-2.3.aarch64.rpm"
RPM_HASH = "5369d6dc2c7a08c96ce861d58b99587c1e1ca5764c25d81b95b08aaf3f9b453c5df08b392f8d0e9fc784b9806d9e6797bf4648617726bb0f7e7db5366caf4ae9"

RPROVIDES:${PN} += "wiiuse-devel"

RDEPENDS:${PN} += "bluez-devel \
ld-linux-aarch64.so.1 \
libGL.so.1 \
libGLU.so.1 \
libSDL-1.2.so.0 \
libc.so.6 \
libglut.so.3 \
libwiiuse.so.0 \
libwiiuse0"

inherit rpm
