SUMMARY = "Extensions to the Python Standard Library Unit Testing Framework"
DESCRIPTION = "testtools is a set of extensions to the Python standard library's unit tests \
framework. These extensions have been derived from many years of experience \
with unit tests in Python and come from many different sources. testtools \
also ports recent unittest changes all the way back to Python 2.4."
LICENSE = "MIT"

PV = "2.6.0"

RPM_NAME = "python311-testtools-2.6.0-1.3.noarch.rpm"
RPM_HASH = "f6221895b41ab6a128bd25f24aaa44b748c32e331f462499673f8b8328071784a8b80383ea24a9ec30d6bcd0082a5b751eb8611f141cb0c17feeb94be2cbc976"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-testtools \
python3.11dist-testtools \
python311-testtools \
python3dist-testtools"

RDEPENDS:${PN} += "python-abi \
python311-pbr \
python311-python-mimeparse \
python311-traceback2"

inherit rpm
