SUMMARY = "Bobo tests and documentation"
DESCRIPTION = "The bobo documentation and tests are broken out into a separate project \
to keep the bobo distribution as small as possible. \
 \
This package provides documentation and tests for the bobo package."
LICENSE = "ZPL-2.1"

PV = "2.4.0"

RPM_NAME = "python39-bobodoctestumentation-2.4.0-3.10.noarch.rpm"
RPM_HASH = "4ca566713582856f65d2bdbc48b4047e5045b58f74984a920d36fb585f6c8a1c54fac362c631dc312e23b2e700514baf4df0dd70d6246cb9963b8fa5e1a90961"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-bobodoctestumentation \
python39-bobodoctestumentation \
python3dist-bobodoctestumentation"

RDEPENDS:${PN} += "python-abi \
python39-WebTest \
python39-manuel \
python39-six \
python39-zope.testing"

inherit rpm
