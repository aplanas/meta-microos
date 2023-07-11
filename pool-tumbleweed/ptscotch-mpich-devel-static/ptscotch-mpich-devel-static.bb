SUMMARY = "Development libraries for scotch"
DESCRIPTION = "This package contains libscotch static libraries."
LICENSE = "CECILL-C"

PV = "6.1.0"

RPM_NAME = "ptscotch-mpich-devel-static-6.1.0-2.10.aarch64.rpm"
RPM_HASH = "b046c390da11da37bee68d772962e59acdb0c166e0bdf31e6df0d50cece5e06edaa5fa38c38df4ea3327e4ea9e1e35bff4974575667050509e0ae364695532cc"

RPROVIDES:${PN} += "ptscotch-mpich-devel-static \
scotch-devel-static"

RDEPENDS:${PN} += "ptscotch-mpich-devel"

inherit rpm
