SUMMARY = "SLURM auth NULL implementation (no authentication)"
DESCRIPTION = "This package cobtains the SLURM NULL authentication module."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-auth-none-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "71ce54e73e04c87c9bb199e079ca6ad4486c921cf4396e8758ac56dbbf95f77551958af131e465b09557482006bdea7421a49ec18064943b576676e673401347"

RPROVIDES:${PN} += "slurm-auth-none"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
slurm"

inherit rpm
