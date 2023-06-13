SUMMARY = "QXL virtual GPU video driver for the Xorg X server"
DESCRIPTION = "qxl is an Xorg driver for QXL virtual GPU as found in the spice project."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "xf86-video-qxl-0.1.6-1.3.aarch64.rpm"
RPM_HASH = "907cdb0642c9c070dd3caf2434cb7e68e3978444251e9718c5a992a8ad560e07c4f8c7ac106e6559a2883eead69e0b409ce31d6fbec45a30fad4d593d418ff6a"

RPROVIDES:${PN} += "xf86-video-qxl \
xf86-video-qxl(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libudev.so.1()(64bit) \
libudev.so.1(LIBUDEV_183)(64bit)"

inherit rpm
