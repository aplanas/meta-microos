SUMMARY = "Library to access the Windows Shell Item format"
DESCRIPTION = "Library to access the Windows Shell Item format for the libyal family of libraries. \
libyal is typically used in digital forensic tools."
LICENSE = "GFDL-1.3-or-later & LGPL-3.0-or-later"

PV = "20230114"

RPM_NAME = "python39-libfwsi-20230114-1.7.aarch64.rpm"
RPM_HASH = "3475223864553c8f590b58d54d7a3bde8f0793c8bcd574192fcfc17d94b01413faa06418ac2eb0c454541363e1ddb6a4cbd4152544f0a63a7b743f40af812e7a"

RPROVIDES:${PN} += "python39-libfwsi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcerror.so.1 \
libclocale.so.1 \
libfguid.so.1 \
libfwsi.so.1 \
python-abi"

inherit rpm
