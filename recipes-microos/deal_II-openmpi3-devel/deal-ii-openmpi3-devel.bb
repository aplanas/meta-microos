SUMMARY = "Development files for dealii-openmpi3"
DESCRIPTION = "The dealii-openmpi3-devel package contains libraries and header files for \
developing applications that use dealii-openmpi3."
LICENSE = "LGPL-2.1-or-later"

PV = "9.4.2"

RPM_NAME = "deal_II-openmpi3-devel-9.4.2-1.4.aarch64.rpm"
RPM_HASH = "9b4f4ca63063542f9ba3ac9b5cbcd4ecca76c95d956b9e9df769c673c91b2a993c5208112f361e5945fb274a0651a00b0e5800b6abb0be5c1d1baed45717bf06"

RPROVIDES:${PN} += "deal_II-openmpi3-devel deal_II-openmpi3-devel(aarch-64) dealii-openmpi3-openmpi3-devel"
RDEPENDS:${PN} += "libdeal_II9_4_2-openmpi3"

inherit rpm
