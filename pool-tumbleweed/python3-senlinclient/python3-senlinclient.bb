SUMMARY = "Python API and CLI for OpenStack Senlin"
DESCRIPTION = "OpenStack Clustering service Provisioning API Client Library \
 \
This is a client for the OpenStack Senlin API. \
It provides a Python API (the senlinclient module). \
 \
This package provides the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python3-senlinclient-2.4.0-1.5.noarch.rpm"
RPM_HASH = "17bbf7104b0684ec2dd334ce8944aed5b69906dc7bd672e5613efa1dbe504243c728b872829d3a1c75ecb9cbbb851b6d4c08d5432eea878f55b81e352a8d8e57"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-senlinclient \
python3.10dist(python-senlinclient) \
python3dist(python-senlinclient)"

RDEPENDS:${PN} += "python(abi) \
python3-PrettyTable \
python3-PyYAML \
python3-heatclient \
python3-keystoneauth1 \
python3-openstackclient \
python3-openstacksdk \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-requests"

inherit rpm
