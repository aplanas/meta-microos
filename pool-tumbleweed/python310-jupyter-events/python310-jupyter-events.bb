SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python310-jupyter-events-0.6.3-3.1.noarch.rpm"
RPM_HASH = "1e42d5a7ec1dfd559e4faaf12413568e857d81b1a237676f74396a61022cd62fcd95954cedb841661ff3db0653b328db09217842684fd30634aa8da7c9534a8c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jupyter-events \
python310-jupyter-events \
python3dist-jupyter-events"

RDEPENDS:${PN} += "-python310-jsonschema-format-nongpl >= 3.2.0 with python310-jsonschema-format-nongpl < 4.18 \
/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-PyYAML \
python310-python-json-logger \
python310-rfc3339-validator \
python310-rfc3986-validator \
python310-traitlets"

inherit rpm
