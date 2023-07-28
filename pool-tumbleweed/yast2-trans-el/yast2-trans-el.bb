SUMMARY = "YaST2 - Greek Translations"
DESCRIPTION = "YaST2 - Translations for Greek."
LICENSE = "GPL-2.0-or-later"

PV = "84.87.20230714.966688ddd0"

RPM_NAME = "yast2-trans-el-84.87.20230714.966688ddd0-1.1.noarch.rpm"
RPM_HASH = "1c495369b102145e8d369861b3af63cb80e3431f52e4d51c428f4acb37e072edfe13a956110f75d4ffbb64fb48a519e8d1097710c4cdba4569deb430fe704943"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-yast2-el \
yast2-trans-el"

RDEPENDS:${PN} += ""

inherit rpm
