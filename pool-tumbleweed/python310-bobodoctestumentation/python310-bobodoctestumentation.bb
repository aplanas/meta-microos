SUMMARY = "Bobo tests and documentation"
DESCRIPTION = "The bobo documentation and tests are broken out into a separate project \
to keep the bobo distribution as small as possible. \
 \
This package provides documentation and tests for the bobo package."
LICENSE = "ZPL-2.1"

PV = "2.4.0"

RPM_NAME = "python310-bobodoctestumentation-2.4.0-3.10.noarch.rpm"
RPM_HASH = "5553afb7e44e8ba70e9d84a8bf1c616fff0c13cefe32678bb7cd7e06a1a4a7854a8533e7ad00992de58534b999471faa7e3e767bf95a47258f4b61b81bedd587"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-bobodoctestumentation \
python310-bobodoctestumentation \
python3dist-bobodoctestumentation"

RDEPENDS:${PN} += "python-abi \
python310-WebTest \
python310-manuel \
python310-six \
python310-zope.testing"

inherit rpm
