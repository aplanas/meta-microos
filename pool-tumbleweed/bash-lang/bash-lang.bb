SUMMARY = "Translations for package bash"
DESCRIPTION = "Provides translations for the 'bash' package."
LICENSE = "GPL-3.0-or-later"

PV = "5.2.15"

RPM_NAME = "bash-lang-5.2.15-8.6.noarch.rpm"
RPM_HASH = "be2ce1b65e82e4368a75ae4d43d087074c31d3dffb7dd15f77dfeb71efb3cc213bc1107717a82ce82abe71d17f2849edb5d32a5c05a1bc748db4a0350e76d39b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "bash-lang \
bash-lang-all \
locale-bash-af \
locale-bash-bg \
locale-bash-ca \
locale-bash-cs \
locale-bash-da \
locale-bash-de \
locale-bash-el \
locale-bash-en@boldquot \
locale-bash-en@quot \
locale-bash-eo \
locale-bash-es \
locale-bash-et \
locale-bash-fi \
locale-bash-fr \
locale-bash-ga \
locale-bash-gl \
locale-bash-hr \
locale-bash-hu \
locale-bash-id \
locale-bash-it \
locale-bash-ja \
locale-bash-ko \
locale-bash-lt \
locale-bash-nb \
locale-bash-nl \
locale-bash-pl \
locale-bash-pt \
locale-bash-pt-BR \
locale-bash-ro \
locale-bash-ru \
locale-bash-sk \
locale-bash-sl \
locale-bash-sr \
locale-bash-sv \
locale-bash-tr \
locale-bash-uk \
locale-bash-vi \
locale-bash-zh-CN \
locale-bash-zh-TW"

RDEPENDS:${PN} += "bash"

inherit rpm
