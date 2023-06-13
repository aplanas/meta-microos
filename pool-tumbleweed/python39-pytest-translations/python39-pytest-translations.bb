SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python39-pytest-translations-4.0.1-1.1.noarch.rpm"
RPM_HASH = "1fa0e35f729ea75447dcda24e27af005e448f402514588a58edb800bb1925cafbcee428332d977ba79002f684ee9cde2d6c6eb469a6939b6c10ce28fc02e3643"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.9dist(pytest-translations) \
python39-pytest-translations \
python3dist(pytest-translations)"

RDEPENDS:${PN} += "python(abi) \
python39-polib \
python39-pyenchant"

inherit rpm
