SUMMARY = "Development files for c-ares"
DESCRIPTION = "c-ares is a C library that performs DNS requests and name resolves \
asynchronously. c-ares is a fork of the library named 'ares', written \
by Greg Hudson at MIT. \
 \
This package provides the development libraries and headers needed \
to build packages that depend on c-ares."
LICENSE = "MIT"

PV = "1.19.1"

RPM_NAME = "c-ares-devel-1.19.1-1.1.aarch64.rpm"
RPM_HASH = "b36eb6d7e7a79f2dfed0ac40e2505dedd5d7c55c9a06061e7219102891d945241482c6b16ca6d4eb7e7b2633f6ff8c9a7b310d03bb0f0c0e8984bf54cfe05da7"

RPROVIDES:${PN} += "c-ares-devel \
cmake-c-ares \
libcares-devel \
pkgconfig-libcares"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
glibc-devel \
libcares2"

inherit rpm
