SUMMARY = "Translations for package indent"
DESCRIPTION = "Provides translations for the 'indent' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.2.13"

RPM_NAME = "indent-lang-2.2.13-2.1.noarch.rpm"
RPM_HASH = "110b5d5e42d29f347a7065afd5fe63227eca0e1ce3e967146dac3cd0dac6606b44bbb39e9dcfc774dec4e39cf7c116c499f0aee739ac8105b395744ba2217019"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "indent-lang \
indent-lang-all \
locale-indent-bg \
locale-indent-ca \
locale-indent-cs \
locale-indent-da \
locale-indent-de \
locale-indent-el \
locale-indent-eo \
locale-indent-es \
locale-indent-et \
locale-indent-eu \
locale-indent-fi \
locale-indent-fr \
locale-indent-ga \
locale-indent-gl \
locale-indent-hr \
locale-indent-hu \
locale-indent-id \
locale-indent-it \
locale-indent-ja \
locale-indent-ko \
locale-indent-nl \
locale-indent-pl \
locale-indent-pt-BR \
locale-indent-ro \
locale-indent-ru \
locale-indent-sk \
locale-indent-sr \
locale-indent-sv \
locale-indent-tr \
locale-indent-uk \
locale-indent-vi \
locale-indent-zh-CN \
locale-indent-zh-TW"

RDEPENDS:${PN} += "indent"

inherit rpm
