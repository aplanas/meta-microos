SUMMARY = "Python API and CLI for OpenStack Cinder"
DESCRIPTION = "This is a client for the OpenStack Cinder API (Block Storage. There's a \
Python API (the cinderclient module), and a command-line script (cinder). \
Each implements 100% of the OpenStack Cinder API. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "9.3.0"

RPM_NAME = "python3-cinderclient-9.3.0-1.3.noarch.rpm"
RPM_HASH = "6af0ca48a9eb6c1d66df531d20f26b955fe5e1b04ef34f39b2564d650c81eb685588947d52736ecf310cbabe6499788feee03e5712070b8a3156610a82a4bc55"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-cinderclient \
python3.11dist-python-cinderclient \
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
