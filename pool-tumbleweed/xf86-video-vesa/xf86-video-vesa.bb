SUMMARY = "Generic VESA video driver for the Xorg X server"
DESCRIPTION = "vesa is an Xorg driver for Generic VESA video cards. \
 \
It can drive most VESA-compatible video cards, but only makes use of the \
basic standard VESA core that is common to these cards. The driver \
supports depths 8, 15 16 and 24."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "xf86-video-vesa-2.6.0-1.2.aarch64.rpm"
RPM_HASH = "7512bb269788f0d8ad415a88de433b81c99434dd20f1b7da53c192727969d6b6f5073308f1d96c70c55f10941fbce10d819729fcead68f4c5f6aa89a82aba318"

RPROVIDES:${PN} += "xf86-video-vesa \
xf86-video-vesa(aarch-64)"
RDEPENDS:${PN} += "X11_ABI_HAS_DPMS_GET_CAPABILITIES \
X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit)"

inherit rpm
