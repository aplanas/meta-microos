SUMMARY = "Translations for package duplicity"
DESCRIPTION = "Provides translations for the 'duplicity' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "duplicity-lang-1.2.2-1.2.noarch.rpm"
RPM_HASH = "c146721703109c8c1ea75334d18303dae97b4e75da855a77cfb327fecdeff71fcb7443077e69470a7e4d376df2bee5b438320445d16e0b5e8248de6c654c866e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "duplicity-lang \
duplicity-lang-all \
locale(duplicity:cs_CZ) \
locale(duplicity:de_AT) \
locale(duplicity:de_DE) \
locale(duplicity:el_GR) \
locale(duplicity:en_AU) \
locale(duplicity:en_GB) \
locale(duplicity:en_US) \
locale(duplicity:es_ES) \
locale(duplicity:es_MX) \
locale(duplicity:es_PR) \
locale(duplicity:fi_FI) \
locale(duplicity:fr_FR) \
locale(duplicity:it_IT) \
locale(duplicity:nl_BE) \
locale(duplicity:pl_PL) \
locale(duplicity:pt_BR) \
locale(duplicity:pt_PT) \
locale(duplicity:ru_RU) \
locale(duplicity:tr_TR) \
locale(duplicity:uk_UA) \
locale(duplicity:zh_CN) \
locale(duplicity:zh_HK) \
locale(duplicity:zh_TW)"
RDEPENDS:${PN} += "duplicity"

inherit rpm
