SUMMARY = "Library to support the Windows Resource Compiler format"
DESCRIPTION = "libwrc is a library to support the Windows Resource Compiler format."
LICENSE = "LGPL-3.0-or-later"

PV = "20230318"

RPM_NAME = "libwrc1-20230318-1.4.aarch64.rpm"
RPM_HASH = "c8a6a0c47e08c16d0186ccc012b9b9007ac252593846f3c2512f2f66f1cc621ea0c3a0dc1942678020eaa04409f3cfb0c384d8c99db74c2b965313957a669124"

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
