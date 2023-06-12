SUMMARY = "Python API and CLI for OpenStack Mistral"
DESCRIPTION = "Client library for Mistral built on the Mistral API. It provides a Python API \
(the mistralclient module) and a command-line tool (mistral). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python3-mistralclient-4.4.0-2.5.noarch.rpm"
RPM_HASH = "112f586412a69594c4e5234406adfc1d21480c5b55f3134528b2b3065ed790c03fe8b731b7aab78ea123db64571fe8361598aade145a5811c9749e26d640be48"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistralclient \
python3.10dist(python-mistralclient) \
python3dist(python-mistralclient)"
RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-PyYAML \
python3-cliff \
python3-keystoneclient \
python3-os-client-config \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.utils \
python3-osprofiler \
python3-requests \
python3-stevedore"

inherit rpm
