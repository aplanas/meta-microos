SUMMARY = "Icinga L10n"
DESCRIPTION = "L10n (short for Localization) provides all translations available for Icinga."
LICENSE = "GPL-2.0-or-later"

PV = "1.2.0"

RPM_NAME = "icinga-l10n-1.2.0-1.2.noarch.rpm"
RPM_HASH = "8137af44aa9d5425bacfae0ae70999c8c031925cabdae19807a434cd0fa19dd0c115a583b95ebeaea8ffcc13072dbcfbd70fea8544a7c4966bb7ad97304f54bc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "icinga-l10n"
RDEPENDS:${PN} += ""

inherit rpm
