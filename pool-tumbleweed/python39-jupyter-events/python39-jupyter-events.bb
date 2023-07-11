SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python39-jupyter-events-0.6.3-2.4.noarch.rpm"
RPM_HASH = "8a4cca6eea53a9c8761b4eda631e1120a173629a67be34f2962a03a88c32b61fc2fa5d6d08eedcb44f6dc51b2e11ced58873b8edec4fb5713d98426e3319a13c"
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
python39-rfc3339-validator \
python39-rfc3986-validator \
python39-traitlets"

inherit rpm
