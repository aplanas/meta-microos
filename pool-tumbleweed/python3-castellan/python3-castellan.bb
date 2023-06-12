SUMMARY = "Generic Key Manager interface for OpenStack"
DESCRIPTION = "Generic Key Manager interface for OpenStack. \
 \
This package includes the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python3-castellan-3.11.0-1.4.noarch.rpm"
RPM_HASH = "e1ae097a6484b3aac1146f1fa6f67d43452c3bec52524f16ed942cf26f7b744a3436831f7eca2fbb2dd8d5805ec49dc8939757abbb963ae0b703e6e436abff31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-castellan \
python3.10dist(castellan) \
python3dist(castellan)"
RDEPENDS:${PN} += "/bin/bash \
python(abi) \
python3-Babel \
python3-barbicanclient \
python3-cryptography \
python3-keystoneauth1 \
python3-oslo.config \
python3-oslo.context \
python3-oslo.i18n \
python3-oslo.log \
python3-oslo.utils \
python3-requests \
python3-stevedore"

inherit rpm
