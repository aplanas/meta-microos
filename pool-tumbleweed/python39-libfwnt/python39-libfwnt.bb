SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "python39-libfwnt-20220922-2.7.aarch64.rpm"
RPM_HASH = "03aea374b0a14f276eb451d4cf3f4b794b22c44a644a5ba7c38a49cde3c5284e91685d4808f60808530c578f96e4b2b7340bd1781b4c6f3bd7b8786ebbead13d"

RPROVIDES:${PN} += "python39-libfwnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfwnt.so.1 \
python-abi"

inherit rpm
