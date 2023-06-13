SUMMARY = "OpenStack Oslo Policy library"
DESCRIPTION = "The OpenStack Oslo Policy library. \
RBAC policy enforcement library for OpenStack. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.1.1"

RPM_NAME = "python3-oslo.policy-4.1.1-1.2.noarch.rpm"
RPM_HASH = "8cbeba6034143b68ed59777e3c27c0c29a797b334cf9c9232ea7da49b67b011693de570333c6fda616b22176161e8ae6d5bf4cd4b0d7c465703f3876acd01abf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.policy \
python3.10dist(oslo.policy) \
python3dist(oslo.policy)"

RDEPENDS:${PN} += "/usr/bin/python3 \
python(abi) \
python3-PyYAML \
python3-oslo.config \
python3-oslo.context \
python3-oslo.i18n \
python3-oslo.serialization \
python3-oslo.utils \
python3-requests \
python3-stevedore"

inherit rpm
