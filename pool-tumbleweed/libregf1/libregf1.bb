SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf1-20230319-1.6.aarch64.rpm"
RPM_HASH = "145ff7f33d639e81b2f58db711151be50206222f9da0d96cc31ee0aa7c648cf03d861c100163f69b3f29466c3047c9d967bcddd67bd7b530aa1fa7c1fa7c69fe"

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
