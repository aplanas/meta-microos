SUMMARY = "Development libraries for BLACS (openmpi3)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi3."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi3-devel-2.1.0-9.11.aarch64.rpm"
RPM_HASH = "e452600def21a2115eac1e4d51c57ece8a366a232c33397a42ecaf54c3a53e43938cdf49f315cb9e3f8801d1b2bb80578a408d5c840aadc687d481a5ec3312c0"

RPROVIDES:${PN} += "blacs-openmpi3-devel \
libblacs.so.2.1.0 \
libblacs2-openmpi3-devel"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1 \
libblacs2-openmpi3 \
libc.so.6 \
libmpi.so.40 \
openmpi3-devel"

inherit rpm
