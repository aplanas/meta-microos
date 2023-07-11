SUMMARY = "Translations for package translator"
DESCRIPTION = "Provides translations for the 'translator' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.1"

RPM_NAME = "translator-lang-1.4.1-1.20.noarch.rpm"
RPM_HASH = "ecf4fcc09ae97bc0eba744b41ea36ee4dfd207c6108fc7d025ff165cd0fb9c14e97062d5de375b23dbb6b06c7781d401de0228c720e327204e62f9fe5e7f2469"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-translator-af \
locale-translator-ar \
locale-translator-as \
locale-translator-ast \
locale-translator-az \
locale-translator-be \
locale-translator-bg \
locale-translator-bn \
locale-translator-br \
locale-translator-bs \
locale-translator-ca \
locale-translator-cs \
locale-translator-cy \
locale-translator-da \
locale-translator-de \
locale-translator-dz \
locale-translator-el \
locale-translator-en-AU \
locale-translator-en-CA \
locale-translator-en-GB \
locale-translator-eo \
locale-translator-es \
locale-translator-et \
locale-translator-eu \
locale-translator-fa \
locale-translator-fi \
locale-translator-fr \
locale-translator-fr-CA \
locale-translator-ga \
locale-translator-gd \
locale-translator-gl \
locale-translator-gu \
locale-translator-he \
locale-translator-hi \
locale-translator-hr \
locale-translator-hu \
locale-translator-ia \
locale-translator-id \
locale-translator-is \
locale-translator-it \
locale-translator-ja \
locale-translator-ka \
locale-translator-kk \
locale-translator-km \
locale-translator-kn \
locale-translator-ko \
locale-translator-lt \
locale-translator-lv \
locale-translator-mk \
locale-translator-ml \
locale-translator-mr \
locale-translator-ms \
locale-translator-nb \
locale-translator-ne \
locale-translator-nl \
locale-translator-nn \
locale-translator-oc \
locale-translator-or \
locale-translator-pa \
locale-translator-pl \
locale-translator-pt \
locale-translator-pt-BR \
locale-translator-ro \
locale-translator-ru \
locale-translator-si \
locale-translator-sk \
locale-translator-sl \
locale-translator-sq \
locale-translator-sr \
locale-translator-sv \
locale-translator-ta \
locale-translator-te \
locale-translator-th \
locale-translator-tr \
locale-translator-ug \
locale-translator-uk \
locale-translator-vi \
locale-translator-wa \
locale-translator-zh \
locale-translator-zh-CN \
locale-translator-zh-HK \
locale-translator-zh-TW \
translator-lang \
translator-lang-all"

RDEPENDS:${PN} += "translator"

inherit rpm
