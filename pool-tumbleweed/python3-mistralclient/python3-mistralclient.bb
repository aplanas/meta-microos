SUMMARY = "Python API and CLI for OpenStack Mistral"
DESCRIPTION = "Client library for Mistral built on the Mistral API. It provides a Python API \
(the mistralclient module) and a command-line tool (mistral). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python3-mistralclient-4.4.0-2.7.noarch.rpm"
RPM_HASH = "3c3ffb428d96fa8f2caf52b877cb993d7bcf9e09a7a1154de30ec1a9b0336af2ca2cda52692534f2c3819a6e41b702d1bedcb52c0a6aea1d61450148a7fdb4d9"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistralclient \
python3.11dist-python-mistralclient \
python3dist-python-mistralclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
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
