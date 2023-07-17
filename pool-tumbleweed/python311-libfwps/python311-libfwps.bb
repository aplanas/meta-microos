SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "python311-libfwps-20230711-1.1.aarch64.rpm"
RPM_HASH = "8fcf182b5ff1707e286025d76e99537061d7f48f2a9f4a3a2496e3e5cf9de4bc168d68d3edd20b853151317886086e246e563f885c9bf1bcc22c6649897a3dc8"

RPROVIDES:${PN} += "python3-libfwps \
python311-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
