SUMMARY = "Dependency package for libpetsc_3_18_5-gnu-openmpi1-hpc"
DESCRIPTION = "petsc: Portable Extensible Toolkit for Scientific Computation \
The package libpetsc-gnu-openmpi1-hpc provides the dependency to get binary package libpetsc_3_18_5-gnu-openmpi1-hpc. \
When this package gets updated it installs the latest version of petsc_3_18_5-gnu-openmpi1-hpc."
LICENSE = "BSD-2-Clause"

PV = "3.18.5"

RPM_NAME = "libpetsc-gnu-openmpi1-hpc-3.18.5-1.2.aarch64.rpm"
RPM_HASH = "34bd2778219b63d3078fd950acee753a346acdbfd172c7fcc42b7ea729d33268a026e1b2caaa67e506d36d41658537f48f9e03a25559305d6b53999a003c1f5b"

RPROVIDES:${PN} += "libpetsc-gnu-openmpi1-hpc"

RDEPENDS:${PN} += "/usr/bin/sh \
libpetsc-3-18-5-gnu-openmpi1-hpc"

inherit rpm
