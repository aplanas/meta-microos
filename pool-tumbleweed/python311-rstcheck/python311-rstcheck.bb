SUMMARY = "Python module to check syntax of reStructuredText"
DESCRIPTION = "A Python module to check the syntax of reStructuredText and code \
blocks nested within it."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python311-rstcheck-3.3.1-5.13.noarch.rpm"
RPM_HASH = "a4f77050d96f062232488201408c916c7598aa4ed41cb98c64ba7ce0b2b02ae7fa071c90d51bc7f82458a2ab56ce307ac4287ffb45436c21868ec726621f6b61"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rstcheck \
python3.11dist-rstcheck \
python311-rstcheck \
python3dist-rstcheck \
rstcheck"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
python311-docutils \
update-alternatives"

inherit rpm
