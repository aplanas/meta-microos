SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python39-libsmraw-20230320-1.8.aarch64.rpm"
RPM_HASH = "706a29a2edc5d9ff8b6fbe417de4011f01e9127595241dce9c45735f977d19092d680d2383a7a97942f1955053838b8c03d2f8415da2f6c5fd9e7b801ab459b9"

RPROVIDES:${PN} += "python39-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
