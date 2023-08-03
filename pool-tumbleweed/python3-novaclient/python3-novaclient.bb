SUMMARY = "Python API and CLI for OpenStack Nova"
DESCRIPTION = "This is a client for the OpenStack Nova API. There's a Python API (the \
novaclient module), and a command-line script (nova). Each implements 100% of \
the OpenStack Nova API."
LICENSE = "Apache-2.0"

PV = "18.3.0"

RPM_NAME = "python3-novaclient-18.3.0-1.4.noarch.rpm"
RPM_HASH = "a76c0512568a58a1ca25b1824126bd51bc6957bbf1144b49ec7ff61aed918adc3b4d1f69c6e6f3245d201869e05d452e7db1f87b9e07a838674729bdf2b9da65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-novaclient \
python3.11dist-python-novaclient \
python3dist-python-novaclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
openssl \
python-abi \
python3-Babel \
python3-PrettyTable \
python3-iso8601 \
python3-keystoneauth1 \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-simplejson"

inherit rpm
