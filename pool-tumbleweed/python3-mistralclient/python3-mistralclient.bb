SUMMARY = "Python API and CLI for OpenStack Mistral"
DESCRIPTION = "Client library for Mistral built on the Mistral API. It provides a Python API \
(the mistralclient module) and a command-line tool (mistral). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.4.0"

RPM_NAME = "python3-mistralclient-4.4.0-2.6.noarch.rpm"
RPM_HASH = "36625b9fb120ddc5cfa219b0b448bdcbff13417a4808b8e20ed104d7f623ee3bdcafd652b5f1992467b82738dacffae25eb12adb7afdb63a70926c37d500de58"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-mistralclient \
python3.10dist-python-mistralclient \
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
