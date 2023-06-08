SUMMARY = "CMake documentation for offline reading - qhelp version"
DESCRIPTION = "CMake documentation for offline reading - qhelp version."
LICENSE = "BSD-3-Clause"

PV = "3.26.3"

RPM_NAME = "cmake-doc-qhelp-3.26.3-3.1.aarch64.rpm"
RPM_HASH = "9e64936f15c7fe046c464cc9f6adfd701abf4650c14455606d0ecee33a934f1252a781388139bbcb529e45ad9873f9c66f3f0c9bd645c2b377c1f7af4d5400ce"

RPROVIDES:${PN} += "cmake-doc-qhelp cmake-doc-qhelp(aarch-64)"
RDEPENDS:${PN} += ""

inherit rpm
