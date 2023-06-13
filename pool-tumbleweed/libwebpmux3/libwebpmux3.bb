SUMMARY = "Library for reading/adding data to WebP container files"
DESCRIPTION = "The WebP Mux API contains methods for adding data to and reading data \
from WebP files. This API currently supports XMP/EXIF metadata, ICC \
profile and animation."
LICENSE = "BSD-3-Clause"

PV = "1.3.0"

RPM_NAME = "libwebpmux3-1.3.0-1.1.aarch64.rpm"
RPM_HASH = "4f59d68e4ec721ccc251c8347071decfa6c2007250337ea88d85daf3e70b679d229caf21c05f3885005c4e76c74d2e146ad04f0e0cb1ee8bee2e85793fe10e87"

RPROVIDES:${PN} += "libwebpmux.so.3()(64bit) \
libwebpmux3 \
libwebpmux3(aarch-64)"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libm.so.6()(64bit) \
libwebp.so.7()(64bit)"

inherit rpm
