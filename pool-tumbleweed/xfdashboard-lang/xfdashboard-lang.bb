SUMMARY = "Translations for package xfdashboard"
DESCRIPTION = "Provides translations for the 'xfdashboard' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.0.0"

RPM_NAME = "xfdashboard-lang-1.0.0-1.5.noarch.rpm"
RPM_HASH = "a1935fee7b1f70dfbf876530129db25c526c788bd0e7d91e0243803f7a1521e9e544f609d054a829293f5acd4098b6b62b3cd6be5fc1148a4d6b46b5087c5992"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfdashboard-be \
locale-xfdashboard-bg \
locale-xfdashboard-ca \
locale-xfdashboard-da \
locale-xfdashboard-de \
locale-xfdashboard-el \
locale-xfdashboard-es \
locale-xfdashboard-et \
locale-xfdashboard-eu \
locale-xfdashboard-fr \
locale-xfdashboard-gl \
locale-xfdashboard-he \
locale-xfdashboard-id \
locale-xfdashboard-it \
locale-xfdashboard-it-IT \
locale-xfdashboard-ja \
locale-xfdashboard-kk \
locale-xfdashboard-ko \
locale-xfdashboard-lt \
locale-xfdashboard-nb \
locale-xfdashboard-nl \
locale-xfdashboard-pl \
locale-xfdashboard-pt \
locale-xfdashboard-pt-BR \
locale-xfdashboard-ru \
locale-xfdashboard-ru-RU \
locale-xfdashboard-sl \
locale-xfdashboard-sq \
locale-xfdashboard-sr \
locale-xfdashboard-sv \
locale-xfdashboard-tr \
locale-xfdashboard-zh-CN \
xfdashboard-lang \
xfdashboard-lang-all"

RDEPENDS:${PN} += "xfdashboard"

inherit rpm
