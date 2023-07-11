SUMMARY = "Handlebarsjs templating for Python 3 and 2"
DESCRIPTION = "Pybars3 provides a template system for Python which is compatible with \
Handlebars.js.  It is a fork of the pybars project that adds Python 3 \
compatibility and numerous features from Handlebars.js 2.0."
LICENSE = "LGPL-3.0-only"

PV = "0.9.7"

RPM_NAME = "python39-pybars3-0.9.7-1.20.noarch.rpm"
RPM_HASH = "8cd75639c51d13137cc0308db06ef5820104ba63344da4b1cb21bbf4c82d7bd6fe9a61f7b99be19236d5e17153bd7555632747800a9597515225b7f92dd9581d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pybars3 \
python39-pybars3 \
python3dist-pybars3"

RDEPENDS:${PN} += "python-abi \
python39-PyMeta3"

inherit rpm
