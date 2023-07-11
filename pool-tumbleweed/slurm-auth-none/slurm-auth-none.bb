SUMMARY = "SLURM auth NULL implementation (no authentication)"
DESCRIPTION = "This package cobtains the SLURM NULL authentication module."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-auth-none-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "d4b4d40376c0a6b9cce0128e1ddc34fb524b30e0656a459e3560d7a7bf0f508a210910c030899fa35c5494674c6ccee24f0c2e7475fc98f514711b65aa92a3b4"

RPROVIDES:${PN} += "slurm-auth-none"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
slurm"

inherit rpm
