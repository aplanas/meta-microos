SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.27.1"

RPM_NAME = "cmake-3.27.1-1.1.aarch64.rpm"
RPM_HASH = "6506d665654b91cfe457a881853f6d4e1c79151df3de53695b8ca62d92c13aa681a2cc068997dd389b72dce021a5c3bcfb7547c6f725e670a75a5d6bf4e36fd7"

RPROVIDES:${PN} += "cmake"

RDEPENDS:${PN} += "cmake-implementation"

inherit rpm
