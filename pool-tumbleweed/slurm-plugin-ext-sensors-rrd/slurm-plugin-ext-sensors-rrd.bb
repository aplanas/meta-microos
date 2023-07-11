SUMMARY = "SLURM ext_sensors/rrd Plugin (loadable shared objects)"
DESCRIPTION = "This package contains the ext_sensors/rrd plugin used to read data \
using RRD, a tool that creates and manages a linear database for \
sampling and logging data."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-plugin-ext-sensors-rrd-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "a3f438c56b7fa37b877c6b8880c723fa25a6e5c5299b8b8892d5f6ccbadb2d4e17c1130ed3129d0ea3806597a016148ad0f2e3870cf6c00825b8ab8e4ce4989e"

RPROVIDES:${PN} += "slurm-plugin-ext-sensors-rrd"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
librrd.so.8 \
slurm-plugins"

inherit rpm
