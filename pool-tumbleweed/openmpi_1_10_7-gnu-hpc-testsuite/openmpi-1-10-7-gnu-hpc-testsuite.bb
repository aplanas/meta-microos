SUMMARY = "A powerful implementation of MPI"
DESCRIPTION = " \
This package is just needed to run the testsuite and does not contain \
anything interesting."
LICENSE = "BSD-3-Clause"

PV = "1.10.7"

RPM_NAME = "openmpi_1_10_7-gnu-hpc-testsuite-1.10.7-8.1.noarch.rpm"
RPM_HASH = "5728db8458a88c079305d6a4aad2e7122c15ce48b7a05fc967675f089ccc130f5ed465e5cf271dbf22816cf1c8f034371ad0cbc574133154f27c5d512d21b0fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "openmpi-1-10-7-gnu-hpc-testsuite"

RDEPENDS:${PN} += "gnu-compilers-hpc \
lua-lmod \
openmpi-runtime-config"

inherit rpm
