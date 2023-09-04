SUMMARY = "Development package for SLURM"
DESCRIPTION = "This package includes the header files for the SLURM API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-devel-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "7aa25f18bd3766bca6cb00344ba08bf92173e9178cdab48249b9dcfb3ae9c152eb2e805652f476131350ad8605d66e2c06c9110f4ec75fb58458c68d1e2e4184"

RPROVIDES:${PN} += "pkgconfig-slurm \
slurm-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libpmi0 \
libslurm39 \
slurm"

inherit rpm
