SUMMARY = "Opensm runtime library"
DESCRIPTION = "This package contains one of the opensm runtime libraries."
LICENSE = "BSD-2-Clause | GPL-2.0-only"

PV = "3.3.24"

RPM_NAME = "libopensm9-3.3.24-3.8.aarch64.rpm"
RPM_HASH = "e0e9a367b09e37157ff057f779544a00a221ed423bd7398fcf0cf6635d3161b1fb8eb315ce46080709f44580a5528888336aaab5089a33fd66dcf89e5553ec6c"

RPROVIDES:${PN} += "libopensm.so.9 \
libopensm9"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libosmcomp.so.5"

inherit rpm
