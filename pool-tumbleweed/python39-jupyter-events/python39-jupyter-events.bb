SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python39-jupyter-events-0.7.0-1.1.noarch.rpm"
RPM_HASH = "c9d5c250f5fbbecc59a19fb8fd09e73f9253f819c62452189a9608271e5370d0da3d1508807ffb878cd49407d7b8b0a675a9479064f877522fc01c2328556732"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-jupyter-events \
python39-jupyter-events \
python3dist-jupyter-events"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-PyYAML \
python39-jsonschema-format-nongpl \
python39-python-json-logger \
python39-referencing \
python39-rfc3339-validator \
python39-rfc3986-validator \
python39-traitlets"

inherit rpm
