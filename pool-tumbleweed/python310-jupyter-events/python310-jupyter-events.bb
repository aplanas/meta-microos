SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.7.0"

RPM_NAME = "python310-jupyter-events-0.7.0-1.1.noarch.rpm"
RPM_HASH = "fb77e0e3d17ff9c7dd58d99bd03be7f4d0791d5bd1da3d11de2c70c2b954dfc99b6be2c77895ae68b06e70ac2ffcdf8b54a17801bee2f2970b882d781edef513"
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
