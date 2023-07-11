SUMMARY = "Chips and Technologies video driver for the Xorg X server"
DESCRIPTION = "chips is an Xorg driver for Chips and Technologies video cards. \
 \
The majority of the Chips and Technologies chipsets are supported by \
this driver. In general the limitation on the capabilities of this \
driver are determined by the chipset on which it is run. Where possible, \
this driver provides full acceleration and supports the following \
depths: 1, 4, 8, 15, 16, 24 and on the latest chipsets an 8+16 overlay \
mode. All visual types are supported for depth 1, 4 and 8 and both \
TrueColor and DirectColor visuals are supported where possible. \
Multi-head configurations are supported on PCI or AGP buses."
LICENSE = "MIT"

PV = "1.4.0"

RPM_NAME = "xf86-video-chips-1.4.0-1.20.aarch64.rpm"
RPM_HASH = "a967fe3910bec9c0c16585a500e3bec0bd874d3d41e9cbb18e97fc9d5ff6cd7dae0530ac1813fd1d9ef28804c70bf8aa02b25c62b07869db4933953d9871bf65"

RPROVIDES:${PN} += "xf86-video-chips"

RDEPENDS:${PN} += "X11-ABI-VIDEODRV \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
