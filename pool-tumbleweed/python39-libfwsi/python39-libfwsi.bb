SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "python39-libfwsi-20230710-1.1.aarch64.rpm"
RPM_HASH = "e7adb26b285caf76a042c8cb2bc5ad1fc4b3f84b2c1391c34569a98adae674fecb4edaab2e825fd4a15102f2de45fba3c48ddbb9d10f68388813d7c8e113472a"

RPROVIDES:${PN} += "python39-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
