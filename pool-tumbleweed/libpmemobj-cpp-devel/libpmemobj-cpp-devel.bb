SUMMARY = "C++ bindings for libpmemobj"
DESCRIPTION = "This package contains the header files for pmemobj's C++ interface."
LICENSE = "BSD-3-Clause"

PV = "1.13.0"

RPM_NAME = "libpmemobj-cpp-devel-1.13.0-1.5.aarch64.rpm"
RPM_HASH = "224163d4e01f606fa08afbadc0662f71412accd3aa3ef00f717aa187504d80b0278dc1f0001f9283c00e342715fb3e9750d8ca867ef799de76811052b16e21e2"

RPROVIDES:${PN} += "libpmemobj++-devel \
libpmemobj-cpp-devel \
libpmemobj-cpp-devel(aarch-64) \
pkgconfig(libpmemobj++)"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
pkgconfig(libpmemobj)"

inherit rpm
