SUMMARY = "Collection of data files for use by lscsoft-glue"
DESCRIPTION = "Glue is a collection of utilities for running data analysis pipelines \
for online and offline analysis as well as accessing various grid \
utilities.  It also provides the infrastructure for the segment \
database. \
 \
This package provides a common set of data files for lscsoft-glue."
LICENSE = "GPL-2.0-only"

PV = "3.0.1"

RPM_NAME = "lscsoft-glue-data-3.0.1-1.7.aarch64.rpm"
RPM_HASH = "5c36bf17823800dc4e8c623c9097fd7ba3101cf8aae4cedf63c455264ce00bd129b3c1ce5504bba4cf9ea3437128f5f41713fd9ae0647b37f73688595b57559e"

RPROVIDES:${PN} += "lscsoft-glue-data"

RDEPENDS:${PN} += ""

inherit rpm
