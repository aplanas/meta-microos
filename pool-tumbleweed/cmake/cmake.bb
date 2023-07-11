SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "dd2711aa38afaa0e90cd9cec6e38229166302f9604cd8e0bfed9ca4a298e5cd03dd5acfe6962b80d9d832ca5b0ff6f9f02e7639042659da25250476c2b721e18"

RPROVIDES:${PN} += "cmake"

RDEPENDS:${PN} += "cmake-implementation"

inherit rpm
