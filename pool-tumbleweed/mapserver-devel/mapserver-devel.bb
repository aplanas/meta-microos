SUMMARY = "Mapserver development files"
DESCRIPTION = "The Mapserver development package provides necessary files to build \
against the C Mapserver library."
LICENSE = "MIT"

PV = "8.0.0"

RPM_NAME = "mapserver-devel-8.0.0-2.7.aarch64.rpm"
RPM_HASH = "fdbcf6efef3b70d5fdf304b9a2f85fcfe12249b3ddbe81f00b7be4c7949fcbf8df9231833be1d17af89ae7e00655ccdec0e9f7aa6f39140d6e681b73db94179c"

RPROVIDES:${PN} += "mapserver-devel"

RDEPENDS:${PN} += "libmapserver2"

inherit rpm
