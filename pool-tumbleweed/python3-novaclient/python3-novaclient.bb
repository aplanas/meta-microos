SUMMARY = "Python API and CLI for OpenStack Nova"
DESCRIPTION = "This is a client for the OpenStack Nova API. There's a Python API (the \
novaclient module), and a command-line script (nova). Each implements 100% of \
the OpenStack Nova API."
LICENSE = "Apache-2.0"

PV = "18.3.0"

RPM_NAME = "python3-novaclient-18.3.0-1.3.noarch.rpm"
RPM_HASH = "15e50d6efffe7c8450f2d7bea7d485a4abcce30a3229e60a761f78a6bb984d2dc55309d486e77bf1618ed85c85852f92434def747375e93d2cee2b7b912ad576"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-novaclient \
python3.10dist-python-novaclient \
python3dist-python-novaclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
openssl \
python-abi \
python3-Babel \
python3-PrettyTable \
python3-iso8601 \
python3-keystoneauth1 \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-simplejson"

inherit rpm
