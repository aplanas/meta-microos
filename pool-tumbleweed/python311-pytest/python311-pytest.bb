SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "7.4.0"

RPM_NAME = "python311-pytest-7.4.0-1.1.noarch.rpm"
RPM_HASH = "9cb4da00eefdbf5af569205ed501c3874cd0ea30fdad7da262218b25956e2cc787f3cae9034aaec022f2ed5dd1e6395a85005773afa09f361dcd4da2d4b46c78"
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
