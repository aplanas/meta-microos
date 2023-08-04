SUMMARY = "Translations for package xdg-desktop-portal-kde"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal-kde' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.7"

RPM_NAME = "xdg-desktop-portal-kde-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "d08875b650bd3a62f9891b88d266f4e24bf43ca56154e24da79858b653e79dcf0c1d592ee2bdf35cfe4980fe5429f8846207a550c2de0b3a63bc644a513a5e1e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xdg-desktop-portal-kde-ar \
locale-xdg-desktop-portal-kde-az \
locale-xdg-desktop-portal-kde-bg \
locale-xdg-desktop-portal-kde-ca \
locale-xdg-desktop-portal-kde-ca@valencia \
locale-xdg-desktop-portal-kde-cs \
locale-xdg-desktop-portal-kde-da \
locale-xdg-desktop-portal-kde-de \
locale-xdg-desktop-portal-kde-el \
locale-xdg-desktop-portal-kde-en-GB \
locale-xdg-desktop-portal-kde-es \
locale-xdg-desktop-portal-kde-et \
locale-xdg-desktop-portal-kde-eu \
locale-xdg-desktop-portal-kde-fi \
locale-xdg-desktop-portal-kde-fr \
locale-xdg-desktop-portal-kde-gl \
locale-xdg-desktop-portal-kde-he \
locale-xdg-desktop-portal-kde-hu \
locale-xdg-desktop-portal-kde-ia \
locale-xdg-desktop-portal-kde-id \
locale-xdg-desktop-portal-kde-it \
locale-xdg-desktop-portal-kde-ja \
locale-xdg-desktop-portal-kde-ka \
locale-xdg-desktop-portal-kde-ko \
locale-xdg-desktop-portal-kde-lt \
locale-xdg-desktop-portal-kde-ml \
locale-xdg-desktop-portal-kde-nl \
locale-xdg-desktop-portal-kde-nn \
locale-xdg-desktop-portal-kde-pa \
locale-xdg-desktop-portal-kde-pl \
locale-xdg-desktop-portal-kde-pt \
locale-xdg-desktop-portal-kde-pt-BR \
locale-xdg-desktop-portal-kde-ro \
locale-xdg-desktop-portal-kde-ru \
locale-xdg-desktop-portal-kde-sk \
locale-xdg-desktop-portal-kde-sl \
locale-xdg-desktop-portal-kde-sr \
locale-xdg-desktop-portal-kde-sr@ijekavian \
locale-xdg-desktop-portal-kde-sr@ijekavianlatin \
locale-xdg-desktop-portal-kde-sr@latin \
locale-xdg-desktop-portal-kde-sv \
locale-xdg-desktop-portal-kde-ta \
locale-xdg-desktop-portal-kde-tr \
locale-xdg-desktop-portal-kde-uk \
locale-xdg-desktop-portal-kde-zh-CN \
locale-xdg-desktop-portal-kde-zh-TW \
xdg-desktop-portal-kde-lang \
xdg-desktop-portal-kde-lang-all"

RDEPENDS:${PN} += "xdg-desktop-portal-kde"

inherit rpm
