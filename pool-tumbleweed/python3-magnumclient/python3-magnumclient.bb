SUMMARY = "Python API and CLI for OpenStack Magnum"
DESCRIPTION = "Client library for Magnum built on the Magnum API. It provides a Python API \
(the magnumclient module) and a command-line tool (magnum). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.6.0"

RPM_NAME = "python3-magnumclient-3.6.0-1.8.noarch.rpm"
RPM_HASH = "3d999b7c68e81e8aa6d5aeec95a7d86daf30ef48456f9a939a3854f77f97ffaa57d48211e3862c723d4648d2736eaeab8bb01e17e07e8b7499cba6ad3c9c7dfd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-magnumclient \
python3.11dist-python-magnumclient \
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
