SUMMARY = "Standard finance enums"
DESCRIPTION = "Standard financial enumerations."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python39-finance_enums-0.1.0-2.7.noarch.rpm"
RPM_HASH = "5e7a99fbf275c1cbe8db8cf15461615d59cbe5c4f8e0d0cd8d8eec35b8fc0f1d7abd619b914e789b50e5965da89230f4845614495801e824f3a96ee19b1e4926"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(finance-enums) \
python39-finance_enums \
python3dist(finance-enums)"

RDEPENDS:${PN} += "python(abi) \
python39-pandas"

inherit rpm
