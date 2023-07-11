SUMMARY = "Standard finance enums"
DESCRIPTION = "Standard financial enumerations."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python39-finance_enums-0.1.0-2.9.noarch.rpm"
RPM_HASH = "e6a8c0eb362d5dc668c80b277ab987f855377036270a81c28bd9448044929ed0041997f83732c0f339b6a36479895bb3530bc70db8f76ffa1502f56fa3bea886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-finance-enums \
python39-finance-enums \
python3dist-finance-enums"

RDEPENDS:${PN} += "python-abi \
python39-pandas"

inherit rpm
