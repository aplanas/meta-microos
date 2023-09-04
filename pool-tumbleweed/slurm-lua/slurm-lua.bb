SUMMARY = "Lua API for SLURM"
DESCRIPTION = "This package includes the Lua API to provide an interface to SLURM \
through Lua."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-lua-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "d82cda601338413772b50c42a6a9f0f50097cc7e8b76b01722b0b378afa4e7dfb8c70306a9d361c12768545246facdb230ea7422c8da9311fb61e4142ee0a5c7"

RPROVIDES:${PN} += "slurm-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
slurm"

inherit rpm
