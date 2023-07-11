SUMMARY = "Python API and CLI for OpenStack Ironic"
DESCRIPTION = "OpenStack Bare Metal Provisioning API Client Library. \
 \
This is a client for the OpenStack Ironic API. It provides a Python API (the \
ironicclient module) and a command-line interface (ironic). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.1.0"

RPM_NAME = "python3-ironicclient-5.1.0-1.3.noarch.rpm"
RPM_HASH = "9b197d4f09c2bb69d0fb75e77d55fa6b07524256c544f4e3bc58e45df40393429eb007cfe448ce68960af0c54ce9cfb4816fe5683e92b8aa34e75bb8d1e205ed"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-ironicclient \
python3.10dist-python-ironicclient \
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
