SUMMARY = "A schema and validator for YAML"
DESCRIPTION = "A schema and validator for YAML."
LICENSE = "MIT"

PV = "4.0.4"

RPM_NAME = "python311-yamale-4.0.4-2.3.noarch.rpm"
RPM_HASH = "554a96b9cf55bee3d97348371d1207e5c6aada31e750afcd9cd6dc4daae86f04f259d804c5962821b0228371da1d0283e6bdc271185b0e86d8c35758553a27d3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-yamale \
python3.11dist-yamale \
python311-yamale \
python3dist-yamale"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
