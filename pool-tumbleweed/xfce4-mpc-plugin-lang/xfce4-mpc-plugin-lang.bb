SUMMARY = "Translations for package xfce4-mpc-plugin"
DESCRIPTION = "Provides translations for the 'xfce4-mpc-plugin' package."
LICENSE = "ISC"

PV = "0.5.3"

RPM_NAME = "xfce4-mpc-plugin-lang-0.5.3-1.1.noarch.rpm"
RPM_HASH = "7ae20d489acafba47541c85a78049253e66b70a80cec928ef28737cee4cbba7f1d902047950c93fa917061f905886d34f444352978bd0c43ae0497a3612fc595"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-mpc-plugin-ar \
locale-xfce4-mpc-plugin-be \
locale-xfce4-mpc-plugin-bg \
locale-xfce4-mpc-plugin-ca \
locale-xfce4-mpc-plugin-cs \
locale-xfce4-mpc-plugin-da \
locale-xfce4-mpc-plugin-de \
locale-xfce4-mpc-plugin-el \
locale-xfce4-mpc-plugin-en-AU \
locale-xfce4-mpc-plugin-en-CA \
locale-xfce4-mpc-plugin-en-GB \
locale-xfce4-mpc-plugin-es \
locale-xfce4-mpc-plugin-et \
locale-xfce4-mpc-plugin-eu \
locale-xfce4-mpc-plugin-fi \
locale-xfce4-mpc-plugin-fr \
locale-xfce4-mpc-plugin-gl \
locale-xfce4-mpc-plugin-he \
locale-xfce4-mpc-plugin-hr \
locale-xfce4-mpc-plugin-hu \
locale-xfce4-mpc-plugin-id \
locale-xfce4-mpc-plugin-is \
locale-xfce4-mpc-plugin-it \
locale-xfce4-mpc-plugin-ja \
locale-xfce4-mpc-plugin-ko \
locale-xfce4-mpc-plugin-lt \
locale-xfce4-mpc-plugin-lv \
locale-xfce4-mpc-plugin-ms \
locale-xfce4-mpc-plugin-nb \
locale-xfce4-mpc-plugin-nl \
locale-xfce4-mpc-plugin-oc \
locale-xfce4-mpc-plugin-pl \
locale-xfce4-mpc-plugin-pt \
locale-xfce4-mpc-plugin-pt-BR \
locale-xfce4-mpc-plugin-ru \
locale-xfce4-mpc-plugin-sk \
locale-xfce4-mpc-plugin-sl \
locale-xfce4-mpc-plugin-sq \
locale-xfce4-mpc-plugin-sr \
locale-xfce4-mpc-plugin-sv \
locale-xfce4-mpc-plugin-th \
locale-xfce4-mpc-plugin-tr \
locale-xfce4-mpc-plugin-ug \
locale-xfce4-mpc-plugin-uk \
locale-xfce4-mpc-plugin-zh-CN \
locale-xfce4-mpc-plugin-zh-TW \
xfce4-mpc-plugin-lang \
xfce4-mpc-plugin-lang-all \
xfce4-panel-plugin-mpc-lang"

RDEPENDS:${PN} += "xfce4-mpc-plugin"

inherit rpm
