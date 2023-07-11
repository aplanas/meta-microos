SUMMARY = "Lua API for SLURM"
DESCRIPTION = "This package includes the Lua API to provide an interface to SLURM \
through Lua."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-lua-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "dff1ba615ba7948477cdb2db2f0efe9bfade33f1c08ef34ce3daff7707a6943a8d2e5fdb117139076e679a8cbf4f8c54f19ca6af912550d6ec41215b7c5c16b4"

RPROVIDES:${PN} += "slurm-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
slurm"

inherit rpm
