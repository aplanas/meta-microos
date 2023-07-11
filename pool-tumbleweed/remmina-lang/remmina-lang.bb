SUMMARY = "Translations for package remmina"
DESCRIPTION = "Provides translations for the 'remmina' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.31"

RPM_NAME = "remmina-lang-1.4.31-1.1.noarch.rpm"
RPM_HASH = "42093cb70d3575152adbf0a31377a7b33820727762506b8bc40248f22919cbce5f6c96db0da8b70fbec566503c19f9bf2dd05051d395d0adc8490a964b40aadc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-remmina-ar \
locale-remmina-ast \
locale-remmina-bg \
locale-remmina-bn \
locale-remmina-br \
locale-remmina-bs \
locale-remmina-ca \
locale-remmina-ca@valencia \
locale-remmina-cs \
locale-remmina-da \
locale-remmina-de \
locale-remmina-el \
locale-remmina-en-AU \
locale-remmina-en-GB \
locale-remmina-en-US \
locale-remmina-eo \
locale-remmina-es \
locale-remmina-es-VE \
locale-remmina-et \
locale-remmina-eu \
locale-remmina-fa \
locale-remmina-fi \
locale-remmina-fr \
locale-remmina-gl \
locale-remmina-he \
locale-remmina-hi \
locale-remmina-hr \
locale-remmina-hu \
locale-remmina-id \
locale-remmina-it \
locale-remmina-ja \
locale-remmina-ka \
locale-remmina-kk \
locale-remmina-km \
locale-remmina-kn \
locale-remmina-ko \
locale-remmina-lt \
locale-remmina-lv \
locale-remmina-mk \
locale-remmina-mr \
locale-remmina-ms \
locale-remmina-nb \
locale-remmina-nl \
locale-remmina-oc \
locale-remmina-pl \
locale-remmina-pt \
locale-remmina-pt-BR \
locale-remmina-pt-PT \
locale-remmina-ro \
locale-remmina-ru \
locale-remmina-si \
locale-remmina-sk \
locale-remmina-sl \
locale-remmina-sq \
locale-remmina-sr \
locale-remmina-sv \
locale-remmina-te \
locale-remmina-th \
locale-remmina-tr \
locale-remmina-ug \
locale-remmina-uk \
locale-remmina-vi \
locale-remmina-zh-CN \
locale-remmina-zh-TW \
remmina-lang \
remmina-lang-all"

RDEPENDS:${PN} += "remmina"

inherit rpm
