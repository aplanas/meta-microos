SUMMARY = "Collection of data files for use by lscsoft-glue"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database. \
 \
This package provides a common set of data files for lscsoft-glue."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "lscsoft-glue-data-3.0.1-1.6.aarch64.rpm"
RPM_HASH = "cc331bdba6e499b7f16c9fc5fca73be85916d6b16c7ca3ed7cfb1ceeb12186d5e5b4bc445304c657ee403ef0ec25cadbe690c6e3cfb03aed2d8b9c0b814823cc"

RPROVIDES:${PN} += "lscsoft-glue-data"

RDEPENDS:${PN} += ""

inherit rpm
