SUMMARY = "Translations for package ktp-desktop-applets"
DESCRIPTION = "Provides translations for the 'ktp-desktop-applets' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "ktp-desktop-applets-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "86c4af9eab6c78696fdf1a6836b017716e6b9bb8fc552723777358556d6e62e7af1543548251e60ca2f8b55e307512d288fee41198be2ce2ee0678691af2c200"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktp-desktop-applets-lang \
ktp-desktop-applets-lang-all \
locale-ktp-desktop-applets-ar \
locale-ktp-desktop-applets-ca \
locale-ktp-desktop-applets-ca@valencia \
locale-ktp-desktop-applets-cs \
locale-ktp-desktop-applets-da \
locale-ktp-desktop-applets-de \
locale-ktp-desktop-applets-el \
locale-ktp-desktop-applets-en-GB \
locale-ktp-desktop-applets-es \
locale-ktp-desktop-applets-et \
locale-ktp-desktop-applets-eu \
locale-ktp-desktop-applets-fi \
locale-ktp-desktop-applets-fr \
locale-ktp-desktop-applets-gl \
locale-ktp-desktop-applets-hi \
locale-ktp-desktop-applets-ia \
locale-ktp-desktop-applets-it \
locale-ktp-desktop-applets-ja \
locale-ktp-desktop-applets-ka \
locale-ktp-desktop-applets-ko \
locale-ktp-desktop-applets-lt \
locale-ktp-desktop-applets-nl \
locale-ktp-desktop-applets-nn \
locale-ktp-desktop-applets-pl \
locale-ktp-desktop-applets-pt \
locale-ktp-desktop-applets-pt-BR \
locale-ktp-desktop-applets-ro \
locale-ktp-desktop-applets-ru \
locale-ktp-desktop-applets-sk \
locale-ktp-desktop-applets-sl \
locale-ktp-desktop-applets-sr \
locale-ktp-desktop-applets-sr@ijekavian \
locale-ktp-desktop-applets-sr@ijekavianlatin \
locale-ktp-desktop-applets-sr@latin \
locale-ktp-desktop-applets-sv \
locale-ktp-desktop-applets-tr \
locale-ktp-desktop-applets-uk \
locale-ktp-desktop-applets-zh-CN \
locale-ktp-desktop-applets-zh-TW"

RDEPENDS:${PN} += "ktp-desktop-applets"

inherit rpm
