SUMMARY = "SLURM ext_sensors/rrd Plugin (loadable shared objects)"
DESCRIPTION = "This package contains the ext_sensors/rrd plugin used to read data \
using RRD, a tool that creates and manages a linear database for \
sampling and logging data."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-plugin-ext-sensors-rrd-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "1d5715917a98df002fb55d3aab69cee3b4f9023db68b00ca5e88df9990a24aa15c6b268e0d03d3a5031d777bfc476035b5256f820fd6c237da7c6616e1be5c40"

RPROVIDES:${PN} += "slurm-plugin-ext-sensors-rrd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
slurm-plugins"

inherit rpm
