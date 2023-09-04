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

PV = "2021.10.0"

RPM_NAME = "tbb-devel-2021.10.0-1.1.aarch64.rpm"
RPM_HASH = "b016d977c4252a4a263c81afbab3d04dc523a6c6e75c1a240115f5b32989cf14e368dc8bb223db972c1085be9865c164c300c28e65fa339d1624e27661a64024"

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
