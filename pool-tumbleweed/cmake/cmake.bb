SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.27.2"

RPM_NAME = "cmake-3.27.2-1.1.aarch64.rpm"
RPM_HASH = "a45937f10334dabaed07c5920dba76904b067b91cb59b107e3cb24b78d5f65e9c0938b5b320c8767d6998a29e9bd1e048d904253f24a509f515a35c7b40e620d"

RPROVIDES:${PN} += "cmake"

RDEPENDS:${PN} += "cmake-implementation"

inherit rpm
