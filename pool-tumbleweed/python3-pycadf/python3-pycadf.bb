SUMMARY = "DMTF Cloud Audit (CADF) data model"
DESCRIPTION = "DMTF Cloud Audit (CADF) data model \
 \
This package contains the Python 3.x module."
LICENSE = "Apache-2.0"

PV = "3.1.1"

RPM_NAME = "python3-pycadf-3.1.1-2.6.noarch.rpm"
RPM_HASH = "9a9e43d9cb8ec88e90af5a06ac90926db9eabd24432736ab26377bc37c521ee8e4ddc238732db386705b03e2c17b30881cc9933cf17bddbf05bfddc7b786c603"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pycadf \
python3.11dist-pycadf \
python3dist-pycadf"

RDEPENDS:${PN} += "python-abi \
python-pycadf-common \
python3-debtcollector \
python3-oslo.config \
python3-oslo.serialization \
python3-pytz \
python3-six"

inherit rpm
