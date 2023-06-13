SUMMARY = "ATI Mach64 series video driver for the Xorg X server"
DESCRIPTION = "mach64 is an Xorg driver for ATI Mach64 series video cards."
LICENSE = "MIT"

PV = "6.9.7"

RPM_NAME = "xf86-video-mach64-6.9.7-1.4.aarch64.rpm"
RPM_HASH = "0b9fe3c189bfece9c627a69a4c4f93791f7d506bbcfa0473bd5de36e08a8a14cb9386402ae0731b1b622a718b92b82b4d329272c83fb2edfad7d1ad527fb0845"

RPROVIDES:${PN} += "xf86-video-mach64 \
xf86-video-mach64(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
