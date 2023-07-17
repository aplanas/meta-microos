SUMMARY = "Library for Windows Property Store data types"
DESCRIPTION = "libfwps is a library for Windows Property Store data types. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20230711"

RPM_NAME = "python310-libfwps-20230711-1.1.aarch64.rpm"
RPM_HASH = "7d0a31c8bb748191f1cce01841bd9e06cbbb35e44a740d5e107ca0b0778a207fc903550a860a20372724948f9077332bf5736acf9e893259fb322a74036e81cb"

RPROVIDES:${PN} += "python310-libfwps"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfguid.so.1 \
libfwps.so.1 \
libuna.so.1 \
python-abi"

inherit rpm
