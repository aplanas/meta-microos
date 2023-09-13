SUMMARY = "Development package for SLURM"
DESCRIPTION = "This package includes the header files for the SLURM API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-devel-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "e66d76edc6f78709810bcd8cf380f9c1e722a0dc99394a54377cffa8b8d344bd3f2fe88b0cedbbac5dadf633077ae1cb959fd9728e089110ba41dfb5e809bb66"

RPROVIDES:${PN} += "pkgconfig-slurm \
slurm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpmi0 \
libslurm39 \
slurm"

inherit rpm
