SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230710"

RPM_NAME = "python39-libfwsi-20230710-2.1.aarch64.rpm"
RPM_HASH = "51000bcf6dc753fd77253f865aa0976d8a4bcdeaac98bbf928aafcdc5b933ce07ec85cebb401066448a9b5842a3290d4129584cef395268236d18f721ba73956"

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
