SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg1-20210625-5.7.aarch64.rpm"
RPM_HASH = "ee67a166128d9a8b9a3c7eb30e5d7115ecdf43d6a309575aa014eb098702ec9acf6b31980dd5e71f533cc3526e7e22c12ed3a1d90ae926ce853fa45913f1ccb5"

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
