SUMMARY = "Check whether versions number match PEP 440"
DESCRIPTION = "A simple package with utils to check whether versions number match Pep 440."
LICENSE = "MIT"

PV = "0.1.2"

RPM_NAME = "python311-pep440-0.1.2-1.6.noarch.rpm"
RPM_HASH = "482b0652b2c37991ba9355cf56083e18794c6ac52841b3037640ff2c2e96a610f5fa3203aaa7dab87d6f4e16a5d6c43ce1ecde5b36d6632d60564656489fc909"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pep440 \
python3.11dist-pep440 \
python311-pep440 \
python3dist-pep440"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
python-abi \
update-alternatives"

inherit rpm
