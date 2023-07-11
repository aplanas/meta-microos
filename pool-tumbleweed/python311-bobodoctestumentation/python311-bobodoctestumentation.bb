SUMMARY = "Bobo tests and documentation"
DESCRIPTION = "The bobo documentation and tests are broken out into a separate project \
to keep the bobo distribution as small as possible. \
 \
This package provides documentation and tests for the bobo package."
LICENSE = "ZPL-2.1"

PV = "2.4.0"

RPM_NAME = "python311-bobodoctestumentation-2.4.0-3.10.noarch.rpm"
RPM_HASH = "a8095bcc4f6d31c3460edbccd1468d46a7c9f3883fcdd9181d691af2444ededfc15db1c538b3a149d55788933a6e52938193e2d5e7cbee7ce7b54dc6efd3b1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-bobodoctestumentation \
python3.11dist-bobodoctestumentation \
python311-bobodoctestumentation \
python3dist-bobodoctestumentation"

RDEPENDS:${PN} += "python-abi \
python311-WebTest \
python311-manuel \
python311-six \
python311-zope.testing"

inherit rpm
