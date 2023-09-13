SUMMARY = "Lua API for SLURM"
DESCRIPTION = "This package includes the Lua API to provide an interface to SLURM \
through Lua."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-lua-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "f8670b79183929ac5749b84db035f27f9fc50c1e0c900ebfc1aee5eaf6af4671d512133b1fd239def51317ca097b86941f48a0b18b2f263e175f6216d225b07c"

RPROVIDES:${PN} += "slurm-lua"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
liblua5.4.so.5 \
slurm"

inherit rpm
