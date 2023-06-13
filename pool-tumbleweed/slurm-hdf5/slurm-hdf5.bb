SUMMARY = "Store accounting data in hdf5"
DESCRIPTION = "Plugin to store accounting in the hdf5 file format. This plugin has to be \
activated in the slurm configuration. Includes also utility the program \
sh5utils to merge this hdf5 files or extract data from them."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-hdf5-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "267c4a314c435ee73389d12bca789dc42bff8095162b95971f3fc6ecccdab4b4165008b7cdcbc42934ecd1fc90c5a5da01d2d633848fba1dc222986801cdf1bf"

RPROVIDES:${PN} += "slurm-hdf5 \
slurm-hdf5(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
libc.so.6()(64bit) \
libhdf5.so.200()(64bit) \
libhdf5_hl.so.200()(64bit) \
libslurmfull.so()(64bit) \
slurm-plugins"

inherit rpm
