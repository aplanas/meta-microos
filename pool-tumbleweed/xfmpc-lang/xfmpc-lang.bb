SUMMARY = "Translations for package xfmpc"
DESCRIPTION = "Provides translations for the 'xfmpc' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.3.1"

RPM_NAME = "xfmpc-lang-0.3.1-1.1.noarch.rpm"
RPM_HASH = "b3e3542d66a505986277f9bec8b5b6bb8f7b11f8eb5e845deb63c4517af168bb2a2b6f417de3e61a5b86d74f57e7707e5fdf23ea6d5ddcb6e786f2d536672f15"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfmpc-ar \
locale-xfmpc-be \
locale-xfmpc-bg \
locale-xfmpc-ca \
locale-xfmpc-cs \
locale-xfmpc-da \
locale-xfmpc-de \
locale-xfmpc-el \
locale-xfmpc-en-AU \
locale-xfmpc-en-GB \
locale-xfmpc-es \
locale-xfmpc-et \
locale-xfmpc-eu \
locale-xfmpc-fi \
locale-xfmpc-fr \
locale-xfmpc-gl \
locale-xfmpc-he \
locale-xfmpc-hr \
locale-xfmpc-hu \
locale-xfmpc-id \
locale-xfmpc-is \
locale-xfmpc-it \
locale-xfmpc-ja \
locale-xfmpc-ko \
locale-xfmpc-lt \
locale-xfmpc-ms \
locale-xfmpc-nb \
locale-xfmpc-nl \
locale-xfmpc-oc \
locale-xfmpc-pl \
locale-xfmpc-pt \
locale-xfmpc-pt-BR \
locale-xfmpc-ru \
locale-xfmpc-si \
locale-xfmpc-sk \
locale-xfmpc-sl \
locale-xfmpc-sq \
locale-xfmpc-sr \
locale-xfmpc-sv \
locale-xfmpc-th \
locale-xfmpc-tr \
locale-xfmpc-ug \
locale-xfmpc-uk \
locale-xfmpc-zh-CN \
locale-xfmpc-zh-TW \
xfmpc-lang \
xfmpc-lang-all"

RDEPENDS:${PN} += "xfmpc"

inherit rpm
