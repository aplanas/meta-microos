SUMMARY = "Development files for the Tachyon Ray Tracing System"
DESCRIPTION = "A parallel ray tracing system supporting MPI and multithreaded \
implementations. \
 \
This package contains the headers for the Tachyon library."
LICENSE = "BSD-3-Clause"

PV = "0.99.5"

RPM_NAME = "tachyon-devel-0.99.5-1.4.aarch64.rpm"
RPM_HASH = "38d7f7180342b03b3d62a87e72e8d5f594efed54e003e26718c48dcd9a007aac0aa453440c2e7e2a8bbb9b192412c5a567e4f62e10045001e71c92f82c1708f0"

RPROVIDES:${PN} += "libtachyon-devel \
tachyon-devel"

RDEPENDS:${PN} += "libtachyon-0-99-5"

inherit rpm
