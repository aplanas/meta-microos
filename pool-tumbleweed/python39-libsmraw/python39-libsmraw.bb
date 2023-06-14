SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python39-libsmraw-20230320-1.3.aarch64.rpm"
RPM_HASH = "372440a14e8eb0598eab2a8f72ca138970f3b8e53dad73899e429efcf73f6166c35fbca8a05db6c54e888b2127171430e8d9ce4c49624e2fd8dcf1b51517ef49"

RPROVIDES:${PN} += "python39-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
