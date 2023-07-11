SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "python311-libfwnt-20220922-2.7.aarch64.rpm"
RPM_HASH = "e977d63f3fc50db20c9575d1d1f04c99b864227c49fe26f2b3c23a3e9a378d96e1a969d318494babb2a6d63024dee0fed56fc9a35a076992a06aea9702416bc3"

RPROVIDES:${PN} += "python3-libfwnt \
python311-libfwnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfwnt.so.1 \
python-abi"

inherit rpm
