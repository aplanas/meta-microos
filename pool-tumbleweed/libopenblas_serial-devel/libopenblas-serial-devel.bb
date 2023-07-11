SUMMARY = "Development libraries for OpenBLAS, serial version"
DESCRIPTION = "OpenBLAS is an optimized BLAS library based on GotoBLAS2 1.13 BSD version. \
 \
This package contains the development libraries for serial OpenBLAS version."
LICENSE = "BSD-3-Clause"

PV = "0.3.21"

RPM_NAME = "libopenblas_serial-devel-0.3.21-5.4.aarch64.rpm"
RPM_HASH = "cad71ab712e49218ddf9eafc76e3672b2708387639c4551cadb3e3cdb0bdefd89547e4e47df7c31673bc3b0621122d987ddfb8ca4589ecc85c086dd84cccac7b"

RPROVIDES:${PN} += "libopenblas-serial-devel \
openblas-devel-other"

RDEPENDS:${PN} += "libopenblas-serial0 \
openblas-common-devel"

inherit rpm
