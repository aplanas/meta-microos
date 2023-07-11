SUMMARY = "Package provides recommended R-MASS"
DESCRIPTION = "This packages provides R-MASS, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "7.3.60"

RPM_NAME = "R-MASS-7.3.60-46.1.aarch64.rpm"
RPM_HASH = "70e5ee4c4fd5f0720d764ae6018d27bae4ba07337e676094458e5bb9940524e2ccec33a40920df5be3a4cd5303236c3d62b4f409a6f518d978f262e03f7d2070"

RPROVIDES:${PN} += "R-MASS"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libc.so.6"

inherit rpm
