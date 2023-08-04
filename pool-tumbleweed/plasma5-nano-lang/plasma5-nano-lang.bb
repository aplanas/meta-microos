SUMMARY = "Translations for package plasma5-nano"
DESCRIPTION = "Provides translations for the 'plasma5-nano' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.27.7"

RPM_NAME = "plasma5-nano-lang-5.27.7-1.1.noarch.rpm"
RPM_HASH = "c2995f3f40d627b6a99bb079a1ddbab3c8dd427af36d62c484c69c95299d8254b7b88f2d116c77e9fea90c1704323edae34e2a4ddfeebbe1f48730b096f5cd8b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-plasma5-nano-az \
locale-plasma5-nano-bg \
locale-plasma5-nano-ca \
locale-plasma5-nano-ca@valencia \
locale-plasma5-nano-cs \
locale-plasma5-nano-da \
locale-plasma5-nano-de \
locale-plasma5-nano-el \
locale-plasma5-nano-en-GB \
locale-plasma5-nano-es \
locale-plasma5-nano-et \
locale-plasma5-nano-eu \
locale-plasma5-nano-fi \
locale-plasma5-nano-fr \
locale-plasma5-nano-gl \
locale-plasma5-nano-hi \
locale-plasma5-nano-hu \
locale-plasma5-nano-ia \
locale-plasma5-nano-id \
locale-plasma5-nano-it \
locale-plasma5-nano-ja \
locale-plasma5-nano-ka \
locale-plasma5-nano-ko \
locale-plasma5-nano-lt \
locale-plasma5-nano-nl \
locale-plasma5-nano-nn \
locale-plasma5-nano-pl \
locale-plasma5-nano-pt \
locale-plasma5-nano-pt-BR \
locale-plasma5-nano-ro \
locale-plasma5-nano-ru \
locale-plasma5-nano-sk \
locale-plasma5-nano-sl \
locale-plasma5-nano-sv \
locale-plasma5-nano-ta \
locale-plasma5-nano-tr \
locale-plasma5-nano-uk \
locale-plasma5-nano-zh-CN \
locale-plasma5-nano-zh-TW \
plasma5-nano-lang \
plasma5-nano-lang-all"

RDEPENDS:${PN} += "plasma5-nano"

inherit rpm
