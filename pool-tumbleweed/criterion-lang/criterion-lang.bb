SUMMARY = "Translations for package criterion"
DESCRIPTION = "Provides translations for the 'criterion' package."
LICENSE = "MIT"

PV = "2.4.2"

RPM_NAME = "criterion-lang-2.4.2-1.1.noarch.rpm"
RPM_HASH = "00e7b473f73078803dfe77be69897818de1bc4a402f5a910ed8a2a9f92b9653bbe91642b871bd2feeac826ae05b720fd67cebd16c73b121d09cb190767b03092"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "criterion-lang \
criterion-lang-all \
locale-criterion-de \
locale-criterion-fr"

RDEPENDS:${PN} += "criterion"

inherit rpm
