SUMMARY = "Python API and CLI for OpenStack Cinder"
DESCRIPTION = "This is a client for the OpenStack Cinder API (Block Storage. There's a \
Python API (the cinderclient module), and a command-line script (cinder). \
Each implements 100% of the OpenStack Cinder API. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "9.3.0"

RPM_NAME = "python3-cinderclient-9.3.0-1.2.noarch.rpm"
RPM_HASH = "3eb4551ca727d0668d3c71e5ad35d92829b95130555511b4bd3b6ce3b333a5ac553e7054a45713e6bf8eb20969ceba59afe5392d52ce00090e2ec180c5fd2229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cinderclient \
python3.10dist-python-cinderclient \
python3dist-python-cinderclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-Babel \
python3-PrettyTable \
python3-keystoneauth1 \
python3-oslo.i18n \
python3-oslo.utils \
python3-requests"

inherit rpm
