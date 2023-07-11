SUMMARY = "Translations for package okteta-part"
DESCRIPTION = "Provides translations for the 'okteta-part' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.11"

RPM_NAME = "okteta-part-lang-0.26.11-1.1.noarch.rpm"
RPM_HASH = "d8a721766c706c4aca259be1ab975674454b90e898b6b7435c76084094567451279ca614e6c81f083267e9cda278c4d3cf85bd403bc796276f6dbf03d6152abd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-okteta-part-ar \
locale-okteta-part-ast \
locale-okteta-part-be \
locale-okteta-part-bg \
locale-okteta-part-br \
locale-okteta-part-bs \
locale-okteta-part-ca \
locale-okteta-part-ca@valencia \
locale-okteta-part-cs \
locale-okteta-part-cy \
locale-okteta-part-da \
locale-okteta-part-de \
locale-okteta-part-el \
locale-okteta-part-en-GB \
locale-okteta-part-eo \
locale-okteta-part-es \
locale-okteta-part-et \
locale-okteta-part-eu \
locale-okteta-part-fa \
locale-okteta-part-fi \
locale-okteta-part-fr \
locale-okteta-part-ga \
locale-okteta-part-gl \
locale-okteta-part-hi \
locale-okteta-part-hr \
locale-okteta-part-hu \
locale-okteta-part-ia \
locale-okteta-part-id \
locale-okteta-part-is \
locale-okteta-part-it \
locale-okteta-part-ja \
locale-okteta-part-ka \
locale-okteta-part-kk \
locale-okteta-part-km \
locale-okteta-part-ko \
locale-okteta-part-lt \
locale-okteta-part-lv \
locale-okteta-part-mk \
locale-okteta-part-mr \
locale-okteta-part-ms \
locale-okteta-part-nb \
locale-okteta-part-nds \
locale-okteta-part-ne \
locale-okteta-part-nl \
locale-okteta-part-nn \
locale-okteta-part-oc \
locale-okteta-part-pa \
locale-okteta-part-pl \
locale-okteta-part-pt \
locale-okteta-part-pt-BR \
locale-okteta-part-ro \
locale-okteta-part-ru \
locale-okteta-part-sk \
locale-okteta-part-sl \
locale-okteta-part-sq \
locale-okteta-part-sr \
locale-okteta-part-sr@ijekavian \
locale-okteta-part-sr@ijekavianlatin \
locale-okteta-part-sr@latin \
locale-okteta-part-sv \
locale-okteta-part-ta \
locale-okteta-part-th \
locale-okteta-part-tr \
locale-okteta-part-ug \
locale-okteta-part-uk \
locale-okteta-part-zh-CN \
locale-okteta-part-zh-TW \
okteta-part-lang \
okteta-part-lang-all"

RDEPENDS:${PN} += "okteta-part"

inherit rpm
