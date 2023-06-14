SUMMARY = "Cross-platform make system"
DESCRIPTION = "CMake is a cross-platform build system."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-3.26.4-1.1.aarch64.rpm"
RPM_HASH = "a7cb93c9aa26903a8d1c51df57615267470ec6962878343f176be056d0b5f72d47d53b1e382b38bec4109463ea46cc945bfe5058ffd983a7ba9da93ded036ea6"

RPROVIDES:${PN} += "cmake"

RDEPENDS:${PN} += "cmake-implementation"

inherit rpm
