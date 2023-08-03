SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python311-DataProperty-1.0.1-1.1.noarch.rpm"
RPM_HASH = "14b9d23351442a583b335d4db78188647f7e524c53b7c2d65cb3df12042e01728d51c2440e1f2eb6ac18c31dd95496d5b62ca8dbfb45e04bb6571475e4843107"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DataProperty \
python3.11dist-dataproperty \
python311-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python311-mbstrdecoder \
python311-typepy"

inherit rpm
