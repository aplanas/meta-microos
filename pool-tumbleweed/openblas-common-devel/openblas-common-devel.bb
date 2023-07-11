SUMMARY = "Development headers and libraries for OpenBLAS"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains headers for OpenBLAS."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "openblas-common-devel-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "113f8525b35472f4b0d5731fb357ba234bb46780a0c0781716a54ea9c54d4584eee535845e4abfa020ebe5fe51199625ff5b8fdee236dadb5a3044b5cedc1f41"

RPROVIDES:${PN} += "openblas-common-devel \
openblas-devel-headers \
pkgconfig-openblas"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
/usr/bin/sh"

inherit rpm
