SUMMARY = "Translations for package nano"
DESCRIPTION = "Provides translations for the 'nano' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.2"

RPM_NAME = "nano-lang-7.2-1.4.noarch.rpm"
RPM_HASH = "559bf90cc12f722337e8abc6bde044cd2c195ec10f9f9f4131b9e914e9361c500391aab5fba328a63cafb40920749d96fdc3dcb813724fc3f6c4c449d885c1b6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-nano-bg \
locale-nano-ca \
locale-nano-cs \
locale-nano-da \
locale-nano-de \
locale-nano-eo \
locale-nano-es \
locale-nano-eu \
locale-nano-fi \
locale-nano-fr \
locale-nano-ga \
locale-nano-gl \
locale-nano-hr \
locale-nano-hu \
locale-nano-id \
locale-nano-is \
locale-nano-it \
locale-nano-ja \
locale-nano-ka \
locale-nano-ko \
locale-nano-ms \
locale-nano-nb \
locale-nano-nl \
locale-nano-pl \
locale-nano-pt \
locale-nano-pt-BR \
locale-nano-ro \
locale-nano-ru \
locale-nano-sk \
locale-nano-sl \
locale-nano-sq \
locale-nano-sr \
locale-nano-sv \
locale-nano-tr \
locale-nano-uk \
locale-nano-vi \
locale-nano-zh-CN \
locale-nano-zh-TW \
nano-lang \
nano-lang-all"

RDEPENDS:${PN} += "nano"

inherit rpm
