SUMMARY = "Header files for the C++ Run Time Type Reflection library"
DESCRIPTION = "Run Time Type Reflection is the the ability of a computer program to \
introspect and modify objects at runtime. It is also the name of the \
library itself, which is written in C++."
LICENSE = "MIT"

PV = "0.9.6"

RPM_NAME = "rttr-devel-0.9.6-4.16.aarch64.rpm"
RPM_HASH = "ce4a0a5802946055df50112f4d420fc4b89525100e0587fcc93c7920c77a2140a9d8156828f3f24d34e4231968dcce0007e87889e9d95eced9c0c7cd638dd7ec"

RPROVIDES:${PN} += "cmake(rttr) \
rttr-devel \
rttr-devel(aarch-64)"
RDEPENDS:${PN} += "librttr_core0_9_6"

inherit rpm
