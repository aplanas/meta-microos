SUMMARY = "QXL virtual GPU video driver for the Xorg X server"
DESCRIPTION = "qxl is an Xorg driver for QXL virtual GPU as found in the spice project."
LICENSE = "MIT"

PV = "0.1.6"

RPM_NAME = "xf86-video-qxl-0.1.6-1.4.aarch64.rpm"
RPM_HASH = "bcccf22b8da725def67c93cd195430a3d6303382ea6b1d22c835b3efc9ba67a2cd5edbf4519aa6b3c26150dd0126aaf0ef335c9685ec87ade480a64004603683"

RPROVIDES:${PN} += "xf86-video-qxl"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6 \
libudev.so.1"

inherit rpm
