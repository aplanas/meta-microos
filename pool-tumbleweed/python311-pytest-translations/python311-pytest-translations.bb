SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python311-pytest-translations-4.0.1-1.1.noarch.rpm"
RPM_HASH = "2fa4318f9525c61a800afd5c20e6b9e4e1e7b75c1bd0e549e1e45c4ba3f44806f08379bebdac2ba90a4ed42c13259c77524e7fd2bd8a04e6c065f800b8cd629d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.11dist-pytest-translations \
python311-pytest-translations \
python3dist-pytest-translations"

RDEPENDS:${PN} += "python-abi \
python311-polib \
python311-pyenchant"

inherit rpm
