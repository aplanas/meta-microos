SUMMARY = "Static libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-mvapich2-devel-static-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "809520f3ccde2e425699c88411903476e6b4e38fa3e5af45ecbbceec33aa4c76ec7362e6fe2dbcdfeda0866a6acd17e0f7fe3091f8be4ce449ae90eda3485d72"

RPROVIDES:${PN} += "libscalapack2-mvapich2-devel-static \
scalapack-mvapich2-devel-static"

RDEPENDS:${PN} += "libscalapack2-mvapich2-devel"

inherit rpm
