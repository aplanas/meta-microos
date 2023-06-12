SUMMARY = "Standard finance enums"
DESCRIPTION = "Standard financial enumerations."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python310-finance_enums-0.1.0-2.7.noarch.rpm"
RPM_HASH = "1cf5794630619e1b0c4d3a22b81dbd04b21574ccecc32b30183330827eeb2d87fcec41d46ae52256232495bccbc838fa718b6b169770b0092b2aad2385d124b4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-finance_enums \
python3.10dist(finance-enums) \
python310-finance_enums \
python3dist(finance-enums)"
RDEPENDS:${PN} += "python(abi) \
python310-pandas"

inherit rpm
