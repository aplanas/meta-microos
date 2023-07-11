SUMMARY = "Tools to work with classes"
DESCRIPTION = "jaraco.classes Tools for working with classes."
LICENSE = "MIT"

PV = "3.2.3"

RPM_NAME = "python310-jaraco.classes-3.2.3-2.3.noarch.rpm"
RPM_HASH = "b53f9fb02334007b936a120fdde24d36919b2bbab0dcf372f36d6e92cae3c89e06376c5e4d2bcb777a3fe234f4f5915835d837c2b22fdfa2bb5ec55f7ddb1422"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.classes \
python310-jaraco.classes \
python3dist-jaraco.classes"

RDEPENDS:${PN} += "python-abi \
python310-more-itertools"

inherit rpm
