SUMMARY = "Store accounting data in hdf5"
DESCRIPTION = "Plugin to store accounting in the hdf5 file format. This plugin has to be \
activated in the slurm configuration. Includes also utility the program \
sh5utils to merge this hdf5 files or extract data from them."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-hdf5-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "55eeeb38406fab065289de8180b33139f479e4a3df563d2d464bf4e0574bda2ad13dd454578303d1d963018f1bd40cbceefd63eb688115f17f7927439805adaa"

RPROVIDES:${PN} += "slurm-hdf5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libslurmfull.so \
slurm-plugins"

inherit rpm
