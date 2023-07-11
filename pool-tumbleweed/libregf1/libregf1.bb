SUMMARY = "Library to access Windows REGF-type Registry files"
DESCRIPTION = "libregf is a library to access Windows Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20230319"

RPM_NAME = "libregf1-20230319-1.5.aarch64.rpm"
RPM_HASH = "568e15c8bef0fb77146711a3381862d49846d96ab902de6f33212bf73d51fa076371320c4f344f6964538e338b6daeb01ba5a06025e7aab79276648995bcfca5"

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
