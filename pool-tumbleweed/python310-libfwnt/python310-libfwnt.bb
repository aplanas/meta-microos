SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "python310-libfwnt-20220922-3.1.aarch64.rpm"
RPM_HASH = "b54d0c94c577c1ec4de735c78eaa7222c13b6e8f972256a23a30b038c8a8002bd9ee17ae0a731b3f36a61f601491ee02088fc48590a631f81dc73bf6a205d9ac"

RPROVIDES:${PN} += "python310-libfwnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfwnt.so.1 \
python-abi"

inherit rpm
