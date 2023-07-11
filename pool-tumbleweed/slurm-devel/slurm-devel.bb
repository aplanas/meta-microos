SUMMARY = "Development package for SLURM"
DESCRIPTION = "This package includes the header files for the SLURM API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-devel-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "d1317438e7ff9d80fb4a6c669c84c9aff55b15ab52f9bf9b1933186f865d6b11d27cf29bceca1ae097e9bf55306a23337aecbbc3f17f8c78cc365c9f6614985c"

RPROVIDES:${PN} += "pkgconfig-slurm \
slurm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpmi0 \
libslurm39 \
slurm"

inherit rpm
