SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "7.3.2"

RPM_NAME = "python39-pytest-7.3.2-1.1.noarch.rpm"
RPM_HASH = "005a248bc98d4824d09776f558906019ee0b237b7595682186ee30f28065b7408be1ea859be5177d6c99fcdec8cd638d87cc8034795d13de715ecfaa4d34cd78"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest \
python39-pytest \
python3dist-pytest"

RDEPENDS:${PN} += "/usr/bin/python3.9 \
/usr/bin/sh \
alts \
python-abi \
python39-attrs \
python39-exceptiongroup \
python39-importlib-metadata \
python39-iniconfig \
python39-packaging \
python39-pluggy \
python39-setuptools \
python39-tomli"

inherit rpm
