SUMMARY = "Library for extraction of data and images from WebP container files"
DESCRIPTION = "The WebP Demux API enables extraction of images and extended format \
data from WebP files. This API currently supports reading of XMP/EXIF \
metadata, ICC profile and animated images."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libwebpdemux2-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "8368203194863b8bbb76642ebc108bfd3562f06d1796397f7a926b4fc37c361783cf24b531fd708f4afcdfc8260ca3e40b2680a471476c351183b4e96be98627"

RPROVIDES:${PN} += "libwebpdemux.so.2 \
libwebpdemux2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwebp.so.7"

inherit rpm
