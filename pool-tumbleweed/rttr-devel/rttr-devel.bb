SUMMARY = "Header files for the C++ Run Time Type Reflection library"
DESCRIPTION = "Run Time Type Reflection is the the ability of a computer program to \
introspect and modify objects at runtime. It is also the name of the \
library itself, which is written in C++."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "rttr-devel-0.9.6-4.17.aarch64.rpm"
RPM_HASH = "19abf70970e199826751dc28740d3874109a0b19387268d4be92ac88392e5a1c49e10802888307459207e737543a43961be49bce16ea113f20e7f25952c7573e"

RPROVIDES:${PN} += "cmake-rttr \
rttr-devel"

RDEPENDS:${PN} += "librttr-core0-9-6"

inherit rpm
