SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python310-libsmraw-20230320-1.8.aarch64.rpm"
RPM_HASH = "1161ae2ce55bbd772aa90f84e89ebe050f76cef83d81b730924dbb87aeaf137ddf64eaba0b80a7ca0e9d987df798b7f4de810629b692eafb2a36a344db1ff620"

RPROVIDES:${PN} += "python310-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
