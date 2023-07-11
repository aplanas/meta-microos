SUMMARY = "Translations for package terminology"
DESCRIPTION = "Provides translations for the 'terminology' package."
LICENSE = "BSD-2-Clause & OFL-1.1"

PV = "1.13.0"

RPM_NAME = "terminology-lang-1.13.0-1.3.noarch.rpm"
RPM_HASH = "3988e270668af51d7de4ab3a87e057fee3b5fb6c37f16cc90f4b04fb5651afe1d816ac66744df7685346768b3010c18b533673c2b9731cd9be6827ef4179f7df"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-terminology-ca \
locale-terminology-da \
locale-terminology-de \
locale-terminology-el \
locale-terminology-eo \
locale-terminology-es \
locale-terminology-fi \
locale-terminology-fr \
locale-terminology-he \
locale-terminology-hi \
locale-terminology-hr \
locale-terminology-id \
locale-terminology-it \
locale-terminology-ja \
locale-terminology-ko \
locale-terminology-ms \
locale-terminology-nb-NO \
locale-terminology-nl \
locale-terminology-pl \
locale-terminology-pt \
locale-terminology-pt-BR \
locale-terminology-ru \
locale-terminology-si \
locale-terminology-sl \
locale-terminology-sr \
locale-terminology-sv \
locale-terminology-tr \
locale-terminology-uk \
locale-terminology-vi \
locale-terminology-zh-Hans \
terminology-lang \
terminology-lang-all"

RDEPENDS:${PN} += "terminology"

inherit rpm
