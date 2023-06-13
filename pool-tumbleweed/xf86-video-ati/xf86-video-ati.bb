SUMMARY = "ATI video driver for the Xorg X server"
DESCRIPTION = "ati is an Xorg driver for ATI/AMD video cards. \
 \
It autodetects whether your hardware has a Radeon, Rage 128, or Mach64 \
or earlier class of chipset, and loads the radeon, r128, or mach64 \
driver as appropriate."
LICENSE = "MIT"

PV = "22.0.0"

RPM_NAME = "xf86-video-ati-22.0.0-1.1.aarch64.rpm"
RPM_HASH = "afdefcc51d52fe0f2f749a944177fd81ab7c57f21644a29c61f3e7ec0c29fb5f7e14298fdedc49529b3011012e65539495be596c1022ecbae70d3fe62e23d3c9"

RPROVIDES:${PN} += "xf86-video-ati \
xf86-video-ati(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libdrm_radeon.so.1()(64bit) \
libgbm.so.1()(64bit) \
libpciaccess.so.0()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
