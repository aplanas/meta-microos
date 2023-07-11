SUMMARY = "Translations for package lightdm-slick-greeter"
DESCRIPTION = "Provides translations for the 'lightdm-slick-greeter' package."
LICENSE = "CC-BY-SA-3.0 & GPL-3.0-only"

PV = "1.6.1"

RPM_NAME = "lightdm-slick-greeter-lang-1.6.1-1.4.noarch.rpm"
RPM_HASH = "43ce41b251c526c2ec3265119065684d47a79a100837423757ad9ca7028b403dc47162eb71d3155184103ffecf95d7907a708e2368160d7e76e67a914d7a8850"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "lightdm-slick-greeter-lang \
lightdm-slick-greeter-lang-all \
locale-lightdm-slick-greeter-af \
locale-lightdm-slick-greeter-ar \
locale-lightdm-slick-greeter-ast \
locale-lightdm-slick-greeter-az \
locale-lightdm-slick-greeter-be \
locale-lightdm-slick-greeter-bg \
locale-lightdm-slick-greeter-bn \
locale-lightdm-slick-greeter-br \
locale-lightdm-slick-greeter-bs \
locale-lightdm-slick-greeter-ca \
locale-lightdm-slick-greeter-ca@valencia \
locale-lightdm-slick-greeter-cs \
locale-lightdm-slick-greeter-cy \
locale-lightdm-slick-greeter-da \
locale-lightdm-slick-greeter-de \
locale-lightdm-slick-greeter-el \
locale-lightdm-slick-greeter-en-AU \
locale-lightdm-slick-greeter-en-CA \
locale-lightdm-slick-greeter-en-GB \
locale-lightdm-slick-greeter-eo \
locale-lightdm-slick-greeter-es \
locale-lightdm-slick-greeter-et \
locale-lightdm-slick-greeter-eu \
locale-lightdm-slick-greeter-fa \
locale-lightdm-slick-greeter-fi \
locale-lightdm-slick-greeter-fr \
locale-lightdm-slick-greeter-fr-CA \
locale-lightdm-slick-greeter-ga \
locale-lightdm-slick-greeter-gd \
locale-lightdm-slick-greeter-gl \
locale-lightdm-slick-greeter-gu \
locale-lightdm-slick-greeter-he \
locale-lightdm-slick-greeter-hi \
locale-lightdm-slick-greeter-hr \
locale-lightdm-slick-greeter-hu \
locale-lightdm-slick-greeter-ia \
locale-lightdm-slick-greeter-id \
locale-lightdm-slick-greeter-is \
locale-lightdm-slick-greeter-it \
locale-lightdm-slick-greeter-ja \
locale-lightdm-slick-greeter-ka \
locale-lightdm-slick-greeter-kk \
locale-lightdm-slick-greeter-km \
locale-lightdm-slick-greeter-kn \
locale-lightdm-slick-greeter-ko \
locale-lightdm-slick-greeter-lt \
locale-lightdm-slick-greeter-lv \
locale-lightdm-slick-greeter-ml \
locale-lightdm-slick-greeter-mr \
locale-lightdm-slick-greeter-ms \
locale-lightdm-slick-greeter-nb \
locale-lightdm-slick-greeter-ne \
locale-lightdm-slick-greeter-nl \
locale-lightdm-slick-greeter-nn \
locale-lightdm-slick-greeter-oc \
locale-lightdm-slick-greeter-pa \
locale-lightdm-slick-greeter-pl \
locale-lightdm-slick-greeter-pt \
locale-lightdm-slick-greeter-pt-BR \
locale-lightdm-slick-greeter-ro \
locale-lightdm-slick-greeter-ru \
locale-lightdm-slick-greeter-si \
locale-lightdm-slick-greeter-sk \
locale-lightdm-slick-greeter-sl \
locale-lightdm-slick-greeter-sq \
locale-lightdm-slick-greeter-sr \
locale-lightdm-slick-greeter-sr@latin \
locale-lightdm-slick-greeter-sv \
locale-lightdm-slick-greeter-ta \
locale-lightdm-slick-greeter-te \
locale-lightdm-slick-greeter-th \
locale-lightdm-slick-greeter-tr \
locale-lightdm-slick-greeter-ug \
locale-lightdm-slick-greeter-uk \
locale-lightdm-slick-greeter-vi \
locale-lightdm-slick-greeter-zh-CN \
locale-lightdm-slick-greeter-zh-HK \
locale-lightdm-slick-greeter-zh-TW"

RDEPENDS:${PN} += "lightdm-slick-greeter"

inherit rpm
