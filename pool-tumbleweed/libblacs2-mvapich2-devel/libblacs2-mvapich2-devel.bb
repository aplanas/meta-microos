SUMMARY = "Development libraries for BLACS (mvapich2)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against mvapich2."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-mvapich2-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "18f592fa589f3cc5a30229e2a7a3f4038143bf13f02539f4d4b42bb8f82002e1207e436b08d1656a7a32e70a01cd8fd590a1b3929c7fd3d6b32bbc599b543244"

RPROVIDES:${PN} += "blacs-mvapich2-devel \
libblacs.so.2.1.0 \
libblacs2-mvapich2-devel"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1 \
libblacs2-mvapich2 \
libc.so.6 \
libmpi.so.12 \
mvapich2-devel"

inherit rpm
