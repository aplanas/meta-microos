SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python310-jupyter-events-0.6.3-4.1.noarch.rpm"
RPM_HASH = "cf7447f845f5610388c9d42bbe244e9cf238a7cf123b5e66ce0e45b75f05dce8d8971652a9c74c5fcb5c48f65484c08c09dd2a9e31b74c74c94bc8d29170b9b0"
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
python310-referencing \
python310-rfc3339-validator \
python310-rfc3986-validator \
python310-traitlets"

inherit rpm
