SUMMARY = "Development libraries for BLACS (openmpi1)"
DESCRIPTION = "This package contains development libraries for BLACS, compiled against openmpi1."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libblacs2-openmpi1-devel-2.1.0-9.12.aarch64.rpm"
RPM_HASH = "cc74aa71d9df357fea5c88f6f5c9bae7ed6ea23928b162d3d525f5d62f6dc6a31635636c1bf35ca3ec566d4617e039443672f48bde123ef46110f47ef19f7817"

RPROVIDES:${PN} += "blacs-openmpi1-devel \
libblacs.so.2.1.0 \
libblacs2-openmpi1-devel"

RDEPENDS:${PN} += "blacs-devel-headers \
ld-linux-aarch64.so.1 \
libblacs2-openmpi1 \
libc.so.6 \
libmpi.so.12 \
openmpi1-devel"

inherit rpm
