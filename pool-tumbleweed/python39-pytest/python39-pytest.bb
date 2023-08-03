SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "7.4.0"

RPM_NAME = "python39-pytest-7.4.0-1.1.noarch.rpm"
RPM_HASH = "46ecb03b7b31f574051cc51373a5bfa435f4251e01df2105d8a222f47b074a2d0c2e1deffb772c797c4e352a2dfe40c9f8bb044e3666e74671043aba4a3e622a"
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
