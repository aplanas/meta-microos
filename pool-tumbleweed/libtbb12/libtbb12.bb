SUMMARY = "Threading Building Blocks (TBB)"
DESCRIPTION = "Threading Building Blocks (TBB) offers a rich and complete approach to \
expressing parallelism in a C++ program. It is a library that helps you take \
advantage of multi-core processor performance without having to be a threading \
expert. Threading Building Blocks is not just a threads-replacement library. It \
represents a higher-level, task-based parallelism that abstracts platform \
details and threading mechanism for performance and scalability."
LICENSE = "Apache-2.0"

PV = "2021.10.0"

RPM_NAME = "libtbb12-2021.10.0-1.1.aarch64.rpm"
RPM_HASH = "b7de53864c41549b87004bdba8c07a39eb4ce39513e3e558850ab91a01daf6f7a6f70d58db34a2a3ce221c0800f83435fad9aff270669d6bee3186f860b0ec48"

RPROVIDES:${PN} += "libtbb.so.12 \
libtbb12 \
tbb"

RDEPENDS:${PN} += "/sbin/ldconfig \
ld-linux-aarch64.so.1 \
libc.so.6 \
libgcc-s.so.1 \
libm.so.6 \
libstdc++.so.6"

inherit rpm
