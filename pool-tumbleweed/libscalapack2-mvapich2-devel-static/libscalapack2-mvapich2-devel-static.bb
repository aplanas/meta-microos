SUMMARY = "Static libraries for ScaLAPACK (mvapich2)"
DESCRIPTION = "This package contains static libraries for ScaLAPACK, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-mvapich2-devel-static-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "816f9b5616e7a902f6b8e5626dc5d3b35f38fcb32bf9a2c508152aa4b68bed4455851098bac585e90240c8ac390e0c7354cbe97a888056ee6c4a94c8ed63e74a"

RPROVIDES:${PN} += "libscalapack2-mvapich2-devel-static \
scalapack-mvapich2-devel-static"

RDEPENDS:${PN} += "libscalapack2-mvapich2-devel"

inherit rpm
