SUMMARY = "Python client library for Core API"
DESCRIPTION = "Python client library for Core API, a format-independent Document Object Model \
for representing Web APIs."
LICENSE = "BSD-2-Clause"

PV = "2.3.3"

RPM_NAME = "python39-coreapi-2.3.3-2.1.noarch.rpm"
RPM_HASH = "da073f95a5e688dc47e60cfd249ea57e4c30bc6215707c01bc84cb0c135ce858f179f281627aa77d6abd295ff190b9688faafbcfd0d6254e4e4ee0ae9551bea6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-coreapi \
python39-coreapi \
python3dist-coreapi"

RDEPENDS:${PN} += "python-abi \
python39-coreschema \
python39-itypes \
python39-requests \
python39-uritemplate"

inherit rpm
