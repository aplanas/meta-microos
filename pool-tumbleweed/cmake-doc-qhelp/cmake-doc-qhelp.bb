SUMMARY = "CMake documentation for offline reading - qhelp version"
DESCRIPTION = "CMake documentation for offline reading - qhelp version."
LICENSE = "BSD-3-Clause"

PV = "3.27.1"

RPM_NAME = "cmake-doc-qhelp-3.27.1-1.2.aarch64.rpm"
RPM_HASH = "fa8cb1d8efa258932590bc3535d7557ee85176ad9451b98fdfa29f457559c5adc47b3ad7a5a1df91ef7f9fcf673b6b95eaa7e4dd64f0bdd0b0ce1cd5dde4b02e"

RPROVIDES:${PN} += "cmake-doc-qhelp"

RDEPENDS:${PN} += ""

inherit rpm
