SUMMARY = "soutzoe input schema for rime"
DESCRIPTION = "soutzoe input schema for rime."
LICENSE = "GPL-3.0-or-later"

PV = "20230603+git.5fdd2d6"

RPM_NAME = "rime-schema-soutzoe-20230603+git.5fdd2d6-1.1.noarch.rpm"
RPM_HASH = "cd22699f6bc9f570ae8b633f5b86455f6d3eb9160087247a63d9a8f96d59bc65cd6ad7d620df9d986cfb9a6c82cc405e8406bc5896b68e3e16d12d245a2de168"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "rime-schema-soutzoe"

RDEPENDS:${PN} += ""

inherit rpm
