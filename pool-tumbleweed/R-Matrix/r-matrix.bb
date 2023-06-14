SUMMARY = "Package provides recommended R-Matrix"
DESCRIPTION = "This packages provides R-Matrix, one of the recommended packages."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "1.5.4"

RPM_NAME = "R-Matrix-1.5.4-45.2.aarch64.rpm"
RPM_HASH = "10422f7481bbf1697a8873eaaf68e4a399f3480f53bc6006bc927b32b9c1f1377d0c2f274078ddbf79fc93557812fc316507378e5b998a0bc9bd77701f097ec7"

RPROVIDES:${PN} += "R-Matrix \
R-Matrix-devel"

RDEPENDS:${PN} += "R-base \
ld-linux-aarch64.so.1 \
libR.so \
libRblas.so \
libRlapack.so \
libc.so.6 \
libm.so.6"

inherit rpm
