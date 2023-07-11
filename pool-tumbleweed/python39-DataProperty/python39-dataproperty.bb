SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "0.55.1"

RPM_NAME = "python39-DataProperty-0.55.1-1.3.noarch.rpm"
RPM_HASH = "9d8070c9ce1652e0a6eab8200afa58614a34c475b8ad386820114b92dd1a79333679ca8fc70698803382611e437d6d51532aacee2c991770a7ae39d03fba0229"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-dataproperty \
python39-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python39-mbstrdecoder \
python39-typepy"

inherit rpm
