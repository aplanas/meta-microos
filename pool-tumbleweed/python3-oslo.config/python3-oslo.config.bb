SUMMARY = "OpenStack common configuration library"
DESCRIPTION = "The Oslo project intends to produce a python library containing \
infrastructure code shared by OpenStack projects. The APIs provided \
by the project should be high quality, stable, consistent and generally \
useful. \
 \
The oslo-config library is a command line and configuration file \
parsing library from the Oslo project. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "9.1.1"

RPM_NAME = "python3-oslo.config-9.1.1-1.2.noarch.rpm"
RPM_HASH = "cf063b3470095d80ea9e8c613abf804050897bb5e2f71b3898fe10583887492213eb69df14a33f05d0924433c1e1e207b5d538a2b342403d32199e2b2ae50209"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.config \
python3.11dist-oslo.config \
python3dist-oslo.config"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-debtcollector \
python3-importlib-metadata \
python3-netaddr \
python3-oslo.i18n \
python3-requests \
python3-rfc3986 \
python3-stevedore"

inherit rpm
