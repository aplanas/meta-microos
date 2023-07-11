SUMMARY = "Translations for package xfdesktop"
DESCRIPTION = "Provides translations for the 'xfdesktop' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.1"

RPM_NAME = "xfdesktop-lang-4.18.1-1.4.noarch.rpm"
RPM_HASH = "59aadf26ec2e9944efcd7647e3ee684396267938aaf3195c45f49419740afbec49eba79d6919a9fda43bcb79d1ec9256eabece8f69daf0742feb9d11ed20bbd6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-xfdesktop-ar \
locale-xfdesktop-az \
locale-xfdesktop-be \
locale-xfdesktop-bg \
locale-xfdesktop-bn \
locale-xfdesktop-ca \
locale-xfdesktop-cs \
locale-xfdesktop-da \
locale-xfdesktop-de \
locale-xfdesktop-el \
locale-xfdesktop-en-AU \
locale-xfdesktop-en-CA \
locale-xfdesktop-en-GB \
locale-xfdesktop-eo \
locale-xfdesktop-es \
locale-xfdesktop-et \
locale-xfdesktop-eu \
locale-xfdesktop-fi \
locale-xfdesktop-fr \
locale-xfdesktop-gl \
locale-xfdesktop-he \
locale-xfdesktop-hr \
locale-xfdesktop-hu \
locale-xfdesktop-id \
locale-xfdesktop-is \
locale-xfdesktop-it \
locale-xfdesktop-ja \
locale-xfdesktop-ka \
locale-xfdesktop-ko \
locale-xfdesktop-lt \
locale-xfdesktop-lv \
locale-xfdesktop-ms \
locale-xfdesktop-nb \
locale-xfdesktop-ne \
locale-xfdesktop-nl \
locale-xfdesktop-nn \
locale-xfdesktop-oc \
locale-xfdesktop-pa \
locale-xfdesktop-pl \
locale-xfdesktop-pt \
locale-xfdesktop-pt-BR \
locale-xfdesktop-ro \
locale-xfdesktop-ru \
locale-xfdesktop-si \
locale-xfdesktop-sk \
locale-xfdesktop-sl \
locale-xfdesktop-sq \
locale-xfdesktop-sr \
locale-xfdesktop-sv \
locale-xfdesktop-te \
locale-xfdesktop-th \
locale-xfdesktop-tr \
locale-xfdesktop-ug \
locale-xfdesktop-uk \
locale-xfdesktop-vi \
locale-xfdesktop-zh-CN \
locale-xfdesktop-zh-HK \
locale-xfdesktop-zh-TW \
xfdesktop-lang \
xfdesktop-lang-all"

RDEPENDS:${PN} += "xfdesktop"

inherit rpm
