SUMMARY = "Standard finance enums"
DESCRIPTION = "Standard financial enumerations."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python310-finance_enums-0.1.0-2.9.noarch.rpm"
RPM_HASH = "8e504d20db6be2c61cedafa9ecb85837ade57b11b52a61af3a113b1df5650cdff725d7f92d129cafc83bb842969d76966db61da964833fe5a1c208700a1b4d31"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-finance-enums \
python310-finance-enums \
python3dist-finance-enums"

RDEPENDS:${PN} += "python-abi \
python310-pandas"

inherit rpm
