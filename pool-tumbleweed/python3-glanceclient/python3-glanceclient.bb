SUMMARY = "Python API and CLI for OpenStack Glance"
DESCRIPTION = "This is a client for the OpenStack Glance API. There's a Python API (the \
glanceclient module), and a command-line script (glance). Each implements \
100% of the OpenStack Glance API."
LICENSE = "Apache-2.0"

PV = "4.3.0"

RPM_NAME = "python3-glanceclient-4.3.0-1.2.noarch.rpm"
RPM_HASH = "c54a6143f6c966c6fef05fac53605dfa44adfe65310cc9346e4be77f0b4693cc7b40b173d2bcae9befc978040a0026b8029714ac165af8eda8580816b2aaaa56"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-glanceclient \
python3.10dist-python-glanceclient \
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
