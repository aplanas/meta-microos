SUMMARY = "Translations for package duplicity"
DESCRIPTION = "Provides translations for the 'duplicity' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.2.2"

RPM_NAME = "duplicity-lang-1.2.2-1.3.noarch.rpm"
RPM_HASH = "c3b9a46c9b755bfc98a668f17855091087048d8a621ba085bd12b55202d47fe428809051b6f49623f85b46b4a9f960899eed5fc3b4f141537d232fc326f98113"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "duplicity-lang \
duplicity-lang-all \
locale-duplicity-cs-CZ \
locale-duplicity-de-AT \
locale-duplicity-de-DE \
locale-duplicity-el-GR \
locale-duplicity-en-AU \
locale-duplicity-en-GB \
locale-duplicity-en-US \
locale-duplicity-es-ES \
locale-duplicity-es-MX \
locale-duplicity-es-PR \
locale-duplicity-fi-FI \
locale-duplicity-fr-FR \
locale-duplicity-it-IT \
locale-duplicity-nl-BE \
locale-duplicity-pl-PL \
locale-duplicity-pt-BR \
locale-duplicity-pt-PT \
locale-duplicity-ru-RU \
locale-duplicity-tr-TR \
locale-duplicity-uk-UA \
locale-duplicity-zh-CN \
locale-duplicity-zh-HK \
locale-duplicity-zh-TW"

RDEPENDS:${PN} += "duplicity"

inherit rpm
