SUMMARY = "Python API and CLI for OpenStack Senlin"
DESCRIPTION = "OpenStack Clustering service Provisioning API Client Library \
 \
This is a client for the OpenStack Senlin API. \
It provides a Python API (the senlinclient module). \
 \
This package provides the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python3-senlinclient-2.4.0-1.7.noarch.rpm"
RPM_HASH = "5ef1c1b770abe86b8b9e13eecdac9e5d6accf4e48855fbc3ed963125b04f30f40dad0fdbd64a6168e22a4b96322bce785f6e6c7b3c615657d26df8d1a8c5450d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-senlinclient \
python3.11dist-python-senlinclient \
python3dist-python-senlinclient"

RDEPENDS:${PN} += "python-abi \
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
