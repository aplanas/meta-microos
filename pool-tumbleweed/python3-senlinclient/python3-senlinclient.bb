SUMMARY = "Python API and CLI for OpenStack Senlin"
DESCRIPTION = "OpenStack Clustering service Provisioning API Client Library \
 \
This is a client for the OpenStack Senlin API. \
It provides a Python API (the senlinclient module). \
 \
This package provides the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "2.4.0"

RPM_NAME = "python3-senlinclient-2.4.0-1.6.noarch.rpm"
RPM_HASH = "e682c6bbc8f87e3cbd557affaf2ec42e00cdda986c55c5cadb19e510aa02215094a6d5307f4e81a7f8a159b522d498af1f3f08e3820515f18a83541d77b8c806"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-senlinclient \
python3.10dist-python-senlinclient \
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
