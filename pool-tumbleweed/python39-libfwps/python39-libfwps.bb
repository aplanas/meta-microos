SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "python39-libfwps-20230711-1.1.aarch64.rpm"
RPM_HASH = "c25c9d0f01fe65f43b773702d781bb1463bbfa3ae8500a132942024de69b139cc1cc47003dbfd14cb458f799afa637fe5084c424353f76f6b4b0f912516e1730"

RPROVIDES:${PN} += "python39-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
