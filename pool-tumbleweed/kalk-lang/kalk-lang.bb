SUMMARY = "Translations for package kalk"
DESCRIPTION = "Provides translations for the 'kalk' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.08.0"

RPM_NAME = "kalk-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "ffe087dbaa177cc60ff969bf6a769df9857840741596ec592876a8facd6066fe6eca89e3f959698427aee10994eb92c19849e4f6fa2fab5fa0c61ab88904b0b1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kalk-lang \
kalk-lang-all \
locale-kalk-ar \
locale-kalk-az \
locale-kalk-ca \
locale-kalk-ca@valencia \
locale-kalk-cs \
locale-kalk-de \
locale-kalk-el \
locale-kalk-en-GB \
locale-kalk-es \
locale-kalk-eu \
locale-kalk-fi \
locale-kalk-fr \
locale-kalk-gl \
locale-kalk-hi \
locale-kalk-hu \
locale-kalk-it \
locale-kalk-ja \
locale-kalk-ka \
locale-kalk-ko \
locale-kalk-lt \
locale-kalk-nl \
locale-kalk-nn \
locale-kalk-pa \
locale-kalk-pl \
locale-kalk-pt \
locale-kalk-pt-BR \
locale-kalk-ru \
locale-kalk-sk \
locale-kalk-sl \
locale-kalk-sv \
locale-kalk-tr \
locale-kalk-uk \
locale-kalk-zh-CN \
locale-kalk-zh-TW"

RDEPENDS:${PN} += "kalk"

inherit rpm
