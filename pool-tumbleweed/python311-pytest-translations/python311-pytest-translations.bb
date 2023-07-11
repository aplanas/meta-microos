SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python311-pytest-translations-4.0.1-1.3.noarch.rpm"
RPM_HASH = "772da1ccb445d2dff384c9f54985f61872b1629663caecea20a4ad47feb686d859ee43e8b282e0a229368cd2954b89f97188d9df76670dbee0c89325e9d8b799"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3-pytest-translations \
python3.11dist-pytest-translations \
python311-pytest-translations \
python3dist-pytest-translations"

RDEPENDS:${PN} += "python-abi \
python311-polib \
python311-pyenchant"

inherit rpm
