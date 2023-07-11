SUMMARY = "Python API and CLI for OpenStack Magnum"
DESCRIPTION = "Client library for Magnum built on the Magnum API. It provides a Python API \
(the magnumclient module) and a command-line tool (magnum). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "python3-magnumclient-3.6.0-1.7.noarch.rpm"
RPM_HASH = "b195c13aba774f717388a6644ec8c6d41761eaeb93eb7a27a2a3c9a57e149a73129079cc1695fde9172a6370219b02d02ad6fba400710da9a4e36df4a78352af"
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
