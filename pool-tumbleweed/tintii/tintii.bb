SUMMARY = "Selective Colour Photo Filter"
DESCRIPTION = "tintii takes full colour photos and processes them into black and white \
with some select regions highlighted in colour. The technique is known \
as colour popping or selective colouring."
LICENSE = "GPL-2.0"

PV = "2.10.0"

RPM_NAME = "tintii-2.10.0-4.31.aarch64.rpm"
RPM_HASH = "c48d3e98f695f6a6222133dc70825e4602dd536360741517e4eafefd10a9f6ee6b180865dc8f2211650925b02a255ee6c15f1472d415040dfc0386d9453240c3"

RPROVIDES:${PN} += "tintii"

RDEPENDS:${PN} += "/usr/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libgomp.so.1 \
libm.so.6 \
libstdc++.so.6 \
libwx-baseu-suse.so.9.0.0 \
libwx-gtk2u-aui-suse.so.9.0.0 \
libwx-gtk2u-core-suse.so.9.0.0 \
libwx-gtk2u-html-suse.so.9.0.0"

inherit rpm
