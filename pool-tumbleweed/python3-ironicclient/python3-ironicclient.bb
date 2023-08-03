SUMMARY = "Python API and CLI for OpenStack Ironic"
DESCRIPTION = "OpenStack Bare Metal Provisioning API Client Library. \
 \
This is a client for the OpenStack Ironic API. It provides a Python API (the \
ironicclient module) and a command-line interface (ironic). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python3-ironicclient-5.1.0-1.4.noarch.rpm"
RPM_HASH = "4685ef5aeed439cd544385adbae92bc80b0a2eb214874d9cd5392a6feb79c00f8c1cf4c97b107ee14ad3942b5dafbb20d3981ef037cabda50c52b0be1d0f98eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ironicclient \
python3.11dist-python-ironicclient \
python3dist-python-ironicclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-appdirs \
python3-dogpile.cache \
python3-jsonschema \
python3-keystoneauth1 \
python3-openstackclient \
python3-osc-lib \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-requests"

inherit rpm
