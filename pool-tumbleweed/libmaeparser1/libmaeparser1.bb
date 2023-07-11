SUMMARY = "The maeparser shared library"
DESCRIPTION = "This package contains the maeparser shared library."
LICENSE = "MIT"

PV = "1.3.1"

RPM_NAME = "libmaeparser1-1.3.1-1.5.aarch64.rpm"
RPM_HASH = "596c6e5ad69fa1190f26170abb9ff2f874989930febf863e873d03a863a5a9a13d447ce8469fb69840ccb29d07874599c9b8694ec875f2403f9d8506ee25a9a3"

RPROVIDES:${PN} += "libmaeparser.so.1 \
libmaeparser1"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libboost-iostreams.so.1.82.0 \
libc.so.6 \
libgcc-s.so.1 \
libstdc++.so.6"

inherit rpm
