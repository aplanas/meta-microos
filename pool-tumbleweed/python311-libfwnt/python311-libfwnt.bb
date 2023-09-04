SUMMARY = "Library for Windows NT data types"
DESCRIPTION = "Library to provide Windows NT data type support for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20220922"

RPM_NAME = "python311-libfwnt-20220922-3.1.aarch64.rpm"
RPM_HASH = "d1872ca56377cdefab8d4e53d7f64f847bf330939e49127c453a36c858e609cfe40286a4e992017e9589e6e037d0ff31bb29c9487cb0b045b1881f46e397186d"

RPROVIDES:${PN} += "python3-libfwnt \
python311-libfwnt"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libfwnt.so.1 \
python-abi"

inherit rpm
