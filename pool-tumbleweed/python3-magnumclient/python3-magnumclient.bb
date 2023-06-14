SUMMARY = "Python API and CLI for OpenStack Magnum"
DESCRIPTION = "Client library for Magnum built on the Magnum API. It provides a Python API \
(the magnumclient module) and a command-line tool (magnum). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "python3-magnumclient-3.6.0-1.6.noarch.rpm"
RPM_HASH = "cfc85a3748134a2e2ca0c424dd854a32864fa29fd28b8446412032f19890071c670732f305dd73c57ae170689e4731140d43bec0b72e8681499a78fc86039c7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magnumclient \
python3.10dist-python-magnumclient \
python3dist-python-magnumclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PrettyTable \
python3-cryptography \
python3-decorator \
python3-keystoneauth1 \
python3-os-client-config \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-requests \
python3-stevedore"

inherit rpm
