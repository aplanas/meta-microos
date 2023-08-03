SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "7.4.0"

RPM_NAME = "python310-pytest-7.4.0-1.1.noarch.rpm"
RPM_HASH = "33df91f26bd38abfa48aa232253dc3aed43a32cde9a5e586a5730e909860064bc161498bb7674f92c7767ec6c1d0840fe0a150ed7a9a52c47cadb72f8b968a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest \
python310-pytest \
python3dist-pytest"

RDEPENDS:${PN} += "/usr/bin/python3.10 \
/usr/bin/sh \
alts \
python-abi \
python310-attrs \
python310-exceptiongroup \
python310-importlib-metadata \
python310-iniconfig \
python310-packaging \
python310-pluggy \
python310-setuptools \
python310-tomli"

inherit rpm
