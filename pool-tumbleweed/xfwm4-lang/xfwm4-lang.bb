SUMMARY = "Translations for package xfwm4"
DESCRIPTION = "Provides translations for the 'xfwm4' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "xfwm4-lang-4.18.0-1.4.noarch.rpm"
RPM_HASH = "e238802d2981e300a15756f7c77590f4aa64496a41341f08e54030397d28e13a4e9aaa5932dd0db4a67e282fca82ce85095a883d24f035663de63b06cf2cc658"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfwm4-ar \
locale-xfwm4-be \
locale-xfwm4-bg \
locale-xfwm4-bn \
locale-xfwm4-ca \
locale-xfwm4-cs \
locale-xfwm4-da \
locale-xfwm4-de \
locale-xfwm4-el \
locale-xfwm4-en-AU \
locale-xfwm4-en-CA \
locale-xfwm4-en-GB \
locale-xfwm4-eo \
locale-xfwm4-es \
locale-xfwm4-et \
locale-xfwm4-eu \
locale-xfwm4-fi \
locale-xfwm4-fr \
locale-xfwm4-gl \
locale-xfwm4-he \
locale-xfwm4-hr \
locale-xfwm4-hu \
locale-xfwm4-id \
locale-xfwm4-is \
locale-xfwm4-it \
locale-xfwm4-ja \
locale-xfwm4-ka \
locale-xfwm4-ko \
locale-xfwm4-lt \
locale-xfwm4-lv \
locale-xfwm4-ms \
locale-xfwm4-nb \
locale-xfwm4-nl \
locale-xfwm4-nn \
locale-xfwm4-oc \
locale-xfwm4-pa \
locale-xfwm4-pl \
locale-xfwm4-pt \
locale-xfwm4-pt-BR \
locale-xfwm4-ro \
locale-xfwm4-ru \
locale-xfwm4-si \
locale-xfwm4-sk \
locale-xfwm4-sl \
locale-xfwm4-sq \
locale-xfwm4-sr \
locale-xfwm4-sv \
locale-xfwm4-te \
locale-xfwm4-th \
locale-xfwm4-tr \
locale-xfwm4-ug \
locale-xfwm4-uk \
locale-xfwm4-vi \
locale-xfwm4-zh-CN \
locale-xfwm4-zh-HK \
locale-xfwm4-zh-TW \
xfwm4-lang \
xfwm4-lang-all"

RDEPENDS:${PN} += "xfwm4"

inherit rpm
