SUMMARY = "Tools for Allwinner A10 devices"
DESCRIPTION = "Tools to help hacking Allwinner A10 (aka sun4i) based devices \
and its successors."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.2+git20200914103652"

RPM_NAME = "sunxi-tools-1.4.2+git20200914103652-1.10.aarch64.rpm"
RPM_HASH = "f5fd01ab68328c2da9d22fb9991074710a90c4f110cd61bc859cd89e71d2321ab5536ecd2f10a7c2d4f93db8f5245546780254a2275586f422102d9d164395c8"

RPROVIDES:${PN} += "sunxi-tools \
sunxi-tools(aarch-64)"

RDEPENDS:${PN} += "libc.so.6()(64bit) \
libusb-1.0.so.0()(64bit) \
libz.so.1()(64bit)"

inherit rpm
