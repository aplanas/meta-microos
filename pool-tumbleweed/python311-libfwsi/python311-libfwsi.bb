SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "python311-libfwsi-20230710-1.1.aarch64.rpm"
RPM_HASH = "10442f2a4aecdd7cfac1206d08ba25f608d12087e2c27454763b7bc2a2ec1ce2b29244a853960b8434081e98760a0bbc021db66fb5508f068f083d111d64cb86"

RPROVIDES:${PN} += "python3-libfwsi \
python311-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
