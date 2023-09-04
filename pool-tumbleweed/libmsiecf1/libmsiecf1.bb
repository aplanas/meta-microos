SUMMARY = "Library to parse MS Internet Explorer Cache Files"
DESCRIPTION = "libmsiecf is a library to parse MS Internet Explorer Cache Files."
LICENSE = "LGPL-3.0-or-later"

PV = "20221024"

RPM_NAME = "libmsiecf1-20221024-4.1.aarch64.rpm"
RPM_HASH = "51d1a88641f4fa86530618386c756f7eb10208e902efb4538c0efd4c6cf1beda4555aff55a985defb257c6bd7695f0d0de60951b89b275e5885c9cd89f41b6bb"

RPROVIDES:${PN} += "libmsiecf.so.1 \
libmsiecf1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfvalue.so.1"

inherit rpm
