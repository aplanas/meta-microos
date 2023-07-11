SUMMARY = "Standard finance enums"
DESCRIPTION = "Standard financial enumerations."
LICENSE = "Apache-2.0"

PV = "0.1.0"

RPM_NAME = "python311-finance_enums-0.1.0-2.9.noarch.rpm"
RPM_HASH = "163ca0b65f0f21b4e23a1ff07888b080a894664a2903ace83dae26a4d413cb98a58e65007a13d5d472da4e7e69b10faaa0edcf0989dcbb3f6aebd526ea235267"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-finance-enums \
python3.11dist-finance-enums \
python311-finance-enums \
python3dist-finance-enums"

RDEPENDS:${PN} += "python-abi \
python311-pandas"

inherit rpm
