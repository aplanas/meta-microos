SUMMARY = "The system GNU C++ Compiler"
DESCRIPTION = "The system GNU C++ Compiler."
LICENSE = "GPL-3.0-or-later"

PV = "13"

RPM_NAME = "gcc-c++-13-1.3.aarch64.rpm"
RPM_HASH = "b668a03fa0d15ee2ea96c4b16627330d3d7ebe392b7a48d5ffbbac5d337c4637bf58a7c532c97ad7a5beaf7f2b6b76a5bf5610b159914e60a9dd3bbc2ea5607c"

RPROVIDES:${PN} += "c++_compiler \
gcc-c++ \
gcc-c++(aarch-64)"
RDEPENDS:${PN} += "gcc \
gcc13-c++"

inherit rpm
