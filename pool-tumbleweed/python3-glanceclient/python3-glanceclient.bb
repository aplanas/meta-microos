SUMMARY = "Python API and CLI for OpenStack Glance"
DESCRIPTION = "This is a client for the OpenStack Glance API. There's a Python API (the \
glanceclient module), and a command-line script (glance). Each implements \
100% of the OpenStack Glance API."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python3-glanceclient-4.3.0-1.3.noarch.rpm"
RPM_HASH = "e897f4f19d1a3070275de7fc54e369432990573ae1bd945fc3e162d08bd0ac9e890a57c3c502b9945ca9cd4c3233751b84b33e91241f94eb1f27745a3e5cb2b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glanceclient \
python3.11dist-python-glanceclient \
python3dist-python-glanceclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PrettyTable \
python3-keystoneauth1 \
python3-oslo.i18n \
python3-oslo.utils \
python3-pbr \
python3-pyOpenSSL \
python3-requests \
python3-warlock \
python3-wrapt"

inherit rpm
