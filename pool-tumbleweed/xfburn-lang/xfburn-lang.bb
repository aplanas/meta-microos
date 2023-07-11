SUMMARY = "Translations for package xfburn"
DESCRIPTION = "Provides translations for the 'xfburn' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.7.0"

RPM_NAME = "xfburn-lang-0.7.0-1.4.noarch.rpm"
RPM_HASH = "a5f63bd6859a1ee4dc875770b732f65f847733dbc2856125185d88db9049f8a24470d92a06078b9efda440bf513789ac3b2a391fcb329522e7ae0ca7edc46b37"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfburn-ar \
locale-xfburn-ast \
locale-xfburn-be \
locale-xfburn-bg \
locale-xfburn-ca \
locale-xfburn-cs \
locale-xfburn-da \
locale-xfburn-de \
locale-xfburn-el \
locale-xfburn-en-AU \
locale-xfburn-en-GB \
locale-xfburn-es \
locale-xfburn-et \
locale-xfburn-eu \
locale-xfburn-fi \
locale-xfburn-fr \
locale-xfburn-gl \
locale-xfburn-he \
locale-xfburn-hr \
locale-xfburn-hu \
locale-xfburn-id \
locale-xfburn-is \
locale-xfburn-it \
locale-xfburn-ja \
locale-xfburn-kk \
locale-xfburn-ko \
locale-xfburn-lt \
locale-xfburn-lv \
locale-xfburn-ms \
locale-xfburn-nb \
locale-xfburn-nl \
locale-xfburn-nn \
locale-xfburn-oc \
locale-xfburn-pa \
locale-xfburn-pl \
locale-xfburn-pt \
locale-xfburn-pt-BR \
locale-xfburn-ru \
locale-xfburn-si \
locale-xfburn-sk \
locale-xfburn-sl \
locale-xfburn-sq \
locale-xfburn-sr \
locale-xfburn-sv \
locale-xfburn-te \
locale-xfburn-th \
locale-xfburn-tr \
locale-xfburn-ug \
locale-xfburn-uk \
locale-xfburn-vi \
locale-xfburn-zh-CN \
locale-xfburn-zh-TW \
xfburn-lang \
xfburn-lang-all"

RDEPENDS:${PN} += "xfburn"

inherit rpm
