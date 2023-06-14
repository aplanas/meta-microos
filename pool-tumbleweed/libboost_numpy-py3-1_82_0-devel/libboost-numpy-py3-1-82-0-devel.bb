SUMMARY = "Development headers for Boost.Python.NumPy library"
DESCRIPTION = "Development headers for Boost.Python.NumPy library. This package contains \
library for python3 development for boost."
LICENSE = "BSL-1.0"

PV = "1.82.0"

RPM_NAME = "libboost_numpy-py3-1_82_0-devel-1.82.0-1.1.aarch64.rpm"
RPM_HASH = "0fa92a9c52da8e1ad6b5c97695ba5c30d96dba05996c6a3120fd2b104124ac5dc68d54964b8c7648c881d4d84bf69013926302bd8731507ded6bf2efc499ce6e"

RPROVIDES:${PN} += "libboost-numpy-py3-1-82-0-devel \
libboost-numpy3-devel-impl"

RDEPENDS:${PN} += "libboost-headers1-82-0-devel \
libboost-numpy-py3-1-82-0"

inherit rpm
