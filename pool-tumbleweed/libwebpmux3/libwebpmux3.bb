SUMMARY = "Library for reading/adding data to WebP container files"
DESCRIPTION = "The WebP Mux API contains methods for adding data to and reading data \
from WebP files. This API currently supports XMP/EXIF metadata, ICC \
profile and animation."
LICENSE = "BSD-3-Clause"

PV = "1.3.1"

RPM_NAME = "libwebpmux3-1.3.1-1.1.aarch64.rpm"
RPM_HASH = "c8d1ed71d99beab9bd9cf1c1ad2628541315af79e66675cf04e81a362400f936cd8f919242cce3ee08b13ee4a191b60e2a800e2cff3fc2139edea742769c1427"

RPROVIDES:${PN} += "libwebpmux.so.3 \
libwebpmux3"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6 \
libwebp.so.7"

inherit rpm
