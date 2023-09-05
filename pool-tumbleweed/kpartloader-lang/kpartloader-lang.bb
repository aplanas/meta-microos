SUMMARY = "Translations for package kpartloader"
DESCRIPTION = "Provides translations for the 'kpartloader' package."
LICENSE = "GPL-2.0-only & GFDL-1.2-only & LGPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "kpartloader-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "3c040d11802eb0cd1e5cc475851ac3344dd6b10ab618d66040d8c5f272f62f478bb940378b36cf71bfd1060f84bb59526c5b17db7beeaf2ec751ea653044ba60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kpartloader-lang \
kpartloader-lang-all \
locale-kpartloader-az \
locale-kpartloader-bg \
locale-kpartloader-bs \
locale-kpartloader-ca \
locale-kpartloader-ca@valencia \
locale-kpartloader-cs \
locale-kpartloader-da \
locale-kpartloader-de \
locale-kpartloader-el \
locale-kpartloader-en-GB \
locale-kpartloader-eo \
locale-kpartloader-es \
locale-kpartloader-et \
locale-kpartloader-eu \
locale-kpartloader-fi \
locale-kpartloader-fr \
locale-kpartloader-ga \
locale-kpartloader-gl \
locale-kpartloader-hr \
locale-kpartloader-hu \
locale-kpartloader-ia \
locale-kpartloader-id \
locale-kpartloader-it \
locale-kpartloader-ja \
locale-kpartloader-ka \
locale-kpartloader-kk \
locale-kpartloader-ko \
locale-kpartloader-lt \
locale-kpartloader-lv \
locale-kpartloader-mr \
locale-kpartloader-nb \
locale-kpartloader-nds \
locale-kpartloader-nl \
locale-kpartloader-nn \
locale-kpartloader-pa \
locale-kpartloader-pl \
locale-kpartloader-pt \
locale-kpartloader-pt-BR \
locale-kpartloader-ro \
locale-kpartloader-ru \
locale-kpartloader-sk \
locale-kpartloader-sl \
locale-kpartloader-sq \
locale-kpartloader-sv \
locale-kpartloader-tr \
locale-kpartloader-ug \
locale-kpartloader-uk \
locale-kpartloader-zh-CN \
locale-kpartloader-zh-TW"

RDEPENDS:${PN} += "kpartloader"

inherit rpm
