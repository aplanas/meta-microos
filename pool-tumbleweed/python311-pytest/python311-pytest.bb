SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "7.3.2"

RPM_NAME = "python311-pytest-7.3.2-1.1.noarch.rpm"
RPM_HASH = "29b858849fd70bbb0a7a1639d782ff25ebeb879dbe7dbe13f0adf51b50c2b739a884d56e046155766f415d885eb5765ee9bd2eb8afc2a10a4edc55598739c0ce"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest \
python3.11dist-pytest \
python311-pytest \
python3dist-pytest"

RDEPENDS:${PN} += "/usr/bin/python3.11 \
/usr/bin/sh \
alts \
python-abi \
python311-attrs \
python311-exceptiongroup \
python311-importlib-metadata \
python311-iniconfig \
python311-packaging \
python311-pluggy \
python311-setuptools \
python311-tomli"

inherit rpm
