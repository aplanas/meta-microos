SUMMARY = "Store accounting data in hdf5"
DESCRIPTION = "Plugin to store accounting in the hdf5 file format. This plugin has to be \
activated in the slurm configuration. Includes also utility the program \
sh5utils to merge this hdf5 files or extract data from them."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-hdf5-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "e873db420d7930df54e964a70e5038a14feb8d5cf62759b9e6173caffa4dcc89fcd61a4e2ec266a7551881a23104778fa223823d358a914a8f79590caa4ecfbf"

RPROVIDES:${PN} += "slurm-hdf5"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libhdf5-hl.so.200 \
libhdf5.so.200 \
libslurmfull.so \
slurm-plugins"

inherit rpm
