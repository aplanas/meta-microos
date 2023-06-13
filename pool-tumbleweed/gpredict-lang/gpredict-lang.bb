SUMMARY = "Translations for package gpredict"
DESCRIPTION = "Provides translations for the 'gpredict' package."
LICENSE = "GPL-2.0-only"

PV = "2.2.1"

RPM_NAME = "gpredict-lang-2.2.1-2.15.noarch.rpm"
RPM_HASH = "8512ebd781b47e3b37616af5f2525dc153a291342443ecd1b07d086731c7951886feee380a68965cb4fddc76316fb35842b34dd681f94fbe5d01a8563243528a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gpredict-lang \
gpredict-lang-all \
locale(gpredict:cs) \
locale(gpredict:da) \
locale(gpredict:de) \
locale(gpredict:el) \
locale(gpredict:en_GB) \
locale(gpredict:en_US) \
locale(gpredict:es) \
locale(gpredict:fi) \
locale(gpredict:fr) \
locale(gpredict:id) \
locale(gpredict:it) \
locale(gpredict:lt) \
locale(gpredict:ru) \
locale(gpredict:th) \
locale(gpredict:uk)"

RDEPENDS:${PN} += "gpredict"

inherit rpm
