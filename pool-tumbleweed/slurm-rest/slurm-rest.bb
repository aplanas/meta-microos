SUMMARY = "Slurm REST API Interface"
DESCRIPTION = "This package provides the interface to SLURM via REST API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-rest-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "e5de85314eb2de586d63c060f99053a596592fd6099545a93ab35670d49e4e0509f4503686c357ddd791fd5678805f15526083f2156e933877071a144f3747ea"

RPROVIDES:${PN} += "slurm-rest"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhttp-parser.so.2.9 \
libslurmfull.so \
slurm-config"

inherit rpm
