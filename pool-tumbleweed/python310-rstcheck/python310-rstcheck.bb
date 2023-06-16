SUMMARY = "Python module to check syntax of reStructuredText"
DESCRIPTION = "A Python module to check the syntax of reStructuredText and code \
blocks nested within it."
LICENSE = "MIT"

PV = "3.3.1"

RPM_NAME = "python310-rstcheck-3.3.1-5.11.noarch.rpm"
RPM_HASH = "81cd62b0cd9c80aec97c66f3b679f833115bf985fa996698706409a99dc4d678aec2e6ed05c9efc39336ccd8153ff6e751fc5613154ce63a812b4b22f17c0119"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-rstcheck \
python3.10dist-rstcheck \
python310-rstcheck \
python3dist-rstcheck \
rstcheck"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
python-abi \
python310-docutils \
update-alternatives"

inherit rpm
