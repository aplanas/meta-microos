SUMMARY = "Lisp-like functional and imperative programming language"
DESCRIPTION = "Janet is a functional and imperative programming language."
LICENSE = "MIT"

PV = "1.28.0"

RPM_NAME = "libjanet1_28-1.28.0-2.1.aarch64.rpm"
RPM_HASH = "f5c12080c834736f888df504073c9f8f3c46256c5874ebbf54599ae76a4fa09a77583b2e2a79cff81611fddc5ec1691db025af6b6bfd1e77e1c1962ac08c9287"

RPROVIDES:${PN} += "libjanet.so.1.28 \
libjanet1-28"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libm.so.6"

inherit rpm
