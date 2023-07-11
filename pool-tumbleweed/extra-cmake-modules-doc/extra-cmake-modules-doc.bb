SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake. \
 \
 \
This package provides documentation for extra-cmake-modules"
LICENSE = "BSD-3-Clause"

PV = "5.107.0"

RPM_NAME = "extra-cmake-modules-doc-5.107.0-1.1.noarch.rpm"
RPM_HASH = "f98e23501e502f4e82466935a8dc0be93ba0457869748641a5406fa6e5ba407c066f88560a6daeb51a30a96b268456b70a1a408375dd1e8651751e852e92d037"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules-doc"

RDEPENDS:${PN} += ""

inherit rpm
