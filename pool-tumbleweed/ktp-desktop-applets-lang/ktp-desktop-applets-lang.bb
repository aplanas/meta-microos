SUMMARY = "Translations for package ktp-desktop-applets"
DESCRIPTION = "Provides translations for the 'ktp-desktop-applets' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "ktp-desktop-applets-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "b9f47df00288f2d552cf8c0e6fe088ce1d5e41c4c4b94249794739da496948f3555d4c38e45e4793a81d2bbab541b192e99e6ba6de8a6d75f4c63bb8077e0e5d"
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
