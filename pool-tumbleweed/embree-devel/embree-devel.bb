SUMMARY = "Development files for embree"
DESCRIPTION = "This package contains the C++ header and CMake config files."
LICENSE = "Apache-2.0"

PV = "3.13.5"

RPM_NAME = "embree-devel-3.13.5-2.4.aarch64.rpm"
RPM_HASH = "ed6efd84bed40dfdac02db2088194604d5f0fb765c0b567a99e166c39b67df0d0d20d9a90d2517ca7d8a4441b3f1693979e75cd6f477b329f83d7587727e3545"

RPROVIDES:${PN} += "cmake-embree \
embree-devel"

RDEPENDS:${PN} += "libembree3"

inherit rpm
