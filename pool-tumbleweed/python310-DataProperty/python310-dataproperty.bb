SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "0.55.1"

RPM_NAME = "python310-DataProperty-0.55.1-1.1.noarch.rpm"
RPM_HASH = "13c7509d9404412c398adfc9e318391f6e1e32331fd5226aeda6536e0a54570309c113ce562964af65696d172e5df88e7c066dbaa043efec69f643b350d155c8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DataProperty \
python3.10dist-dataproperty \
python310-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python310-mbstrdecoder \
python310-typepy"

inherit rpm
