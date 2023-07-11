SUMMARY = "Library to access Windows 9x/Me REGF-type Registry files"
DESCRIPTION = "libcreg is a library to access Windows 9x/Me Registry files of the REGF \
type (a non-text representation)."
LICENSE = "LGPL-3.0-or-later"

PV = "20210625"

RPM_NAME = "libcreg1-20210625-5.9.aarch64.rpm"
RPM_HASH = "dbd99f6f1fdbebb8d8fb420c4b55de962e334e21c370ae3271b852908cfcc46774120d3b0ca8895852d85d32e8dac43aebadbfffba103d57a57b72cf1c655884"

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
