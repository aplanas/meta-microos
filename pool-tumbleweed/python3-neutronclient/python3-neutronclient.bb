SUMMARY = "Python API and CLI for OpenStack Neutron"
DESCRIPTION = "Client library and command line utility for interacting with OpenStack \
Neutron's API. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "7.8.0"

RPM_NAME = "python3-neutronclient-7.8.0-1.5.noarch.rpm"
RPM_HASH = "85c0512d144bf09482edd84e49be7964244fa150b030e45c7dccc6086c15ade7103c553f5661f3ec4c53cc73b9a9874414926ed09c7d227de7c0eb1f92def232"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-neutronclient \
python3.10dist-python-neutronclient \
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
