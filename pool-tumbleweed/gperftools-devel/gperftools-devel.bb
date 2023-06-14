SUMMARY = "Performance tools for C++"
DESCRIPTION = "The gperftools-devel package contains static and debug libraries and header \
files for developing applications that use the gperftools package."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "gperftools-devel-2.10-1.5.aarch64.rpm"
RPM_HASH = "7363387b24e159863ef74a3b335c8d8de00ead7eb774e82d5f0a2ae7c72247f65b1633d20df5114a436e84008500bd74f33387dd9e2c07b663edf296d887b54a"

RPROVIDES:${PN} += "google-perftools-devel \
gperftools-devel \
pkgconfig-libprofiler \
pkgconfig-libtcmalloc \
pkgconfig-libtcmalloc-debug \
pkgconfig-libtcmalloc-minimal \
pkgconfig-libtcmalloc-minimal-debug"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
gperftools \
libprofiler0 \
libstdc++-devel \
libtcmalloc-and-profiler4 \
libtcmalloc-debug4 \
libtcmalloc-minimal-debug4 \
libtcmalloc-minimal4 \
libtcmalloc4"

inherit rpm
