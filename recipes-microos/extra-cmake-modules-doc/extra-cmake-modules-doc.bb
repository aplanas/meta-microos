SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake. \
 \
 \
This package provides documentation for extra-cmake-modules"
LICENSE = "BSD-3-Clause"

PV = "5.105.0"

RPM_NAME = "extra-cmake-modules-doc-5.105.0-1.1.noarch.rpm"
RPM_HASH = "c0ebecb1fb897af315ddb5a571ade92d0d9832c300214c372a1e90a35dfbb1bcbf9c694e1b39d1a72e4bf669d0261e8cec4f4964c7cbe1a12c0ff3c29276833d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules-doc"
RDEPENDS:${PN} += ""

inherit rpm
