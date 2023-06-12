SUMMARY = "Cross build support for CMake"
DESCRIPTION = "This package provides the required support files and macros \
to create binary package for Windows with the CMake build system"
LICENSE = "BSD-3-Clause"

PV = "1.0.0"

RPM_NAME = "mingw64-cross-cmake-1.0.0-1.1.noarch.rpm"
RPM_HASH = "5bc14dd716fc56680a43e2ab8aa23c27052b6c5193d74717663df500a22315359f36d59e58f70f21b4ac1eba90790b48ff53780a01b7565da3937ba894cf8e91"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "mingw64-cross-cmake \
rpm_macro(_mingw64_cmake) \
rpm_macro(_mingw64_cmake_build) \
rpm_macro(_mingw64_cmake_install) \
rpm_macro(_mingw64_ctest)"
RDEPENDS:${PN} += "/usr/bin/python3 \
cmake \
mingw64-filesystem"

inherit rpm
