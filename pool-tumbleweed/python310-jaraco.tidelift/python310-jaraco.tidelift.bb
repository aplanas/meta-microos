SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-jaraco.tidelift-1.5.1-1.1.noarch.rpm"
RPM_HASH = "13d57a1f21f9a54557a96f2fe896fcb4adf7ae3e6cab01da7601947b7a46bd1733dac33ad805bfe3f4ef260ff9e51bbcbbbaa4f2e9ad0dc6a733c49e77d14ced"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.tidelift \
python3.10dist(jaraco.tidelift) \
python310-jaraco.tidelift \
python3dist(jaraco.tidelift)"

RDEPENDS:${PN} += "python(abi) \
python310-autocommand \
python310-importlib-resources \
python310-keyring \
python310-requests-toolbelt"

inherit rpm
