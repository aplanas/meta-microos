SUMMARY = "Translations for package xdg-desktop-portal"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.0"

RPM_NAME = "xdg-desktop-portal-lang-1.16.0-2.1.noarch.rpm"
RPM_HASH = "67806740784b143ea165364bb2761692c28433edb1eec17597c537a027db4243dfa3846f62c989dff0c331c8c4053cec22a861f67a1774857a7e479ef6cd4e83"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xdg-desktop-portal-cs \
locale-xdg-desktop-portal-da \
locale-xdg-desktop-portal-de \
locale-xdg-desktop-portal-en-GB \
locale-xdg-desktop-portal-es \
locale-xdg-desktop-portal-fr \
locale-xdg-desktop-portal-gl \
locale-xdg-desktop-portal-he \
locale-xdg-desktop-portal-hi \
locale-xdg-desktop-portal-hr \
locale-xdg-desktop-portal-hu \
locale-xdg-desktop-portal-id \
locale-xdg-desktop-portal-it \
locale-xdg-desktop-portal-ka \
locale-xdg-desktop-portal-lt \
locale-xdg-desktop-portal-nl \
locale-xdg-desktop-portal-oc \
locale-xdg-desktop-portal-pl \
locale-xdg-desktop-portal-pt \
locale-xdg-desktop-portal-pt-BR \
locale-xdg-desktop-portal-ro \
locale-xdg-desktop-portal-ru \
locale-xdg-desktop-portal-sk \
locale-xdg-desktop-portal-sr \
locale-xdg-desktop-portal-sv \
locale-xdg-desktop-portal-tr \
locale-xdg-desktop-portal-uk \
locale-xdg-desktop-portal-zh-CN \
locale-xdg-desktop-portal-zh-TW \
xdg-desktop-portal-lang \
xdg-desktop-portal-lang-all"

RDEPENDS:${PN} += "xdg-desktop-portal"

inherit rpm
