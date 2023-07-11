SUMMARY = "Extends the python-rich library functionality"
DESCRIPTION = "Extends the python-rich library functionality \
with a set of changes that were not accepted to rich itself."
LICENSE = "MIT"

PV = "1.2.7"

RPM_NAME = "python311-enrich-1.2.7-3.3.noarch.rpm"
RPM_HASH = "f977633a26eed5f95187cbd11b13512c1472b4e711e99b4fa89453f1e9bae2ab84b2dbc90b62eff12c0d1e9f558d8419b32833ec2a223ecb993bb03abf698306"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-enrich \
python3.11dist-enrich \
python311-enrich \
python3dist-enrich"

RDEPENDS:${PN} += "python-abi \
python3.11dist-rich \
python311-rich"

inherit rpm
