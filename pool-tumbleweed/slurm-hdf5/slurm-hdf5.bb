SUMMARY = "Store accounting data in hdf5"
DESCRIPTION = "Plugin to store accounting in the hdf5 file format. This plugin has to be \
activated in the slurm configuration. Includes also utility the program \
sh5utils to merge this hdf5 files or extract data from them."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-hdf5-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "f64108d628344dbef9a0f0679e352a9e34a0f2a30e56cb0d97c57f654df05d6ceb95a18925c3c055bf5f1cd45500b89f0585db2d0ff5cef3195158a2540cb4f3"

RPROVIDES:${PN} += "slurm-hdf5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libslurmfull.so \
slurm-plugins"

inherit rpm
