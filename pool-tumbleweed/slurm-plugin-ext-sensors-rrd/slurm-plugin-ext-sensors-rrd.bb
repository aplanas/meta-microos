SUMMARY = "SLURM ext_sensors/rrd Plugin (loadable shared objects)"
DESCRIPTION = "This package contains the ext_sensors/rrd plugin used to read data \
using RRD, a tool that creates and manages a linear database for \
sampling and logging data."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-plugin-ext-sensors-rrd-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "369cb2dbd32dfdf9d2d52306a93b9aa172dd19f1f54ea934c55f275eeaa9e718d6e0a5314c23c92753cbd1ff19e6ad24979c643e421503a5e5abd9b8ef212d15"

RPROVIDES:${PN} += "slurm-plugin-ext-sensors-rrd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
slurm-plugins"

inherit rpm
