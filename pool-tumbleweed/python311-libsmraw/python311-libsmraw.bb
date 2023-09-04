SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python311-libsmraw-20230320-2.1.aarch64.rpm"
RPM_HASH = "2f04551473617ef6525ad10e6b2ebb7300ebe16bbdfd57c3e4fff13b83f9c5edef0bfe75c780baefa1191ba3adf404baec860cd8af0d76303a364bda55ddcd57"

RPROVIDES:${PN} += "python3-libsmraw \
python311-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
