SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "7.3.2"

RPM_NAME = "python310-pytest-7.3.2-1.1.noarch.rpm"
RPM_HASH = "f2a3804075ad86bc07a219789bfa3fa13af3b4a10dd682115d50a8e886c298de2b66c0139db1cd43071e6ebfbd9891d7a4466dd48328fe0d2ca6d8dc3836d1b7"
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
