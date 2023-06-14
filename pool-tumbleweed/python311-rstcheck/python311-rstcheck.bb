SUMMARY = "Python module to check syntax of reStructuredText"
DESCRIPTION = "A Python module to check the syntax of reStructuredText and code \
blocks nested within it."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python311-rstcheck-3.3.1-5.11.noarch.rpm"
RPM_HASH = "0a088668c9b400c7209f5c5a1ac4341056ee75203a3f21d8ce45fe970d27d473073b13b25cbc9252f57dbdc49276a24f997711ca82c44adfcce3747d637eb2dd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-rstcheck \
python311-rstcheck \
python3dist-rstcheck \
rstcheck"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.11 \
python-abi \
python311-docutils \
update-alternatives"

inherit rpm
