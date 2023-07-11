SUMMARY = "Performance tools for C++"
DESCRIPTION = "The gperftools-devel package contains static and debug libraries and header \
files for developing applications that use the gperftools package."
LICENSE = "BSD-3-Clause"

PV = "2.10"

RPM_NAME = "gperftools-devel-2.10-1.6.aarch64.rpm"
RPM_HASH = "294e2f109ee7ff7ac4dffffa2be7cbad080874c27dbc098414ae1534643819bf6ab900e7093fba4663942d6588fc79597e7ee25fe602fb452c552a0cf91808f3"

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
