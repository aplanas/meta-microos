SUMMARY = "Data and icon set for gcr"
DESCRIPTION = "This package provides the GSettings schemas and a collection of icons \
needed by libgcr."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-data-3.41.0-3.4.aarch64.rpm"
RPM_HASH = "1d397dc222e7f7130acc8e6afc9e4b3b33d76d42b1f439d3f4c4b7f01e7f492d91990b0494c7884405697f1982c667a5fc52c6e5a1e7bf8d93951b27560342d6"

RPROVIDES:${PN} += "gcr-data \
gcr3-data"

RDEPENDS:${PN} += ""

inherit rpm
