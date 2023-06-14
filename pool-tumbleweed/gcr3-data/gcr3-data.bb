SUMMARY = "Data and icon set for gcr"
DESCRIPTION = "This package provides the GSettings schemas and a collection of icons \
needed by libgcr."
LICENSE = "LGPL-2.1-or-later"

PV = "3.41.0"

RPM_NAME = "gcr3-data-3.41.0-3.3.aarch64.rpm"
RPM_HASH = "0106d1a0f9277d6ab0d44991a1945e128d10e4a99d6b7e405b2e7205cbc89dfac19d75ea50505032955d7d3ac9d3a12ce617c1e447665728db7bd3c058345fa6"

RPROVIDES:${PN} += "gcr-data \
gcr3-data"

RDEPENDS:${PN} += ""

inherit rpm
