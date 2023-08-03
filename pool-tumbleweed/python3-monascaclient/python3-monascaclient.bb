SUMMARY = "Python API and CLI for OpenStack Monasca"
DESCRIPTION = "This is a client library for Monasca built to interface with the Monasca API. It \
provides a Python API (the ``monascaclient`` module) and a command-line tool \
(``monasca``). \
 \
The Monasca Client was written using the OpenStack Heat Python client as a framework."
LICENSE = "Apache-2.0"

PV = "2.5.0"

RPM_NAME = "python3-monascaclient-2.5.0-1.6.noarch.rpm"
RPM_HASH = "8cced9f37a465309dac4cf39751805536513ceeb6faba8ed1d36d3fa31536bc41d4cf9608fb83ce0151b8364954c87daff8c68243d264e639becacf504eb0cc3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-monascaclient \
python3.11dist-python-monascaclient \
python3dist-python-monascaclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Babel \
python3-PrettyTable \
python3-PyYAML \
python3-iso8601 \
python3-osc-lib \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-requests \
python3-six"

inherit rpm
