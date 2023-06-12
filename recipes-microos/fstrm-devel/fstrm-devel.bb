SUMMARY = "Development files for fstrm, a Frame Streams implementation in C"
DESCRIPTION = "This is fstrm, a C implementation of the Frame Streams data transport protocol. \
 \
This packages holds the development files."
LICENSE = "MIT"

PV = "0.6.1"

RPM_NAME = "fstrm-devel-0.6.1-1.5.aarch64.rpm"
RPM_HASH = "13557f72b85fcad9c15eae3df6e403fcd5864fa1f01fe00b38e4c62d107571000912646a98cd1486a1bfa12905ff157dae41e302c395a20401fb459f19c2c614"

RPROVIDES:${PN} += "fstrm-devel \
fstrm-devel(aarch-64) \
libfstrm-devel \
pkgconfig(libfstrm)"
RDEPENDS:${PN} += "/usr/bin/pkg-config \
libfstrm0"

inherit rpm
