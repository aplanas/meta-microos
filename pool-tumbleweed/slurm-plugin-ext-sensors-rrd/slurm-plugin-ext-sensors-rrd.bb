SUMMARY = "SLURM ext_sensors/rrd Plugin (loadable shared objects)"
DESCRIPTION = "This package contains the ext_sensors/rrd plugin used to read data \
using RRD, a tool that creates and manages a linear database for \
sampling and logging data."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-plugin-ext-sensors-rrd-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "a8a43be016de76081cf6660f85013b21d17f96f70062a47d1a0f4ed2017506bd45cbdc281449ae686f0fbf2e1bc3873d0025f940f47ac8c94004cf43214bcece"

RPROVIDES:${PN} += "slurm-plugin-ext-sensors-rrd \
slurm-plugin-ext-sensors-rrd(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.33)(64bit) \
librrd.so.8()(64bit) \
slurm-plugins"

inherit rpm
