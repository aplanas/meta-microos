SUMMARY = "Translations for package xfce4-settings"
DESCRIPTION = "Provides translations for the 'xfce4-settings' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.18.3"

RPM_NAME = "xfce4-settings-lang-4.18.3-1.1.noarch.rpm"
RPM_HASH = "fa99948e859a8ea10155857f2487f61b641dcd939593b4df32dad3ae08cb0256367de8f4c513b5fcb0e7947f6dc72488693b591a78a1f7914f3e49c76734fb08"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfce4-settings-ar \
locale-xfce4-settings-be \
locale-xfce4-settings-bg \
locale-xfce4-settings-bn \
locale-xfce4-settings-ca \
locale-xfce4-settings-cs \
locale-xfce4-settings-da \
locale-xfce4-settings-de \
locale-xfce4-settings-el \
locale-xfce4-settings-en-AU \
locale-xfce4-settings-en-CA \
locale-xfce4-settings-en-GB \
locale-xfce4-settings-es \
locale-xfce4-settings-et \
locale-xfce4-settings-eu \
locale-xfce4-settings-fi \
locale-xfce4-settings-fr \
locale-xfce4-settings-gl \
locale-xfce4-settings-he \
locale-xfce4-settings-hr \
locale-xfce4-settings-hu \
locale-xfce4-settings-id \
locale-xfce4-settings-is \
locale-xfce4-settings-it \
locale-xfce4-settings-ja \
locale-xfce4-settings-ka \
locale-xfce4-settings-ko \
locale-xfce4-settings-lt \
locale-xfce4-settings-lv \
locale-xfce4-settings-ms \
locale-xfce4-settings-nb \
locale-xfce4-settings-nl \
locale-xfce4-settings-nn \
locale-xfce4-settings-oc \
locale-xfce4-settings-pa \
locale-xfce4-settings-pl \
locale-xfce4-settings-pt \
locale-xfce4-settings-pt-BR \
locale-xfce4-settings-ro \
locale-xfce4-settings-ru \
locale-xfce4-settings-si \
locale-xfce4-settings-sk \
locale-xfce4-settings-sl \
locale-xfce4-settings-sq \
locale-xfce4-settings-sr \
locale-xfce4-settings-sv \
locale-xfce4-settings-te \
locale-xfce4-settings-th \
locale-xfce4-settings-tr \
locale-xfce4-settings-ug \
locale-xfce4-settings-uk \
locale-xfce4-settings-zh-CN \
locale-xfce4-settings-zh-HK \
locale-xfce4-settings-zh-TW \
xfce4-settings-lang \
xfce4-settings-lang-all"

RDEPENDS:${PN} += "xfce4-settings"

inherit rpm
