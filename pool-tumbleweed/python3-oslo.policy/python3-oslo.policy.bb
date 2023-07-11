SUMMARY = "OpenStack Oslo Policy library"
DESCRIPTION = "The OpenStack Oslo Policy library. \
RBAC policy enforcement library for OpenStack. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python3-oslo.policy-4.1.1-1.3.noarch.rpm"
RPM_HASH = "b65e2a5fe3ace15969e293b5cb77e4061debe7f00592645792f3cf30c1337a55dd680e23914843d44b1c2b158e50778087100b4f89d07faf983ee3cef3bf6ce7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.policy \
python3.11dist-oslo.policy \
python3dist-oslo.policy"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi \
python3-PyYAML \
python3-oslo.config \
python3-oslo.context \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-requests \
python3-stevedore"

inherit rpm
