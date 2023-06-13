SUMMARY = "Documentation files for drc"
DESCRIPTION = "This package contains documentation for drc and Octave scripts to generate \
comparison graphs."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.3"

RPM_NAME = "drc-doc-3.2.3-1.14.aarch64.rpm"
RPM_HASH = "8468c6c05eea37ba510d7db7e26d3219edb55a15f36fe24af0c675542c7ea8b55585a62ee1a0c36b24a36934843aa802980230b5a1218700a2864fc16a6726d6"

RPROVIDES:${PN} += "drc-doc \
drc-doc(aarch-64)"

RDEPENDS:${PN} += ""

inherit rpm
