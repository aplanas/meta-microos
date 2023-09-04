SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python311-jupyter-events-0.7.0-1.1.noarch.rpm"
RPM_HASH = "c1dcc60ee845b9485b5e98a2d04278742891ee41b0970246cdb05dcf9cbc9a7d603e6e35fa40f5d0333b1b87d9bf26a2d394a9a62033778a6054ed8845d5c8b5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-events \
python3.11dist-jupyter-events \
python311-jupyter-events \
python3dist-jupyter-events"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-PyYAML \
python311-jsonschema-format-nongpl \
python311-python-json-logger \
python311-referencing \
python311-rfc3339-validator \
python311-rfc3986-validator \
python311-traitlets"

inherit rpm
