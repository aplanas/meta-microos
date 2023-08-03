SUMMARY = "Python API and CLI for OpenStack Freezer"
DESCRIPTION = "Client library for Freezer built on the Freezer API. It provides a Python API \
(the freezerclient module) and a command-line tool (freezer). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python3-freezerclient-4.4.0-1.6.noarch.rpm"
RPM_HASH = "42b724e23950a8edbab014e12b635de272caf8bf1df5934b41cf558fbc752648f42f603dee06855a773569ef751563387adf2009e269804cedb3e7cf7fc77071"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-freezerclient \
python3.11dist-python-freezerclient \
python3dist-python-freezerclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cliff \
python3-keystoneauth1 \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr"

inherit rpm
