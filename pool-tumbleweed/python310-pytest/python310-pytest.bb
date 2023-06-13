SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "7.3.1"

RPM_NAME = "python310-pytest-7.3.1-1.1.noarch.rpm"
RPM_HASH = "7218fdaeda8093ecb731ecc067b3d8e0b7d81d1038b57f2c8de073fdd1e88ea37cc53b419241f635f000fb5d334d9e5ef24e42959b4b2030e428199bf12cc292"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest \
python3.10dist(pytest) \
python310-pytest \
python3dist(pytest)"

RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.10 \
alts \
python(abi) \
python310-attrs \
python310-exceptiongroup \
python310-importlib-metadata \
python310-iniconfig \
python310-packaging \
python310-pluggy \
python310-setuptools \
python310-tomli"

inherit rpm
