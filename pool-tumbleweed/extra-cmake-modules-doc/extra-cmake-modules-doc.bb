SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake. \
 \
 \
This package provides documentation for extra-cmake-modules"
LICENSE = "BSD-3-Clause"

PV = "5.109.0"

RPM_NAME = "extra-cmake-modules-doc-5.109.0-1.1.noarch.rpm"
RPM_HASH = "75107b5a5a32ab117f41d80938299daccfdd01f890fdab80fbef0f03b2ebfcd3d3fb57f35abd5472478940d777ecd2d2a560d7ed025b40a64f9184514ef82ec6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules-doc"

RDEPENDS:${PN} += ""

inherit rpm
