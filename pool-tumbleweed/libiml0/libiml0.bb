SUMMARY = "An Integer Matrix Library"
DESCRIPTION = "IML package provides routines to solve nonsingular systems of linear \
equations, solve any shape systems of linear equations, and perform \
mod p matrix operations, such as computing row-echelon form, \
determinant, rank profile, inverse of a mod p matrix."
LICENSE = "BSD-3-Clause"

PV = "1.0.5"

RPM_NAME = "libiml0-1.0.5-5.12.aarch64.rpm"
RPM_HASH = "b6bb8ba163fda23e03fd9f4d527c61d4e00a6f21ed7a25e9fa2645fcfaa115ad5d228532fd371b76fee3aa03f5ccf111576b4930d649a96be26d6f756f0dc27d"

RPROVIDES:${PN} += "libiml.so.0 \
libiml0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgmp.so.10 \
libm.so.6 \
libopenblas.so.0"

inherit rpm
