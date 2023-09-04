SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python39-libsmraw-20230320-2.1.aarch64.rpm"
RPM_HASH = "0730677db36e48154e3ef1f6c28a2fbd53ce6953523731a59ace4cde57df6ab455b22f9ba164460b2442f8728b8494e749a26cfee14a7f0ca4b0dd6a19bace44"

RPROVIDES:${PN} += "python39-libsmraw"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libsmraw.so.1 \
python-abi"

inherit rpm
