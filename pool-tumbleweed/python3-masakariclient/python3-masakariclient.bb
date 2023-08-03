SUMMARY = "Python API and CLI for OpenStack Masakari"
DESCRIPTION = "Client library for Masakari built on the Masakari API. It provides a Python API \
(the masakariclient module) and a command-line tool (masakari). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "7.1.0"

RPM_NAME = "python3-masakariclient-7.1.0-1.5.noarch.rpm"
RPM_HASH = "9bbef04b1bfe5642f9330d8983ede206278f871e73aa7af635e05af511d7e0c6582b7a058fbb6fd49d4bf12f4367aaa10619ac240a9a7fed4151c7fbef872df0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-masakariclient \
python3.11dist-python-masakariclient \
python3dist-python-masakariclient"

RDEPENDS:${PN} += "python-abi \
python3-openstacksdk \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr"

inherit rpm
