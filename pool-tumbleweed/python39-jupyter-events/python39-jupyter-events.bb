SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python39-jupyter-events-0.6.3-4.1.noarch.rpm"
RPM_HASH = "0951ae76ddd7a7cac6459c3927c6b7eb6b4ffc5eb7af3736e88f284f10e5bc53d025fb83bb148be4e4052bfd61e111420440cb3509c10348a43d14f5df601238"
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
