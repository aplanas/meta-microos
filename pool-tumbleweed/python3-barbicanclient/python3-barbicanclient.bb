SUMMARY = "Client for the Barbican Key Management API"
DESCRIPTION = "This is a client for the Barbican Key Management API. This package includes a \
Python library for accessing the API (the barbicanclient module), and a \
command-line script (barbican). \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "5.2.0"

RPM_NAME = "python3-barbicanclient-5.2.0-1.5.noarch.rpm"
RPM_HASH = "efb9deaff3f33f268ba4dcbf28c33be11198494cd09d41dd31b1e68fda9a191e83abd02233772b9f8d47320adc9b95dbb85b64c3f7fc8a38741611a257a056c0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-barbicanclient \
python3.11dist-python-barbicanclient \
python3dist-python-barbicanclient"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-cliff \
python3-keystoneauth1 \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-pbr \
python3-requests \
python3-six"

inherit rpm
