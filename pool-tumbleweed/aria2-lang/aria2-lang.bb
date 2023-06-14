SUMMARY = "Translations for package aria2"
DESCRIPTION = "Provides translations for the 'aria2' package."
LICENSE = "SUSE-GPL-2.0-with-openssl-exception"

PV = "1.36.0"

RPM_NAME = "aria2-lang-1.36.0-1.11.noarch.rpm"
RPM_HASH = "583d1cf042e00cd509f70ee1c8f7a055fd8e222be5a89dbc13e31964930538e7022a3bfa90e47f630ae85edc7462b779ee67baef4247ae4a0801cc215064b1d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "aria2-lang \
aria2-lang-all \
locale-aria2-ar \
locale-aria2-bg \
locale-aria2-bn \
locale-aria2-ca \
locale-aria2-da \
locale-aria2-de \
locale-aria2-el \
locale-aria2-en@boldquot \
locale-aria2-en@quot \
locale-aria2-es \
locale-aria2-fa \
locale-aria2-fi \
locale-aria2-fr \
locale-aria2-he \
locale-aria2-hr \
locale-aria2-hu \
locale-aria2-id \
locale-aria2-it \
locale-aria2-ja \
locale-aria2-kk \
locale-aria2-ko \
locale-aria2-ms \
locale-aria2-nb \
locale-aria2-nl \
locale-aria2-nn \
locale-aria2-oc \
locale-aria2-pl \
locale-aria2-pt \
locale-aria2-pt-BR \
locale-aria2-ro \
locale-aria2-ru \
locale-aria2-sk \
locale-aria2-sr \
locale-aria2-sv \
locale-aria2-th \
locale-aria2-tr \
locale-aria2-uk \
locale-aria2-vi \
locale-aria2-zh-CN \
locale-aria2-zh-HK \
locale-aria2-zh-TW"

RDEPENDS:${PN} += "aria2"

inherit rpm
