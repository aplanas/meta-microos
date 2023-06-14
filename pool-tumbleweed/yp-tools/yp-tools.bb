SUMMARY = "Network Information Service (YP) client utilities"
DESCRIPTION = "This packages contains some useful tools for accessing NIS maps or to \
test NIS configurations."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "4.2.3"

RPM_NAME = "yp-tools-4.2.3-3.11.aarch64.rpm"
RPM_HASH = "dad28a9a51cd8d3e10809cc8249e117ea1297e65a1cd065ed3f88877553581a32fe22c9006c1462df0f03a74676a30c47cbc9dd5b37533ad0de2fd8925fe2659"

RPROVIDES:${PN} += "yp-tools"

RDEPENDS:${PN} += "/bin/sh \
ld-linux-aarch64.so.1 \
libc.so.6 \
libcrypt.so.1 \
libnsl.so.3 \
libtirpc.so.3"

inherit rpm
