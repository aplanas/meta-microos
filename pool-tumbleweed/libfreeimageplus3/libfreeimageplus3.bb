SUMMARY = "Multi-format Image Decoder Library"
DESCRIPTION = "FreeImage is a library for developers who would like to support \
graphics image formats like PNG, BMP, JPEG, TIFF and others as needed \
by today's multimedia applications."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "3.18.0"

RPM_NAME = "libfreeimageplus3-3.18.0-6.3.aarch64.rpm"
RPM_HASH = "03127038311c689e85d030b1864f2d3ffa660a03e85864f3e82fbee24a377b62b9b093c1e74310a61ed7512412fb3fcdbc1033e204f216e0c9f96009ace6ded2"

RPROVIDES:${PN} += "libfreeimageplus.so.3 \
libfreeimageplus3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libfreeimage.so.3 \
libstdc++.so.6"

inherit rpm
