SUMMARY = "Tools to work with classes"
DESCRIPTION = "jaraco.classes Tools for working with classes."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python311-jaraco.classes-3.2.3-2.1.noarch.rpm"
RPM_HASH = "329e911682f2f105582c525776f53274bc0920ce930dde24cc4b37dcf4ef8a7d70ea4c980198e80f2516c780f42edd9e7c1c93067bf6622b3843305bca1d3810"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist(jaraco.classes) \
python311-jaraco.classes \
python3dist(jaraco.classes)"
RDEPENDS:${PN} += "python(abi) \
python311-more-itertools"

inherit rpm
