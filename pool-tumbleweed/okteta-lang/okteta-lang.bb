SUMMARY = "Translations for package okteta"
DESCRIPTION = "Provides translations for the 'okteta' package."
LICENSE = "GFDL-1.2-only & GPL-2.0-only"

PV = "0.26.12"

RPM_NAME = "okteta-lang-0.26.12-1.1.noarch.rpm"
RPM_HASH = "85c789e6b766fd625d1a0103e423b031d94f05cb13a6059b5e61892253c1e495b78cdc72bac68de74245061f7ecb68cf5a99edcdfac25a647560ca962e378360"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-okteta-ar \
locale-okteta-ast \
locale-okteta-be \
locale-okteta-bg \
locale-okteta-bs \
locale-okteta-ca \
locale-okteta-ca@valencia \
locale-okteta-cs \
locale-okteta-da \
locale-okteta-de \
locale-okteta-el \
locale-okteta-en-GB \
locale-okteta-eo \
locale-okteta-es \
locale-okteta-et \
locale-okteta-eu \
locale-okteta-fi \
locale-okteta-fr \
locale-okteta-ga \
locale-okteta-gl \
locale-okteta-hr \
locale-okteta-hu \
locale-okteta-ia \
locale-okteta-id \
locale-okteta-is \
locale-okteta-it \
locale-okteta-ja \
locale-okteta-ka \
locale-okteta-kk \
locale-okteta-km \
locale-okteta-ko \
locale-okteta-lt \
locale-okteta-lv \
locale-okteta-mr \
locale-okteta-nb \
locale-okteta-nds \
locale-okteta-nl \
locale-okteta-nn \
locale-okteta-oc \
locale-okteta-pa \
locale-okteta-pl \
locale-okteta-pt \
locale-okteta-pt-BR \
locale-okteta-ro \
locale-okteta-ru \
locale-okteta-sk \
locale-okteta-sl \
locale-okteta-sq \
locale-okteta-sr \
locale-okteta-sr@ijekavian \
locale-okteta-sr@ijekavianlatin \
locale-okteta-sr@latin \
locale-okteta-sv \
locale-okteta-tr \
locale-okteta-ug \
locale-okteta-uk \
locale-okteta-zh-CN \
locale-okteta-zh-TW \
okteta-lang \
okteta-lang-all"

RDEPENDS:${PN} += "okteta"

inherit rpm
