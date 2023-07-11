SUMMARY = "FFmpeg image scaling and colorspace/pixel conversion library"
DESCRIPTION = "The libswscale library performs image scaling and colorspace and \
pixel format conversion operations."
LICENSE = "GPL-3.0-or-later"

PV = "4.4.4"

RPM_NAME = "libswscale5_9-4.4.4-2.1.aarch64.rpm"
RPM_HASH = "732fb20c8bab9c46c61cd68ab83193cd5442c9f0ee5253c4b6f8fc73f327d49d77c10381a452944e679cf9577a1a71126e00155808bdbcdc44490eb317a9a32c"

RPROVIDES:${PN} += "libswscale.so.5.9 \
libswscale5-9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libavutil.so.56.70 \
libavutil56-70 \
libc.so.6 \
libm.so.6"

inherit rpm
