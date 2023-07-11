SUMMARY = "Dependency package for libscalapack2_2_1_0-gnu-openmpi1-hpc"
DESCRIPTION = "scalapack: A subset of LAPACK routines redesigned for heterogenous computing \
The package libscalapack2-gnu-openmpi1-hpc provides the dependency to get binary package libscalapack2_2_1_0-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of scalapack_2_1_0-gnu-openmpi1-hpc."
LICENSE = "SUSE-Public-Domain"

PV = "2.1.0"

RPM_NAME = "libscalapack2-gnu-openmpi1-hpc-2.1.0-9.20.aarch64.rpm"
RPM_HASH = "d3eca9ecdf72a91102a7f9e6e63cbccde18b77644f4e580eb603aeed2a4cad2161542a2e6058a347e3648107a326c11b2e07dc06d09255a30d7dd297c5c98790"

RPROVIDES:${PN} += "libscalapack2-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libscalapack2-2-1-0-gnu-openmpi1-hpc"

inherit rpm
