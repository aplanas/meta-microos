SUMMARY = "Slurm REST API Interface"
DESCRIPTION = "This package provides the interface to SLURM via REST API."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "23.02.2"

RPM_NAME = "slurm-rest-23.02.2-1.1.aarch64.rpm"
RPM_HASH = "96fec2eb488ec6f6472226c5d75af47baf7f0729bca39e8d893d6484afa25d3614937ced97edc4303de6d953ba0538d3cec3b656f40f3d7c9676c28bfc81b0d2"

RPROVIDES:${PN} += "slurm-rest \
slurm-rest(aarch-64)"

RDEPENDS:${PN} += "ld-linux-aarch64.so.1()(64bit) \
ld-linux-aarch64.so.1(GLIBC_2.17)(64bit) \
libc.so.6(GLIBC_2.34)(64bit) \
libhttp_parser.so.2.9()(64bit) \
libslurmfull.so()(64bit) \
slurm-config"

inherit rpm
