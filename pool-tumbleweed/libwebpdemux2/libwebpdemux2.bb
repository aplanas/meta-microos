SUMMARY = "Library for extraction of data and images from WebP container files"
DESCRIPTION = "The WebP Demux API enables extraction of images and extended format \
data from WebP files. This API currently supports reading of XMP/EXIF \
metadata, ICC profile and animated images."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebpdemux2-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "204f39d26cd3e29369e74d2e2c503a0c285be829f129981f64804db98a6ee15f4eb4a3560324b51c961dc85f7720765f04d677113a1898dbdfdfe8839fe36fc4"

RPROVIDES:${PN} += "libwebpdemux.so.2 \
libwebpdemux2"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libwebp.so.7"

inherit rpm
