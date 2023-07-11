SUMMARY = "Jupyter Event System library"
DESCRIPTION = "Jupyter Events enables Jupyter Python Applications (e.g. Jupyter Server, \
JupyterLab Server, JupyterHub, etc.) to emit events—structured data \
describing things happening inside the application. Other software \
(e.g. client applications like JupyterLab) can listen and respond to \
these events."
LICENSE = "BSD-3-Clause"

PV = "0.6.3"

RPM_NAME = "python311-jupyter-events-0.6.3-2.4.noarch.rpm"
RPM_HASH = "df77b1f578cf6e095c53444c532004c2aac3cd647077dda88e2e13c39572b6712a1e4d52f878afb68d5d28ab752e5e2307923fc9558cb3360304ff22a6b05491"
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
python311-rfc3339-validator \
python311-rfc3986-validator \
python311-traitlets"

inherit rpm
