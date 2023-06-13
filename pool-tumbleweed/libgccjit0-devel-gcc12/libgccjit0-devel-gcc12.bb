SUMMARY = "Support for embedding GCC inside programs and libraries"
DESCRIPTION = "Package contains header files and documentation for GCC JIT front-end."
LICENSE = "GPL-3.0-or-later"

PV = "12.3.0+git1204"

RPM_NAME = "libgccjit0-devel-gcc12-12.3.0+git1204-1.1.aarch64.rpm"
RPM_HASH = "b7b7f43076beb3c6e7ff584d6e9f7731db5952747949c1147e0ad67d7d486275541fe699fa078c118da017f9557c6d77ae673cadcf83aec109ece3ffaec6c021"

RPROVIDES:${PN} += "libgccjit0-devel \
libgccjit0-devel-gcc12 \
libgccjit0-devel-gcc12(aarch-64)"

RDEPENDS:${PN} += "libgccjit0-gcc12"

inherit rpm
