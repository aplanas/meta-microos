SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python39-libsmraw-20230320-1.7.aarch64.rpm"
RPM_HASH = "62d5fd049301f5191ee73fbcebfdb64ba8b594684b3d410c2b12e588cd3b9f99a66be9e321752f34cdac2277933a1535535a2c660e99d71c2eadc2d36e504563"

RPROVIDES:${PN} += "python39-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
