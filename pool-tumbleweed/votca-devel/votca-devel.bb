SUMMARY = "Development headers and libraries for votca"
DESCRIPTION = " \
VOTCA is a software package which focuses on the analysis of molecular \
dynamics data, the development of systematic coarse-graining techniques as \
well as methods used for simulating microscopic charge (and exciton) transport \
in disordered semiconductors. \
 \
This package contains development headers and libraries for votca."
LICENSE = "Apache-2.0"

PV = "2022.1"

RPM_NAME = "votca-devel-2022.1-3.7.aarch64.rpm"
RPM_HASH = "70538ac1c7bc7298ae586e4eef47cc8ababc494fa9271a50f554bd4f6bb0cd4669241a331a043e5a68093ec2737699ffa8b041d80e9fa8ecf6d94aaeeb916451"

RPROVIDES:${PN} += "cmake-VOTCA-CSG \
cmake-VOTCA-TOOLS \
cmake-VOTCA-XTP \
votca-csg-devel \
votca-devel \
votca-tools-devel \
votca-xtp-devel"

RDEPENDS:${PN} += "eigen3-devel \
fftw3-devel \
libexpat-devel \
libvotca2022 \
votca"

inherit rpm
