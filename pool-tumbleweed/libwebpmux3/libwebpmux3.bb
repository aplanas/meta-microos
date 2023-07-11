SUMMARY = "Library for reading/adding data to WebP container files"
DESCRIPTION = "The WebP Mux API contains methods for adding data to and reading data \
from WebP files. This API currently supports XMP/EXIF metadata, ICC \
profile and animation."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebpmux3-1.3.0-2.1.aarch64.rpm"
RPM_HASH = "ce841ff8f39c039bce4a445e4c40b21d12b89fe12a9bc90be7ee8c765900e967413968310549471cd4f88e9b27c851c53d97f5f8ed9e311b05d24ce49f5c51a8"

RPROVIDES:${PN} += "libwebpmux.so.3 \
libwebpmux3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libwebp.so.7"

inherit rpm
