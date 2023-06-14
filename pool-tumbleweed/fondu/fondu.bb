SUMMARY = "Converts between mac and unix fonts"
DESCRIPTION = "fondu allows you to convert a mac font into a unix one. ufond converts \
a unix font into a mac one. \
 \
Author: George Williams <gww at silcom.com>"
LICENSE = "BSD-3-Clause"

PV = "1.0.060102"

RPM_NAME = "fondu-1.0.060102-14.27.aarch64.rpm"
RPM_HASH = "e3efcf411ffb04012a9c9bd9a4f2f0f5422ef1a1be99fe97e0f6aa250e704b236bfe2a6d7b079932b0158f2b3fab0d14185a309e5f60c099985b7f6e9f41e1eb"

RPROVIDES:${PN} += "fondu"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
