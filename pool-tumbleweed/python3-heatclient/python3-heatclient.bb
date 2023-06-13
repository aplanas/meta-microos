SUMMARY = "Python API and CLI for OpenStack Heat"
DESCRIPTION = "This is a client for the OpenStack Heat API. There's a Python API (the \
heatclient module), and a command-line script (heat). Each implements 100% of \
the OpenStack Heat API."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python3-heatclient-3.2.0-1.2.noarch.rpm"
RPM_HASH = "3a1b5ca5c9e0a93e560205456a5a8c7e0dbbca2e1163f56a4c995843871effbb8212fe557f6c22d00928d26c2485244b1d66803d1f1b24c08ee5c54a6ce67d1b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-heatclient \
python3.10dist(python-heatclient) \
python3dist(python-heatclient)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-Babel \
python3-PrettyTable \
python3-PyYAML \
python3-cliff \
python3-iso8601 \
python3-keystoneauth1 \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-requests \
python3-swiftclient"

inherit rpm
