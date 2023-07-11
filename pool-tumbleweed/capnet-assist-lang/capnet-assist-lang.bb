SUMMARY = "Translations for package capnet-assist"
DESCRIPTION = "Provides translations for the 'capnet-assist' package."
LICENSE = "GPL-3.0-only"

PV = "2.4.2"

RPM_NAME = "capnet-assist-lang-2.4.2-1.5.noarch.rpm"
RPM_HASH = "1ca72c8530a138357ff42ff3a8664d1d38a99c0d44d23b7e39cf25fa057220a5980173873ec63c2b8adac6efcc1c35a8b87ffcb9701c011d33259e141df5cc5b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "capnet-assist-lang \
capnet-assist-lang-all \
locale-capnet-assist-af \
locale-capnet-assist-ar \
locale-capnet-assist-as \
locale-capnet-assist-ast \
locale-capnet-assist-az \
locale-capnet-assist-be \
locale-capnet-assist-bg \
locale-capnet-assist-bn \
locale-capnet-assist-br \
locale-capnet-assist-bs \
locale-capnet-assist-ca \
locale-capnet-assist-cs \
locale-capnet-assist-cy \
locale-capnet-assist-da \
locale-capnet-assist-de \
locale-capnet-assist-dz \
locale-capnet-assist-el \
locale-capnet-assist-en-AU \
locale-capnet-assist-en-CA \
locale-capnet-assist-en-GB \
locale-capnet-assist-eo \
locale-capnet-assist-es \
locale-capnet-assist-et \
locale-capnet-assist-eu \
locale-capnet-assist-fa \
locale-capnet-assist-fi \
locale-capnet-assist-fr \
locale-capnet-assist-fr-CA \
locale-capnet-assist-ga \
locale-capnet-assist-gd \
locale-capnet-assist-gl \
locale-capnet-assist-gu \
locale-capnet-assist-he \
locale-capnet-assist-hi \
locale-capnet-assist-hr \
locale-capnet-assist-hu \
locale-capnet-assist-ia \
locale-capnet-assist-id \
locale-capnet-assist-is \
locale-capnet-assist-it \
locale-capnet-assist-ja \
locale-capnet-assist-ka \
locale-capnet-assist-kk \
locale-capnet-assist-km \
locale-capnet-assist-kn \
locale-capnet-assist-ko \
locale-capnet-assist-lt \
locale-capnet-assist-lv \
locale-capnet-assist-mk \
locale-capnet-assist-ml \
locale-capnet-assist-mr \
locale-capnet-assist-ms \
locale-capnet-assist-nb \
locale-capnet-assist-ne \
locale-capnet-assist-nl \
locale-capnet-assist-nn \
locale-capnet-assist-oc \
locale-capnet-assist-or \
locale-capnet-assist-pa \
locale-capnet-assist-pl \
locale-capnet-assist-pt \
locale-capnet-assist-pt-BR \
locale-capnet-assist-ro \
locale-capnet-assist-ru \
locale-capnet-assist-si \
locale-capnet-assist-sk \
locale-capnet-assist-sl \
locale-capnet-assist-sq \
locale-capnet-assist-sr \
locale-capnet-assist-sr@latin \
locale-capnet-assist-sv \
locale-capnet-assist-ta \
locale-capnet-assist-te \
locale-capnet-assist-th \
locale-capnet-assist-tr \
locale-capnet-assist-ug \
locale-capnet-assist-uk \
locale-capnet-assist-vi \
locale-capnet-assist-wa \
locale-capnet-assist-zh \
locale-capnet-assist-zh-CN \
locale-capnet-assist-zh-HK \
locale-capnet-assist-zh-TW"

RDEPENDS:${PN} += "capnet-assist"

inherit rpm
