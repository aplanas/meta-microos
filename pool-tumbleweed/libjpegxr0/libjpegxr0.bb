SUMMARY = "Open source implementation of jpegxr"
DESCRIPTION = "This is an open source implementation of the jpegxr image format standard. \
 \
This package the libjpegexr shared library"
LICENSE = "BSD-2-Clause"

PV = "1.1"

RPM_NAME = "libjpegxr0-1.1-4.10.aarch64.rpm"
RPM_HASH = "8a3f8d088bcf3b3105d6bb9b60b52e700ae1b8df503bd523d9995e317f42e0543a0cfcd647f6a20b1401d24c51e18893eee3a279951b87079e83737419da3207"

RPROVIDES:${PN} += "libjpegxr.so.0 \
libjpegxr0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6"

inherit rpm
