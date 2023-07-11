SUMMARY = "Development Files for Threading Building Blocks (TBB)"
DESCRIPTION = "Threading Building Blocks (TBB) offers a rich and complete approach to \
expressing parallelism in a C++ program. It is a library that helps you take \
advantage of multi-core processor performance without having to be a threading \
expert. Threading Building Blocks is not just a threads-replacement library. It \
represents a higher-level, task-based parallelism that abstracts platform \
details and threading mechanism for performance and scalability. \
 \
This package contains the header files needed for development with tbb."
LICENSE = "Apache-2.0"

PV = "2021.9.0"

RPM_NAME = "tbb-devel-2021.9.0-1.1.aarch64.rpm"
RPM_HASH = "993622ed70e989f88b59abb666bedefc7e2eec9f668026a0dc9ea3510d89a641bfd902f018f0f6511b0198ce84d06ee4f06b465c5ae901ecfaf8618b8280290b"

RPROVIDES:${PN} += "cmake-TBB \
pkgconfig-tbb \
tbb-devel"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
c++-compiler \
libirml1 \
libtbb12 \
libtbbbind-2-5-3 \
libtbbmalloc2"

inherit rpm
