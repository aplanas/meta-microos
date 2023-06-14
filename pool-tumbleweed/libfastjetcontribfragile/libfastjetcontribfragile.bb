SUMMARY = "Shared library for fastjet-contrib"
DESCRIPTION = "This package provides the shared library for fastjet-contrib."
LICENSE = "GPL-2.0-only"

PV = "1.049"

RPM_NAME = "libfastjetcontribfragile-1.049-1.3.aarch64.rpm"
RPM_HASH = "ebb18549572816f1cab1595a09c2ab2a6773fdce9e8fe7f0c0b6ac1a8f55a2cef43b0c35e824785986cf4e8ddf6f1f642d0c4e897c201dfa193fa5f88c15f392"

RPROVIDES:${PN} += "libfastjetcontribfragile \
libfastjetcontribfragile.so"

RDEPENDS:${PN} += "libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
