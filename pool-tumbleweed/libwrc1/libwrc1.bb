SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc1-20230318-1.5.aarch64.rpm"
RPM_HASH = "b45f3b06c4f44b0ae1812a877fc27b4778aef74126319b5c5f812d4b21172f4a9eacc8e6957b27049f9d3bae7021938243437668e0b4a656aa1498ca1096fdde"

RPROVIDES:${PN} += "libwrc.so.1 \
libwrc1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libfvalue.so.1 \
libuna.so.1"

inherit rpm
