SUMMARY = "Translations for package firewalld"
DESCRIPTION = "Provides translations for the 'firewalld' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-lang-2.0.0-1.1.noarch.rpm"
RPM_HASH = "48e6a93dcf262f49aa7b40a7e3a757072d7ce2da13704fd86284dbf81640bc9c02abb8694d7c183f2727d54005a9a58fa98076f9f3abd7fafd9593dd59338866"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-lang \
firewalld-lang-all \
locale-firewalld-ar \
locale-firewalld-as \
locale-firewalld-ast \
locale-firewalld-bg \
locale-firewalld-bn-IN \
locale-firewalld-ca \
locale-firewalld-cs \
locale-firewalld-da \
locale-firewalld-de \
locale-firewalld-el \
locale-firewalld-en-GB \
locale-firewalld-en-US \
locale-firewalld-es \
locale-firewalld-et \
locale-firewalld-eu \
locale-firewalld-fa \
locale-firewalld-fi \
locale-firewalld-fr \
locale-firewalld-gl \
locale-firewalld-gu \
locale-firewalld-hi \
locale-firewalld-hr \
locale-firewalld-hu \
locale-firewalld-ia \
locale-firewalld-id \
locale-firewalld-it \
locale-firewalld-ja \
locale-firewalld-ka \
locale-firewalld-kn \
locale-firewalld-ko \
locale-firewalld-lt \
locale-firewalld-ml \
locale-firewalld-mr \
locale-firewalld-nl \
locale-firewalld-or \
locale-firewalld-pa \
locale-firewalld-pl \
locale-firewalld-pt \
locale-firewalld-pt-BR \
locale-firewalld-ru \
locale-firewalld-si \
locale-firewalld-sk \
locale-firewalld-sq \
locale-firewalld-sr \
locale-firewalld-sr@latin \
locale-firewalld-sv \
locale-firewalld-ta \
locale-firewalld-te \
locale-firewalld-tr \
locale-firewalld-uk \
locale-firewalld-zh-CN \
locale-firewalld-zh-TW"

RDEPENDS:${PN} += "firewalld"

inherit rpm
