SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf1-20230319-1.2.aarch64.rpm"
RPM_HASH = "47cffc110b1768bcc80adfbd04c401d94ee7c0f06a16ab957f1da9e0898cc9d58b4ecb570f1540c88e89bf191677004cdd65830a8b8e6ca98969f427238bb345"

RPROVIDES:${PN} += "libregf.so.1 \
libregf1"

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
