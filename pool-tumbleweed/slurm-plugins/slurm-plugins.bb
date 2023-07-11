SUMMARY = "SLURM plugins (loadable shared objects)"
DESCRIPTION = "This package contains the SLURM plugins (loadable shared objects)"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-plugins-23.02.2-1.3.aarch64.rpm"
RPM_HASH = "721283036f0333756e241dd6382fdd092d2a790c88d527e1252aa3c3a1e494b10e3666c9b9971131ef7c482aa76417cbb6a464dac2ccb643e704449c5af28e3e"

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
