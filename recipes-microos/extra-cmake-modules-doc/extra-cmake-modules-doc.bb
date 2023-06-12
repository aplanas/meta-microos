SUMMARY = "CMake modules"
DESCRIPTION = "Extra modules and scripts for CMake. \
 \
 \
This package provides documentation for extra-cmake-modules"
LICENSE = "BSD-3-Clause"

PV = "5.106.0"

RPM_NAME = "extra-cmake-modules-doc-5.106.0-1.1.noarch.rpm"
RPM_HASH = "243c28ee019747c11376bad68943dd6b466479237b3db4506f946a569ed5f300c00eb235efc399e7e1412ddb31b8e4beb6f5f45da7d1ea9beb88da0a81cba5df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "extra-cmake-modules-doc"
RDEPENDS:${PN} += ""

inherit rpm
