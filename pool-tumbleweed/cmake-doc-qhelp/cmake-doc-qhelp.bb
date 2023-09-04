SUMMARY = "CMake documentation for offline reading - qhelp version"
DESCRIPTION = "CMake documentation for offline reading - qhelp version."
LICENSE = "BSD-3-Clause"

PV = "3.27.2"

RPM_NAME = "cmake-doc-qhelp-3.27.2-1.1.aarch64.rpm"
RPM_HASH = "4a6a7cb6dec94b7a2e03af2664f79f155063319b0ec8683125df8436586bbdcf8ff825ea8a53aa0167dfdae8edcd728e99e515a18055a120e244d0b80b2b8fd9"

RPROVIDES:${PN} += "cmake-doc-qhelp"

RDEPENDS:${PN} += ""

inherit rpm
