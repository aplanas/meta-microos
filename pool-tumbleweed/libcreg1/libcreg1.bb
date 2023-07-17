SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg1-20210625-5.10.aarch64.rpm"
RPM_HASH = "c73c41f7fc1e14ab361d66e1e2d666560a8fe79fc62ff193a4722339028e298a4efddc01f53f3a3af141347f2aa286ab04ca7c4a9e15ee07e58d472b6e6562dd"

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
