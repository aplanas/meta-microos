SUMMARY = "Translations for package xfce4-netload-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-netload-plugin' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.4.1"

RPM_NAME = "xfce4-netload-plugin-lang-1.4.1-1.1.noarch.rpm"
RPM_HASH = "55b9929fca932fbd2d87aebe969143d2b2ed142d36bfafacf94efb1e8f8cac688050ce1b08bf76f366298313d217ff3b509094fd09d1eb19bbd818b983836753"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-netload-plugin-ar \
locale-xfce4-netload-plugin-ast \
locale-xfce4-netload-plugin-be \
locale-xfce4-netload-plugin-bg \
locale-xfce4-netload-plugin-ca \
locale-xfce4-netload-plugin-cs \
locale-xfce4-netload-plugin-da \
locale-xfce4-netload-plugin-de \
locale-xfce4-netload-plugin-el \
locale-xfce4-netload-plugin-en-AU \
locale-xfce4-netload-plugin-en-CA \
locale-xfce4-netload-plugin-en-GB \
locale-xfce4-netload-plugin-eo \
locale-xfce4-netload-plugin-es \
locale-xfce4-netload-plugin-et \
locale-xfce4-netload-plugin-eu \
locale-xfce4-netload-plugin-fi \
locale-xfce4-netload-plugin-fr \
locale-xfce4-netload-plugin-gl \
locale-xfce4-netload-plugin-he \
locale-xfce4-netload-plugin-hr \
locale-xfce4-netload-plugin-hu \
locale-xfce4-netload-plugin-id \
locale-xfce4-netload-plugin-is \
locale-xfce4-netload-plugin-it \
locale-xfce4-netload-plugin-ja \
locale-xfce4-netload-plugin-kk \
locale-xfce4-netload-plugin-ko \
locale-xfce4-netload-plugin-lt \
locale-xfce4-netload-plugin-lv \
locale-xfce4-netload-plugin-ms \
locale-xfce4-netload-plugin-nb \
locale-xfce4-netload-plugin-nl \
locale-xfce4-netload-plugin-oc \
locale-xfce4-netload-plugin-pa \
locale-xfce4-netload-plugin-pl \
locale-xfce4-netload-plugin-pt \
locale-xfce4-netload-plugin-pt-BR \
locale-xfce4-netload-plugin-ro \
locale-xfce4-netload-plugin-ru \
locale-xfce4-netload-plugin-sk \
locale-xfce4-netload-plugin-sl \
locale-xfce4-netload-plugin-sq \
locale-xfce4-netload-plugin-sr \
locale-xfce4-netload-plugin-sv \
locale-xfce4-netload-plugin-th \
locale-xfce4-netload-plugin-tr \
locale-xfce4-netload-plugin-ug \
locale-xfce4-netload-plugin-uk \
locale-xfce4-netload-plugin-vi \
locale-xfce4-netload-plugin-zh-CN \
locale-xfce4-netload-plugin-zh-TW \
xfce4-netload-plugin-lang \
xfce4-netload-plugin-lang-all \
xfce4-panel-plugin-netload-lang"

RDEPENDS:${PN} += "xfce4-netload-plugin"

inherit rpm
