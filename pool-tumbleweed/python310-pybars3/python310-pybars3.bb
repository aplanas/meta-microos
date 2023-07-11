SUMMARY = "Handlebarsjs templating for Python 3 and 2"
DESCRIPTION = "Pybars3 provides a template system for Python which is compatible with \
Handlebars.js.  It is a fork of the pybars project that adds Python 3 \
compatibility and numerous features from Handlebars.js 2.0."
LICENSE = "LGPL-3.0-only"

PV = "0.9.7"

RPM_NAME = "python310-pybars3-0.9.7-1.20.noarch.rpm"
RPM_HASH = "f209e7a7c852eabbe7153fe59e02f6964f7f66bb20794ac572d45f32fb207952d873e502b1f5471af7e97e39136d49b5bc4de3b20fa3c13ebff4f312157d3384"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pybars3 \
python310-pybars3 \
python3dist-pybars3"

RDEPENDS:${PN} += "python-abi \
python310-PyMeta3"

inherit rpm
