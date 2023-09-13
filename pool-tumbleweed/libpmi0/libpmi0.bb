SUMMARY = "SLURM PMI Library"
DESCRIPTION = "This package contains the library needed to run programs dynamically linked \
with SLURM."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "libpmi0-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "ec88a4f10d984678be557abf0d0a5fe7691742c99907489deda4bd3808850adcb7e43d18ecc94e9dfbd49cd054e99e13a74ea7c45a98e0ff3a57729496b996e3"

RPROVIDES:${PN} += "libpmi.so.0 \
libpmi0 \
libpmi2.so.0"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libslurm-pmi.so"

inherit rpm
