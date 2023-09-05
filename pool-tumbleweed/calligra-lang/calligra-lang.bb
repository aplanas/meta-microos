SUMMARY = "Translations for the Calligra Suite Applications"
DESCRIPTION = "This package contains application translations for the Calligra Suite"
LICENSE = "LGPL-2.1-or-later"

PV = "3.2.1"

RPM_NAME = "calligra-lang-3.2.1-7.22.aarch64.rpm"
RPM_HASH = "4d858dbfabe4b8ef57095ee80ae83e58279c3ab27130839a82b149f5c3a32ac84245d56a690d99cab0886ff9fa518d6f1b7ef2452e7fc53680fc89a3ec180d41"

RPROVIDES:${PN} += "calligra-l10n-bs \
calligra-l10n-ca \
calligra-l10n-caValencia \
calligra-l10n-cs \
calligra-l10n-da \
calligra-l10n-de \
calligra-l10n-el \
calligra-l10n-en-GB \
calligra-l10n-es \
calligra-l10n-et \
calligra-l10n-fi \
calligra-l10n-fr \
calligra-l10n-gl \
calligra-l10n-hu \
calligra-l10n-it \
calligra-l10n-ja \
calligra-l10n-kk \
calligra-l10n-nb \
calligra-l10n-nl \
calligra-l10n-pl \
calligra-l10n-pt \
calligra-l10n-pt-BR \
calligra-l10n-ru \
calligra-l10n-sk \
calligra-l10n-sv \
calligra-l10n-tr \
calligra-l10n-uk \
calligra-l10n-zh-CN \
calligra-l10n-zh-TW \
calligra-lang \
locale-calligra-af \
locale-calligra-ar \
locale-calligra-ast \
locale-calligra-be \
locale-calligra-bg \
locale-calligra-br \
locale-calligra-bs \
locale-calligra-ca \
locale-calligra-ca@valencia \
locale-calligra-cs \
locale-calligra-cy \
locale-calligra-da \
locale-calligra-de \
locale-calligra-el \
locale-calligra-en-GB \
locale-calligra-eo \
locale-calligra-es \
locale-calligra-et \
locale-calligra-eu \
locale-calligra-fa \
locale-calligra-fi \
locale-calligra-fr \
locale-calligra-ga \
locale-calligra-gl \
locale-calligra-he \
locale-calligra-hi \
locale-calligra-hr \
locale-calligra-hu \
locale-calligra-ia \
locale-calligra-id \
locale-calligra-is \
locale-calligra-it \
locale-calligra-ja \
locale-calligra-kk \
locale-calligra-km \
locale-calligra-ko \
locale-calligra-lt \
locale-calligra-lv \
locale-calligra-mai \
locale-calligra-mk \
locale-calligra-ml \
locale-calligra-mr \
locale-calligra-ms \
locale-calligra-nb \
locale-calligra-nds \
locale-calligra-ne \
locale-calligra-nl \
locale-calligra-nn \
locale-calligra-oc \
locale-calligra-pa \
locale-calligra-pl \
locale-calligra-pt \
locale-calligra-pt-BR \
locale-calligra-ro \
locale-calligra-ru \
locale-calligra-sk \
locale-calligra-sl \
locale-calligra-sq \
locale-calligra-sv \
locale-calligra-ta \
locale-calligra-th \
locale-calligra-tr \
locale-calligra-ug \
locale-calligra-uk \
locale-calligra-vi \
locale-calligra-wa \
locale-calligra-zh-CN \
locale-calligra-zh-TW"

RDEPENDS:${PN} += "calligra"

inherit rpm
