SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python310-libmodi-20221023-4.1.aarch64.rpm"
RPM_HASH = "80f809a7f92b8c22315ce9cfc7beabfd8d44f24b55e66bffd5ff7bcf266416b63a15e91958162c2defa853d551f913305720377127b1a6dbe15244235ea3f859"

RPROVIDES:${PN} += "python310-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
