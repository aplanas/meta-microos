SUMMARY = "Development files for wiiuse"
DESCRIPTION = "The wiiuse-devel package contains libraries and header files for \
developing applications that use wiiuse."
LICENSE = "GPL-3.0-only & LGPL-3.0-only"

PV = "0.15.5"

RPM_NAME = "wiiuse-devel-0.15.5-2.2.aarch64.rpm"
RPM_HASH = "93037d5436eced28e2d3957323edf3e78704b6239525c4771efc740046aa4056458c7509673d3b4560dfef714f99898695819212edb77890a2ad8c3c23465c56"

RPROVIDES:${PN} += "wiiuse-devel \
wiiuse-devel(aarch-64)"

RDEPENDS:${PN} += "bluez-devel \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libGLU.so.1()(64bit) \
libSDL-1.2.so.0()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libglut.so.3()(64bit) \
libwiiuse.so.0()(64bit) \
libwiiuse0"

inherit rpm
