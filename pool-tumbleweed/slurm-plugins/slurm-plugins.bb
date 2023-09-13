SUMMARY = "SLURM plugins (loadable shared objects)"
DESCRIPTION = "This package contains the SLURM plugins (loadable shared objects)"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.4"

RPM_NAME = "slurm-plugins-23.02.4-2.1.aarch64.rpm"
RPM_HASH = "e9d3fda9b04e6fbc0ffde57ff790667dac8283c7a2b6762f28e969d622f2ab1f7414b09271d7e375222993061309fd4abe317a4477beca7f630235e173247c52"

RPROVIDES:${PN} += "config-slurm-plugins \
libslurm-pmi.so \
libslurmfull.so \
slurm-plugins"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1 \
libc.so.6 \
libcurl.so.4 \
libdbus-1.so.3 \
libhwloc.so.15 \
libibmad.so.5 \
libjson-c.so.5 \
liblua5.4.so.5 \
libm.so.6 \
libpmix2 \
libresolv.so.2 \
libyaml-0.so.2 \
pmix"

inherit rpm
