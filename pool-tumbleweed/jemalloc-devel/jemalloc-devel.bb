SUMMARY = "Development files for jemalloc"
DESCRIPTION = "Headers for jemalloc, general-purpose scalable concurrent malloc(3) \
implementation."
LICENSE = "BSD-2-Clause"

PV = "5.3.0"

RPM_NAME = "jemalloc-devel-5.3.0-1.6.aarch64.rpm"
RPM_HASH = "9e41952fc37da89ace5cb74765f2acd26aedd19af4707df530511a5183ab16e1caeef3ffe585f17f0009ad8ef0fa2a29ed4d9e0fd583d1f0e809bf10325036a5"

RPROVIDES:${PN} += "jemalloc-devel \
pkgconfig-jemalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjemalloc2"

inherit rpm
