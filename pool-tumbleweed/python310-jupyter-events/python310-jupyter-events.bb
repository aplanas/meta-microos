SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python310-jupyter-events-0.6.3-2.4.noarch.rpm"
RPM_HASH = "641b3860f1b9769f6e3cbff1b6d2bcca00a6f5c15a275adef0d5c3d9bef2dcc679bcc1fa6a2c12c86dc25025e23494677a9dcc1d6dc5e3bbfa7569e7743526e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-events \
python310-jupyter-events \
python3dist-jupyter-events"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-PyYAML \
python310-jsonschema-format-nongpl \
python310-python-json-logger \
python310-rfc3339-validator \
python310-rfc3986-validator \
python310-traitlets"

inherit rpm
