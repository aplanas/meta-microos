SUMMARY = "Handlebarsjs templating for Python 3 and 2"
DESCRIPTION = "Pybars3 provides a template system for Python which is compatible with \
Handlebars.js.  It is a fork of the pybars project that adds Python 3 \
compatibility and numerous features from Handlebars.js 2.0."
LICENSE = "LGPL-3.0-only"

PV = "0.9.7"

RPM_NAME = "python311-pybars3-0.9.7-1.20.noarch.rpm"
RPM_HASH = "4466176621b808293391bb950cd43111c49d3efc8387f16f2a6bd94a3d408529060bea1c1acabe508f77d9784867e98e652796dcbb0edd7162ee0115230809cb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pybars3 \
python3.11dist-pybars3 \
python311-pybars3 \
python3dist-pybars3"

RDEPENDS:${PN} += "python-abi \
python311-PyMeta3"

inherit rpm
