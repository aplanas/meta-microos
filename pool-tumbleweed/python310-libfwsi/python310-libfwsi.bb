SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "python310-libfwsi-20230114-1.7.aarch64.rpm"
RPM_HASH = "168497504cfbcd8f0fbc54ce1ab2a68e7b8c1a4623f66f6de44d6be3a41626669ea720e34dbd125657b3458bf7f9b96f88e356b19bc17753121a9697b461b4f5"

RPROVIDES:${PN} += "python310-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
python-abi"

inherit rpm
