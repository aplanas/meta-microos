SUMMARY = "Threading Building Blocks (TBB)"
DESCRIPTION = "Threading Building Blocks (TBB) offers a rich and complete approach to \
expressing parallelism in a C++ program. It is a library that helps you take \
advantage of multi-core processor performance without having to be a threading \
expert. Threading Building Blocks is not just a threads-replacement library. It \
represents a higher-level, task-based parallelism that abstracts platform \
details and threading mechanism for performance and scalability."
LICENSE = "Apache-2.0"

PV = "2021.9.0"

RPM_NAME = "libtbb12-2021.9.0-1.1.aarch64.rpm"
RPM_HASH = "5ef714cf89c3e3566f6eee3a6db84a79c2b12e55273cb882bbd6d88b94cd4b56cbb2e6abdfda22088ea258339f598250c88f7538f579a1ff35a5de56bb7f4d0a"

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
