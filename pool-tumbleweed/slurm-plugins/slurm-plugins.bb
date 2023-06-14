SUMMARY = "SLURM plugins (loadable shared objects)"
DESCRIPTION = "This package contains the SLURM plugins (loadable shared objects)"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-plugins-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "11bd78f9f15c6f316c98e8e00384347434a02013f7fdc613e8af78a5ab5f33c095f5b63397d594b72d06733e40baad14eb16dba9b992ab1c5efb9fd2831d54e6"

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
