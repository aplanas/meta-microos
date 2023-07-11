SUMMARY = "Translations for package plasma5-welcome"
DESCRIPTION = "Provides translations for the 'plasma5-welcome' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.27.6"

RPM_NAME = "plasma5-welcome-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "8a94ebc0125d35653eb36e50d752b5c6c2a84e62dc797f4dd6ad4f963f687747312e7b86709a8756af4f2f6dcf3258178b637b07f4b33e522ce819801998baae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-welcome-ar \
locale-plasma5-welcome-ca \
locale-plasma5-welcome-ca@valencia \
locale-plasma5-welcome-cs \
locale-plasma5-welcome-de \
locale-plasma5-welcome-en-GB \
locale-plasma5-welcome-es \
locale-plasma5-welcome-eu \
locale-plasma5-welcome-fi \
locale-plasma5-welcome-fr \
locale-plasma5-welcome-gl \
locale-plasma5-welcome-ia \
locale-plasma5-welcome-id \
locale-plasma5-welcome-is \
locale-plasma5-welcome-it \
locale-plasma5-welcome-ja \
locale-plasma5-welcome-ka \
locale-plasma5-welcome-ko \
locale-plasma5-welcome-nl \
locale-plasma5-welcome-nn \
locale-plasma5-welcome-pa \
locale-plasma5-welcome-pl \
locale-plasma5-welcome-pt \
locale-plasma5-welcome-pt-BR \
locale-plasma5-welcome-ru \
locale-plasma5-welcome-sk \
locale-plasma5-welcome-sl \
locale-plasma5-welcome-tr \
locale-plasma5-welcome-uk \
locale-plasma5-welcome-zh-CN \
locale-plasma5-welcome-zh-TW \
plasma5-welcome-lang \
plasma5-welcome-lang-all"

RDEPENDS:${PN} += "plasma5-welcome"

inherit rpm
