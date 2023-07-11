SUMMARY = "Development files for jemalloc"
DESCRIPTION = "Headers for jemalloc, general-purpose scalable concurrent malloc(3) \
implementation."
LICENSE = "BSD-2-Clause"

PV = "5.3.0"

RPM_NAME = "jemalloc-devel-5.3.0-1.7.aarch64.rpm"
RPM_HASH = "384ff35705523a132201f303e053c64d9be3d72e3b2e6fdb39e2751e1f964d2c3ef847bd006ad556c9ec3bd6bfd11a014405a94f0120e92ca98b9c277677f3bd"

RPROVIDES:${PN} += "jemalloc-devel \
pkgconfig-jemalloc"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libjemalloc2"

inherit rpm
