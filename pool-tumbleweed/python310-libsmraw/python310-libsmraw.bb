SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python310-libsmraw-20230320-2.1.aarch64.rpm"
RPM_HASH = "fcb462306f690904c12117c8030afe49db041c11a77f0b6ea8d2747e3b9ff7ff730817e5c9c4ff59a2e421fb07d835b709915f216a3355ab922dc9ecc26ee57b"

RPROVIDES:${PN} += "python310-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
