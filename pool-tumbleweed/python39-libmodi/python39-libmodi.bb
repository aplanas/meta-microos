SUMMARY = "Library and tools to access the Mac OS disk image formats"
DESCRIPTION = "libmodi is a library to access the Mac OS disk image formats. \
 \
Part of the libyal family of libraries."
LICENSE = "LGPL-3.0-or-later"

PV = "20221023"

RPM_NAME = "python39-libmodi-20221023-3.12.aarch64.rpm"
RPM_HASH = "07ba3f2fa3c8af632ae1f06cdd3697ef6374e3c7692a656265412b825e3fd2b2201f9db36ff9c86d173967110fa15094202d44f98ac70ed823aacfcaf24942b4"

RPROVIDES:${PN} += "python39-libmodi"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcerror.so.1 \
libmodi.so.1 \
python-abi"

inherit rpm
