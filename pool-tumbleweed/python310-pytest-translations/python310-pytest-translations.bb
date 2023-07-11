SUMMARY = "Plugin for testing gettext, .po and .mo files"
DESCRIPTION = "pytest-translations is a py.test plugin to check gettext, .po and .mo files. \
Test check for: \
-  Spelling (using enchant & aspell) \
-  Consistency of mo files \
-  Obsolete translations \
-  Fuzzy translations"
LICENSE = "Apache-2.0"

PV = "4.0.1"

RPM_NAME = "python310-pytest-translations-4.0.1-1.3.noarch.rpm"
RPM_HASH = "c78b3ffe2cee8a697ccb0128ebddb5aef982a75247b7761ffd9ad1e211d77f2c1b9884c37db85ad807ee40e1c7442c9691093c0aeb025cfd16bbe7aa2bb44081"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "python3.10dist-pytest-translations \
python310-pytest-translations \
python3dist-pytest-translations"

RDEPENDS:${PN} += "python-abi \
python310-polib \
python310-pyenchant"

inherit rpm
