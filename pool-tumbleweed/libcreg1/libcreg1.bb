SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg1-20210625-6.1.aarch64.rpm"
RPM_HASH = "7bf8cbdd2b4aa85bd2ae290dff072d418fb0a976d1736e9e1cf60361499dc3a112668df9d2fa3a2df848a065a8af6f35a34e2746b9fe75ec6d06a35aa89940de"

RPROVIDES:${PN} += "libcreg.so.1 \
libcreg1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libbfio.so.1 \
libc.so.6 \
libcdata.so.1 \
libcerror.so.1 \
libclocale.so.1 \
libcnotify.so.1 \
libcthreads.so.1 \
libfcache.so.1 \
libfdata.so.1 \
libuna.so.1"

inherit rpm
