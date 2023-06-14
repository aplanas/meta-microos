SUMMARY = "Zope Exceptions"
DESCRIPTION = "This package contains exception interfaces and implementations which are so \
general purpose that they don't belong in Zope application-specific packages."
LICENSE = "ZPL-2.1"

PV = "4.6"

RPM_NAME = "python39-zope.exceptions-4.6-1.3.noarch.rpm"
RPM_HASH = "ab2f893608dac39ae02e9fd9cda84822dc4955a140fdeabd382959818fcc731cf43a8dfee2ff12fdec15580792f7011366ba5acc5900dea92d58d29773c496ba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-zope.exceptions \
python39-zope.exceptions \
python3dist-zope.exceptions"

RDEPENDS:${PN} += "python-abi \
python39-zope.interface"

inherit rpm
