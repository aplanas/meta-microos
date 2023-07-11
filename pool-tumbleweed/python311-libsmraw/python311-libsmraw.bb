SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python311-libsmraw-20230320-1.7.aarch64.rpm"
RPM_HASH = "f90d334a18ec0423ea4a7db4d9b59fe9c663fa18214ece9ae586859e1a175871c03770509d635bfe0cdfbc24c38c451737356c34684601622ce87b916d807d1e"

RPROVIDES:${PN} += "python3-libsmraw \
python311-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
