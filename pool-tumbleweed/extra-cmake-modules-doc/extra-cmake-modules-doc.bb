SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake. \
 \
 \
This package provides documentation for extra-cmake-modules"
LICENSE = "BSD-3-Clause"

PV = "5.108.0"

RPM_NAME = "extra-cmake-modules-doc-5.108.0-1.1.noarch.rpm"
RPM_HASH = "620ee39be67673e26c9bb43ceaca241ade9a11993ae7925b26a678211929049ae3a5352e83b044c51993b36d1949f687f5f02adefb71b7b8b4a61ba8b50d5780"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules-doc"

RDEPENDS:${PN} += ""

inherit rpm
