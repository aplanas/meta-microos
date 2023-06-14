SUMMARY = "Handlebarsjs templating for Python 3 and 2"
DESCRIPTION = "Pybars3 provides a template system for Python which is compatible with \
Handlebars.js.  It is a fork of the pybars project that adds Python 3 \
compatibility and numerous features from Handlebars.js 2.0."
LICENSE = "LGPL-3.0-only"

PV = "0.9.7"

RPM_NAME = "python39-pybars3-0.9.7-1.18.noarch.rpm"
RPM_HASH = "bbe7b1b7c3e2d8989b5159b0e813c345326ba3c3e19dd5b5b257ae91421b4d3ceb99e46d74d8f39eadb0c765446a16e41f55e9c4b0dd847442a64e6b9bd1fbd8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybars3 \
python39-pybars3 \
python3dist-pybars3"

RDEPENDS:${PN} += "python-abi \
python39-PyMeta3"

inherit rpm
