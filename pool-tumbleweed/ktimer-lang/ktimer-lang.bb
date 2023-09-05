SUMMARY = "Translations for package ktimer"
DESCRIPTION = "Provides translations for the 'ktimer' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "ktimer-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "4c3094718014bc0de0dea4b2422fbe0ef6e4d32747efef8616186919a613ef5327844ff85c0f565550489c55140c0a68ae996b0ae6cf35721085b9fdcf2f5d03"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktimer-lang \
ktimer-lang-all \
locale-ktimer-af \
locale-ktimer-ar \
locale-ktimer-be \
locale-ktimer-bg \
locale-ktimer-br \
locale-ktimer-bs \
locale-ktimer-ca \
locale-ktimer-ca@valencia \
locale-ktimer-cs \
locale-ktimer-cy \
locale-ktimer-da \
locale-ktimer-de \
locale-ktimer-el \
locale-ktimer-en-GB \
locale-ktimer-eo \
locale-ktimer-es \
locale-ktimer-et \
locale-ktimer-eu \
locale-ktimer-fa \
locale-ktimer-fi \
locale-ktimer-fr \
locale-ktimer-ga \
locale-ktimer-gl \
locale-ktimer-he \
locale-ktimer-hi \
locale-ktimer-hr \
locale-ktimer-hu \
locale-ktimer-ia \
locale-ktimer-id \
locale-ktimer-is \
locale-ktimer-it \
locale-ktimer-ja \
locale-ktimer-ka \
locale-ktimer-kk \
locale-ktimer-km \
locale-ktimer-ko \
locale-ktimer-lt \
locale-ktimer-lv \
locale-ktimer-mk \
locale-ktimer-mr \
locale-ktimer-ms \
locale-ktimer-nb \
locale-ktimer-nds \
locale-ktimer-ne \
locale-ktimer-nl \
locale-ktimer-nn \
locale-ktimer-oc \
locale-ktimer-pa \
locale-ktimer-pl \
locale-ktimer-pt \
locale-ktimer-pt-BR \
locale-ktimer-ro \
locale-ktimer-ru \
locale-ktimer-sk \
locale-ktimer-sl \
locale-ktimer-sq \
locale-ktimer-sr \
locale-ktimer-sr@ijekavian \
locale-ktimer-sr@ijekavianlatin \
locale-ktimer-sr@latin \
locale-ktimer-sv \
locale-ktimer-ta \
locale-ktimer-th \
locale-ktimer-tr \
locale-ktimer-ug \
locale-ktimer-uk \
locale-ktimer-vi \
locale-ktimer-zh-CN \
locale-ktimer-zh-TW"

RDEPENDS:${PN} += "ktimer"

inherit rpm
