SUMMARY = "Development files for celt051"
DESCRIPTION = "CELT is a very low delay audio codec designed for high-quality communications. \
Its potential uses include video-conferencing and network music performance. \
 \
This package contains development files for celt051."
LICENSE = "BSD-3-Clause"

PV = "0.5.1.3"

RPM_NAME = "celt051-devel-0.5.1.3-10.29.aarch64.rpm"
RPM_HASH = "13baa37ba7c742d1904f265ed3d9980760f74ada862134f09f9401c033dcd2a8e2672e27a16b595707c6cd538b720c2200f2f64921b646a1fe3a9d96839db275"

RPROVIDES:${PN} += "celt051-devel celt051-devel(aarch-64) pkgconfig(celt051)"
RDEPENDS:${PN} += "/usr/bin/pkg-config libcelt051-0"

inherit rpm
