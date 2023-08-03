SUMMARY = "Generic Key Manager interface for OpenStack"
DESCRIPTION = "Generic Key Manager interface for OpenStack. \
 \
This package includes the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.11.0"

RPM_NAME = "python3-castellan-3.11.0-1.5.noarch.rpm"
RPM_HASH = "039a99e5f32440d51e6135bee400346e673b4cda4a94a7602ce6e695b317b976a89ccabe07f93a1c4141494ac3a94856279a5193c12f2c6952a129c25369015f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-castellan \
python3.11dist-castellan \
python3dist-castellan"

RDEPENDS:${PN} += "/usr/bin/bash \
python-abi \
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
