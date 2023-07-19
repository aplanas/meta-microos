SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python39-jupyter-events-0.6.3-3.1.noarch.rpm"
RPM_HASH = "59ba31aea73e58ec8bbc5d189403b4d8be398be5ea35933f1200c2cb96ad1380229ac0c541c2344bf7980d884e5342b1cd14da58072ff9dd223885b256b9f436"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-events \
python39-jupyter-events \
python3dist-jupyter-events"

RDEPENDS:${PN} += "-python39-jsonschema-format-nongpl >= 3.2.0 with python39-jsonschema-format-nongpl < 4.18 \
/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-PyYAML \
python39-python-json-logger \
python39-rfc3339-validator \
python39-rfc3986-validator \
python39-traitlets"

inherit rpm
