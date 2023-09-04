SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "python311-libfwps-20230711-2.1.aarch64.rpm"
RPM_HASH = "a990f7a7f78a5d4773cc2bc7eb1740019eb0aaf43d40a30f2c7c1e7d5526bc57d5024fee35d070a98c89ec05c391e237888b2226cb458361964a782b0d8ab482"

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
