SUMMARY = "Lua API for SLURM"
DESCRIPTION = "This package includes the Lua API to provide an interface to SLURM \
through Lua."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-lua-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "c246916bada645e76c6cf8667c76fed6afbb0bed5b1bb2aacca90bda88d87895904e1865cadcb85b9d3f4b58c354ed4485d265c0d1f8cecf5b21ef34ed90fdb0"

RPROVIDES:${PN} += "slurm-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
slurm"

inherit rpm
