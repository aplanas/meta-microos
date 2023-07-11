SUMMARY = "Tools to work with Tidelift"
DESCRIPTION = "jaraco.tidelift Tools for Tidelift"
LICENSE = "MIT"

PV = "1.5.1"

RPM_NAME = "python311-jaraco.tidelift-1.5.1-1.3.noarch.rpm"
RPM_HASH = "d201bbaeb46d6272e42b2b3b497dc6688d79dae17e06a8942621cdcfdf628200e36857a56caa57d741abcf8fb7ad338d41e9a4a06a848929f60f7ca52db61cba"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-jaraco.tidelift \
python3.11dist-jaraco.tidelift \
python311-jaraco.tidelift \
python3dist-jaraco.tidelift"

RDEPENDS:${PN} += "python-abi \
python311-autocommand \
python311-importlib-resources \
python311-keyring \
python311-requests-toolbelt"

inherit rpm
