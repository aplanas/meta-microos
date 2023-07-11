SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python310-jaraco.tidelift-1.5.1-1.3.noarch.rpm"
RPM_HASH = "ab5af4c355811207dce6f2d3f738477ef6001a6fd3f39467a0020a0febe264633c4516989b9b00761cceb878bace31a0046af6486bce6c08cbce688d6c92f5fe"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-jaraco.tidelift \
python310-jaraco.tidelift \
python3dist-jaraco.tidelift"

RDEPENDS:${PN} += "python-abi \
python310-autocommand \
python310-importlib-resources \
python310-keyring \
python310-requests-toolbelt"

inherit rpm
