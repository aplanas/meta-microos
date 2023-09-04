SUMMARY = "SLURM plugins (loadable shared objects)"
DESCRIPTION = "This package contains the SLURM plugins (loadable shared objects)"
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-plugins-23.02.2-1.4.aarch64.rpm"
RPM_HASH = "57d212de01dfa928622288d145d99fa22b3a9e279555b684a21286443755becc35121001a132e4fb00b14eafda84688f8456f08bc9b8200e0a3417318350dc5e"

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
