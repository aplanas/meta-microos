SUMMARY = "Development files for wiiuse"
DESCRIPTION = "The wiiuse-devel package contains libraries and header files for \
developing applications that use wiiuse."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.15.5"

RPM_NAME = "wiiuse-devel-0.15.5-2.2.aarch64.rpm"
RPM_HASH = "93037d5436eced28e2d3957323edf3e78704b6239525c4771efc740046aa4056458c7509673d3b4560dfef714f99898695819212edb77890a2ad8c3c23465c56"

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
