SUMMARY = "HW video decode support for VDPAU platforms"
DESCRIPTION = "VDPAU Backend for Video Acceleration (VA) API HW video decode support."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.4"

RPM_NAME = "libva-vdpau-driver-0.7.4-7.11.aarch64.rpm"
RPM_HASH = "6ab6532adfd6603617664f76aa9824411541861b3b494089463b0ecbbe990f2490f405dc7911553285a6f3fe22ee7355ace8bec4778879d02a450a89b4a2c12b"

RPROVIDES:${PN} += "config(libva-vdpau-driver) \
libva-vdpau-driver \
libva-vdpau-driver(aarch-64) \
vdpau-video"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libGL.so.1()(64bit) \
libX11.so.6()(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libvdpau.so.1()(64bit)"

inherit rpm
