SUMMARY = "OpenStack DNS as a Service - Client"
DESCRIPTION = "OpenStack DNS as a Service - Client \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "4.5.0"

RPM_NAME = "python3-designateclient-4.5.0-1.5.noarch.rpm"
RPM_HASH = "46d88e3ef10f1a6b61a59d70d05b3090f05f63fc9c52bffb65f9ceab41c590d6232ced0c07cbe5d26f1ecf303e79cdfdc94153ac20a5036b9255038b0c31fb03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-designateclient \
python3.11dist-python-designateclient \
python3dist-python-designateclient"

RDEPENDS:${PN} += "python-abi \
python3-cliff \
python3-debtcollector \
python3-jsonschema \
python3-keystoneauth1 \
python3-osc-lib \
python3-oslo.serialization \
python3-oslo.utils \
python3-requests \
python3-six \
python3-stevedore"

inherit rpm
