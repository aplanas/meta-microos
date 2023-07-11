SUMMARY = "CMake documentation for offline reading - qhelp version"
DESCRIPTION = "CMake documentation for offline reading - qhelp version."
LICENSE = "BSD-3-Clause"

PV = "3.26.4"

RPM_NAME = "cmake-doc-qhelp-3.26.4-3.1.aarch64.rpm"
RPM_HASH = "a717bfe0b99eb2664f6eb8443310a2d971846b35c5f24379ac6e263013f28df0c16f1f28bb1000f9f6d064b6691b19d457d361ff7fe15907f4ad421f17b2a5c9"

RPROVIDES:${PN} += "cmake-doc-qhelp"

RDEPENDS:${PN} += ""

inherit rpm
