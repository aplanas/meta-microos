SUMMARY = "Translations for package lxappearance-obconf"
DESCRIPTION = "Provides translations for the 'lxappearance-obconf' package."
LICENSE = "GPL-2.0"

PV = "0.2.3"

RPM_NAME = "lxappearance-obconf-lang-0.2.3-1.26.noarch.rpm"
RPM_HASH = "faaf79e6aeabcc9251f3ead0840754b3ff95228553c19df7b9f5e3ff178037feaf97130384e8284b85d9d8c2bb319d0751e08395254fe51b586928fa1af727e1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-lxappearance-obconf-ar \
locale-lxappearance-obconf-be \
locale-lxappearance-obconf-bg \
locale-lxappearance-obconf-bn-IN \
locale-lxappearance-obconf-ca \
locale-lxappearance-obconf-cs \
locale-lxappearance-obconf-da \
locale-lxappearance-obconf-de \
locale-lxappearance-obconf-el \
locale-lxappearance-obconf-en-GB \
locale-lxappearance-obconf-es \
locale-lxappearance-obconf-et \
locale-lxappearance-obconf-eu \
locale-lxappearance-obconf-fa \
locale-lxappearance-obconf-fi \
locale-lxappearance-obconf-fr \
locale-lxappearance-obconf-gl \
locale-lxappearance-obconf-he \
locale-lxappearance-obconf-hr \
locale-lxappearance-obconf-hu \
locale-lxappearance-obconf-id \
locale-lxappearance-obconf-is \
locale-lxappearance-obconf-it \
locale-lxappearance-obconf-ja \
locale-lxappearance-obconf-kk \
locale-lxappearance-obconf-ko \
locale-lxappearance-obconf-lt \
locale-lxappearance-obconf-nb \
locale-lxappearance-obconf-nl \
locale-lxappearance-obconf-pa \
locale-lxappearance-obconf-pl \
locale-lxappearance-obconf-pt \
locale-lxappearance-obconf-pt-BR \
locale-lxappearance-obconf-ro \
locale-lxappearance-obconf-ru \
locale-lxappearance-obconf-sl \
locale-lxappearance-obconf-sr \
locale-lxappearance-obconf-sr@latin \
locale-lxappearance-obconf-sv \
locale-lxappearance-obconf-te \
locale-lxappearance-obconf-tr \
locale-lxappearance-obconf-ug \
locale-lxappearance-obconf-uk \
locale-lxappearance-obconf-vi \
locale-lxappearance-obconf-zh-CN \
locale-lxappearance-obconf-zh-TW \
lxappearance-obconf-lang \
lxappearance-obconf-lang-all"

RDEPENDS:${PN} += "lxappearance-obconf"

inherit rpm
