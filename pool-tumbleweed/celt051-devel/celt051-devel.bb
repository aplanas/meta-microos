SUMMARY = "Development files for celt051"
DESCRIPTION = "CELT is a very low delay audio codec designed for high-quality communications. \
Its potential uses include video-conferencing and network music performance. \
 \
This package contains development files for celt051."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.3"

RPM_NAME = "celt051-devel-0.5.1.3-10.30.aarch64.rpm"
RPM_HASH = "55fe0f14b450baee15d400d9816b84b1c86ea934c3358fca03ca51e164f22c18736151bf1787d07e109bc29df83a42203c3f151f43a908a08d728903f2ae9fb0"

RPROVIDES:${PN} += "celt051-devel \
pkgconfig-celt051"

RDEPENDS:${PN} += "/usr/bin/pkg-config \
libcelt051-0"

inherit rpm
