SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "1.0.1"

RPM_NAME = "python310-DataProperty-1.0.1-1.1.noarch.rpm"
RPM_HASH = "f89340002a8dc2d6f91bfbfdf3080351577c49971961bc05e585b00e20f6338e01c9994eeeb2347d7c601a2c28e99ccd3a817b5ed30ced190c4e65bb6ea20204"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-dataproperty \
python310-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python310-mbstrdecoder \
python310-typepy"

inherit rpm
