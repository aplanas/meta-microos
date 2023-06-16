SUMMARY = "Open source RGB lighting control"
DESCRIPTION = "The purpose of this tool is to control RGB lights on different peripherals. \
Accessing the SMBus is a potentially dangerous operation, so exercise caution."
LICENSE = "GPL-2.0-only"

PV = "0.8"

RPM_NAME = "OpenRGB-0.8-1.1.aarch64.rpm"
RPM_HASH = "6f1ed9bc04b40301431fdcbf0b2b1d4f9d0208900cc85f176d132bc32b59e3470da6076da9a74650fd0a8ebfc542152185bda4d926462cb999faa3e0c3127fc1"

RPROVIDES:${PN} += "OpenRGB"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libQt5Core.so.5 \
libQt5Gui.so.5 \
libQt5Widgets.so.5 \
libc.so.6 \
libe131.so.1 \
libgcc-s.so.1 \
libhidapi-hidraw.so.0 \
libm.so.6 \
libmbedcrypto.so.7 \
libmbedtls.so.14 \
libmbedx509.so.1 \
libstdc++.so.6 \
libusb-1.0.so.0"

inherit rpm
