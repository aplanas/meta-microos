SUMMARY = "Client library for OpenStack Sahara API"
DESCRIPTION = "Python client library for interacting with OpenStack Sahara API. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.5.0"

RPM_NAME = "python3-saharaclient-3.5.0-1.7.noarch.rpm"
RPM_HASH = "4148a11aebfd2908769cff1069006142c29de933402cfcce1fac62edefe9b6b1b8d3af121db2d8f03579c739b599fde60ee024961c8cbdba2d3f8236b3dc8cda"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-saharaclient \
python3.11dist-python-saharaclient \
python3dist-python-saharaclient"

RDEPENDS:${PN} += "python-abi \
python3-Babel \
python3-keystoneauth1 \
python3-openstackclient \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.serialization \
python3-oslo.utils \
python3-requests \
python3-six"

inherit rpm
