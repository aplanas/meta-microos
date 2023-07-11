SUMMARY = "Tools to work with classes"
DESCRIPTION = "jaraco.classes Tools for working with classes."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python311-jaraco.classes-3.2.3-2.3.noarch.rpm"
RPM_HASH = "2cb5de044600a716d72677bcca1bd0e3a1bf186ca0bd1dd38bc02653d97f6f9bedf17b58cd03ab4753e78ca90e2416a5dcc27e6e4384a4d68af246da11e2a352"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.classes \
python3.11dist-jaraco.classes \
python311-jaraco.classes \
python3dist-jaraco.classes"

RDEPENDS:${PN} += "python-abi \
python311-more-itertools"

inherit rpm
