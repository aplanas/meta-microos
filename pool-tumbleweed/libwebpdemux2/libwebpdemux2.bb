SUMMARY = "Library for extraction of data and images from WebP container files"
DESCRIPTION = "The WebP Demux API enables extraction of images and extended format \
data from WebP files. This API currently supports reading of XMP/EXIF \
metadata, ICC profile and animated images."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebpdemux2-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "0cc82b82d6500fde9ba8104aadb68f346dc09163f0b7e37231131a20304c4346890e6ec006101ad96ef52f6573ec88eee28819e2c20de5b6df4cdac69ef8572c"

RPROVIDES:${PN} += "libwebpdemux.so.2()(64bit) \
libwebpdemux2 \
libwebpdemux2(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libwebp.so.7()(64bit)"

inherit rpm
