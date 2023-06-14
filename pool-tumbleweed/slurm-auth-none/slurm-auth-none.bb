SUMMARY = "SLURM auth NULL implementation (no authentication)"
DESCRIPTION = "This package cobtains the SLURM NULL authentication module."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-auth-none-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "12f0b29fe0d5b29893992a54997e31cb47363f0c0f53696a516b4fc5a3d49644f36b3612573c5e66745802c95304a4ebef5dab1ade81534c503e77ef96223ec9"

RPROVIDES:${PN} += "slurm-auth-none"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
slurm"

inherit rpm
