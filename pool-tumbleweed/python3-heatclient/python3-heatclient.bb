SUMMARY = "Python API and CLI for OpenStack Heat"
DESCRIPTION = "This is a client for the OpenStack Heat API. There's a Python API (the \
heatclient module), and a command-line script (heat). Each implements 100% of \
the OpenStack Heat API."
LICENSE = "Apache-2.0"

PV = "3.2.0"

RPM_NAME = "python3-heatclient-3.2.0-1.3.noarch.rpm"
RPM_HASH = "4cdae6ff42457e2e50e7b95e08600dadbbfc8db1e30c31df8949bb96c5d2b2c6dd6ef851b3212d58c06629693ce964a46e0dc207704398382b898e6996bcacfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-heatclient \
python3.11dist-python-heatclient \
python3dist-python-heatclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
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
