SUMMARY = "Translations for package okular"
DESCRIPTION = "Provides translations for the 'okular' package."
LICENSE = "GPL-2.0-or-later & GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "okular-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "09cef5eb3c858850f554e337460409ef5ccc624bb893d9f0a69c4f283b37d78d9f42fcd06c679f57ce12d08640ff2de511251066eb35736bea39799ef67394ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-okular-ar \
locale-okular-az \
locale-okular-be \
locale-okular-bg \
locale-okular-br \
locale-okular-bs \
locale-okular-ca \
locale-okular-ca@valencia \
locale-okular-cs \
locale-okular-cy \
locale-okular-da \
locale-okular-de \
locale-okular-el \
locale-okular-en-GB \
locale-okular-eo \
locale-okular-es \
locale-okular-et \
locale-okular-eu \
locale-okular-fa \
locale-okular-fi \
locale-okular-fr \
locale-okular-ga \
locale-okular-gl \
locale-okular-he \
locale-okular-hi \
locale-okular-hr \
locale-okular-hu \
locale-okular-ia \
locale-okular-id \
locale-okular-is \
locale-okular-it \
locale-okular-ja \
locale-okular-ka \
locale-okular-kk \
locale-okular-km \
locale-okular-ko \
locale-okular-lt \
locale-okular-lv \
locale-okular-mk \
locale-okular-ml \
locale-okular-mr \
locale-okular-ms \
locale-okular-nb \
locale-okular-nds \
locale-okular-ne \
locale-okular-nl \
locale-okular-nn \
locale-okular-oc \
locale-okular-pa \
locale-okular-pl \
locale-okular-pt \
locale-okular-pt-BR \
locale-okular-ro \
locale-okular-ru \
locale-okular-si \
locale-okular-sk \
locale-okular-sl \
locale-okular-sq \
locale-okular-sr \
locale-okular-sr@ijekavian \
locale-okular-sr@ijekavianlatin \
locale-okular-sr@latin \
locale-okular-sv \
locale-okular-ta \
locale-okular-th \
locale-okular-tr \
locale-okular-ug \
locale-okular-uk \
locale-okular-vi \
locale-okular-wa \
locale-okular-zh-CN \
locale-okular-zh-HK \
locale-okular-zh-TW \
okular-lang \
okular-lang-all"

RDEPENDS:${PN} += "okular"

inherit rpm
