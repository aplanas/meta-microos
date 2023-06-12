SUMMARY = "CMake documentation for offline reading - qhelp version"
DESCRIPTION = "CMake documentation for offline reading - qhelp version."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-doc-qhelp-3.26.4-1.1.aarch64.rpm"
RPM_HASH = "6537bf49aca9c45842ff3d04bea7cf97ad61f1e84316dcfaff1fe8cd2fd63f7cd688bede7dc6692a0b96e4c51a12e8be837d810d8c21abdd50486693410a2b00"

RPROVIDES:${PN} += "cmake-doc-qhelp cmake-doc-qhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
