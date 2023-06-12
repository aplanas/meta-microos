SUMMARY = "OpenCL C++ headers"
DESCRIPTION = "OpenCL is a royalty-free standard for cross-platform, parallel programming \
of modern processors found in personal computers, servers and \
handheld/embedded devices. \
 \
This package provides the official C++ headers for OpenCL, which are wrappers \
around the C headers."
LICENSE = "Apache-2.0"

PV = "2023.04.17"

RPM_NAME = "opencl-cpp-headers-2023.04.17-1.1.noarch.rpm"
RPM_HASH = "bcaf224da05d1bea60f04022f87b88c6d3c3f5bc7c41724062a848796dbc6c0a320bedbdb4797e3965cbb2652c37254b5238c01ef069c02d10cbfe772d324031"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "opencl-cpp-headers"
RDEPENDS:${PN} += "opencl-headers"

inherit rpm
