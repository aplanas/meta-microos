SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "python311-libfwsi-20230114-1.7.aarch64.rpm"
RPM_HASH = "9cc45279499700965c04760bc3e3e041fa1077a1b906ca989aa1281835830ed121103d2483f823171b1826b4da08f1fd394a23b52d2c0c8f03a8025e1ef879b8"

RPROVIDES:${PN} += "python3-libfwsi \
python311-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
python-abi"

inherit rpm
