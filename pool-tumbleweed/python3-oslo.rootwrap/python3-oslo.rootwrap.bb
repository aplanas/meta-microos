SUMMARY = "Filtering shell commands to run as root from OpenStack services"
DESCRIPTION = "oslo.rootwrap allows fine-grained filtering of shell commands to run as root \
from OpenStack services. \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "7.0.1"

RPM_NAME = "python3-oslo.rootwrap-7.0.1-1.3.noarch.rpm"
RPM_HASH = "2577b6ef3ade8327288dd1a3475667c15da4971cb8a0bb477a8726f94dba48a1f7ff6a1539c3b0ed4d061f55f49e1819a9302e2e25f73d5a6b1083e97e13f33f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-oslo.rootwrap \
python3.11dist-oslo.rootwrap \
python3dist-oslo.rootwrap"

RDEPENDS:${PN} += "/usr/bin/python3 \
python-abi"

inherit rpm
