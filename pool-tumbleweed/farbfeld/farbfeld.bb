SUMMARY = "Farbfeld image conversion tools"
DESCRIPTION = "Tools for converting images into and from the suckless.org farbfeld \
format, which is practically the same as the Netpbm P7 RGB_ALPHA \
format, only with a custom header."
LICENSE = "ISC"

PV = "4"

RPM_NAME = "farbfeld-4-2.4.aarch64.rpm"
RPM_HASH = "a1e36227cee103d91b3172912c6e45beb25b20bf654a2d15dc052a78708eccdcd423e64d9d4282f167ded722829493fd4040c8f88fde6549c1e2c3327a64262b"

RPROVIDES:${PN} += "farbfeld"

RDEPENDS:${PN} += "/usr/bin/sh \
libc.so.6 \
libjpeg.so.8 \
libpng16.so.16"

inherit rpm
