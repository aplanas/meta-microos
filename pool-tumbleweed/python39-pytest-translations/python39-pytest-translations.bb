SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python39-pytest-translations-4.0.1-1.3.noarch.rpm"
RPM_HASH = "05614de4149266bbc349454bb08e6a2c1c4255af4ea0eec4200aa8c3f8e43ef952f5001fc02621f48d269c55776a8da3b6d6f6946c9477cd9b909a874d41c057"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist-pytest-translations \
python39-pytest-translations \
python3dist-pytest-translations"

RDEPENDS:${PN} += "python-abi \
python39-polib \
python39-pyenchant"

inherit rpm
