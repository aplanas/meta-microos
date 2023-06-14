SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python311-jupyter-events-0.6.3-2.2.noarch.rpm"
RPM_HASH = "30a8c45c71e372049f90ab9219cf7538862047c18ff4adbd6c1aaa46b3355673a2e22076fe174c36611cbff6c2648c9f9bca627003f4ede8d5baeed16f49ff99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-jupyter-events \
python311-jupyter-events \
python3dist-jupyter-events"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
alts \
python-abi \
python311-PyYAML \
python311-jsonschema-format-nongpl \
python311-python-json-logger \
python311-rfc3339-validator \
python311-rfc3986-validator \
python311-traitlets"

inherit rpm
