SUMMARY = "Python library for extract property from data"
DESCRIPTION = "Python library for extract property from data."
LICENSE = "MIT"

PV = "0.55.1"

RPM_NAME = "python311-DataProperty-0.55.1-1.3.noarch.rpm"
RPM_HASH = "eb24220696e705e5ab0624004542d7419d720d853c7b251afe7feb1595674fd3365013f0aa624dd0017189dea48d431b76812ad421be95a1b2d574ca14b02be7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-DataProperty \
python3.11dist-dataproperty \
python311-DataProperty \
python3dist-dataproperty"

RDEPENDS:${PN} += "python-abi \
python311-mbstrdecoder \
python311-typepy"

inherit rpm
