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

RPM_NAME = "xf86-video-chips-1.4.0-1.19.aarch64.rpm"
RPM_HASH = "ee34e3a4b7c5f63e3df4d7a00367ebde4ab17d27e12029c7ccb61526db45d7249a20c8c42984cad2d23f1f380a36463d0ee94b008ed472c11ea8e514a908a407"

RPROVIDES:${PN} += "xf86-video-chips \
xf86-video-chips(aarch-64)"

RDEPENDS:${PN} += "X11_ABI_VIDEODRV \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit)"

inherit rpm
