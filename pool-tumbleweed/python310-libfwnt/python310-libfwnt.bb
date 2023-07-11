SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "python310-libfwnt-20220922-2.7.aarch64.rpm"
RPM_HASH = "d21a2e35b389177c50f0207d99392965b280e653b7a68c5e5f3c7ad2345c9eb7e4ce29c072ddbabfe5998f9c8b74f030d86571afd1142bab04be4841c78e5b07"

RPROVIDES:${PN} += "python310-libfwnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfwnt.so.1 \
python-abi"

inherit rpm
