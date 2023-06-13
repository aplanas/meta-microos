SUMMARY = "Library and tools to access the (split) RAW image format"
DESCRIPTION = "libsmraw is a library to access the storage media RAW format. \
The library supports both RAW and split RAW."
LICENSE = "LGPL-3.0-or-later"

PV = "20230320"

RPM_NAME = "python311-libsmraw-20230320-1.3.aarch64.rpm"
RPM_HASH = "80092bf873c45736f7171e91dd998e99096824bae1a1a44d08d0d2d0b6db3534357f21fc00fdcba6dfb6738ce77effb1f7bdbe61e3feecc18740a4679d336ec1"

RPROVIDES:${PN} += "python311-libsmraw \
python311-libsmraw(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libbfio.so.1()(64bit) \
libbfio.so.1(V_20221025)(64bit) \
libc.so.6(GLIBC_2.17)(64bit) \
libcerror.so.1()(64bit) \
libcerror.so.1(V_20220101)(64bit) \
libsmraw.so.1()(64bit) \
libsmraw.so.1(V_20230320)(64bit) \
python(abi)"

inherit rpm
