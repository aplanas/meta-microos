SUMMARY = "Converts between mac and unix fonts"
DESCRIPTION = "fondu allows you to convert a mac font into a unix one. ufond converts \
a unix font into a mac one. \
 \
Author: George Williams <gww at silcom.com>"
LICENSE = "BSD-3-Clause"

PV = "1.0.060102"

RPM_NAME = "fondu-1.0.060102-14.28.aarch64.rpm"
RPM_HASH = "ac4182c7cdd286e1dc3739db6a98e7a51eb7f641ab4868a07d8d004c299e136a36e54d23b2ac04d32b8c108cfd189b4ecd2b3fe507d45b40d1c348d68e04bd21"

RPROVIDES:${PN} += "fondu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
