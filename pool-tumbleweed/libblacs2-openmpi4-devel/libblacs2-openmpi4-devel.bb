SUMMARY = "Development libraries for BLACS (openmpi4)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi4."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi4-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "c86a9c189f6b7b078f24a2e7d4bec9c634d1b292e82f2b714b0f6f068b324009b3f57f4b449cf09d917338c4025244f32226e57ad47a6f1bad9513c8c07dc102"

RPROVIDES:${PN} += "blacs-openmpi4-devel \
libblacs.so.2.1.0 \
libblacs2-openmpi4-devel"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1 \
libblacs2-openmpi4 \
libc.so.6 \
libmpi.so.40 \
openmpi4-devel"

inherit rpm
