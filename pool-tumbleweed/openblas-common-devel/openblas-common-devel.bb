SUMMARY = "Development headers and libraries for OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains headers for OpenBLAS."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas-common-devel-0.3.21-5.3.aarch64.rpm"
RPM_HASH = "ad7f2213881b567861d5222d2617ff22c29c293d5658b2499c60ea23ea29028c55f814cbc48aa5eb618c686fb8bb65546c4d06a5eb8da19c791585f1fbce8e2f"

RPROVIDES:${PN} += "openblas-common-devel \
openblas-devel-headers \
pkgconfig-openblas"

RDEPENDS:${PN} += "-openblas-devel(default) or openblas-devel(other) \
/bin/sh \
/usr/bin/pkg-config"

inherit rpm
