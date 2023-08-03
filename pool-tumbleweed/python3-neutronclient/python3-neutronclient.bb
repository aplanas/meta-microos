SUMMARY = "Python API and CLI for OpenStack Neutron"
DESCRIPTION = "Client library and command line utility for interacting with OpenStack \
Neutron's API. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "7.8.0"

RPM_NAME = "python3-neutronclient-7.8.0-1.6.noarch.rpm"
RPM_HASH = "26c1f2a5b5bb39c7ff571d06b234bac4537e0163f0f1b2951f7259c5831895c883bf74f6712aa96b091721132d692a4f461e08ccf5f4ffbf126ae4d8669215cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-neutronclient \
python3.11dist-python-neutronclient \
python3dist-python-neutronclient"

RDEPENDS:${PN} += "/usr/bin/bash \
/usr/bin/env \
/usr/bin/python3 \
python-abi \
python3-Babel \
python3-cliff \
python3-debtcollector \
python3-iso8601 \
python3-keystoneauth1 \
python3-keystoneclient \
python3-netaddr \
python3-os-client-config \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-requests \
python3-simplejson \
python3-six"

inherit rpm
