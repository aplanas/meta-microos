SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python311-jupyter-events-0.6.3-3.1.noarch.rpm"
RPM_HASH = "53dc1fad1379ab2e5b6345e14ffcac06c724fcd2451305932d0c712dbdb6e1bfbb2e980f2c8f7e11398cb9ecc7a45749aa4b205ad841a26f93f1e7dadeff0943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jupyter-events \
python3.11dist-jupyter-events \
python311-jupyter-events \
python3dist-jupyter-events"

RDEPENDS:${PN} += "-python311-jsonschema-format-nongpl >= 3.2.0 with python311-jsonschema-format-nongpl < 4.18 \
/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-PyYAML \
python311-python-json-logger \
python311-rfc3339-validator \
python311-rfc3986-validator \
python311-traitlets"

inherit rpm
