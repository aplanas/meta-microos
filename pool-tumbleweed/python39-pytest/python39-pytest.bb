SUMMARY = "Simple powerful testing with Python"
DESCRIPTION = "The pytest framework makes it easy to write small tests, yet scales to support \
complex functional testing for applications and libraries."
LICENSE = "MIT"

PV = "7.3.1"

RPM_NAME = "python39-pytest-7.3.1-1.1.noarch.rpm"
RPM_HASH = "c23aa7b90f452f1d07dba2721d7fd428e553f786580258c2adad373e3e21ec6543f6dcfd1408916463c08fe45a193e11fd1548e36b53c1b7382e5b1415dc0195"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest) \
python39-pytest \
python3dist(pytest)"
RDEPENDS:${PN} += "/bin/sh \
/usr/bin/python3.9 \
alts \
python(abi) \
python39-attrs \
python39-exceptiongroup \
python39-importlib-metadata \
python39-iniconfig \
python39-packaging \
python39-pluggy \
python39-setuptools \
python39-tomli"

inherit rpm
