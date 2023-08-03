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

RPM_NAME = "python3-oslo.config-9.1.1-2.1.noarch.rpm"
RPM_HASH = "79f19c1b1960e0ac9d97d3db98c04506121ab9aadcf7f257bfc1e43cd90bd600a01d46c9f12de9d327099e7fb09cae3bbff7c5832fc553eeb67ce2f9e893ced1"
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
python3-stevedore \
python3-urllib3"

inherit rpm
