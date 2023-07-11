SUMMARY = "Translations for package analitza"
DESCRIPTION = "Provides translations for the 'analitza' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "analitza-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "70b65593a51a5bc1c63632a2aacba008d03ccf4f971e9eec6f15283f904636480064d6b271cd17627dc9bcc68e6ee129fdb50f5640d2c20ea5a7f277b538d29b"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "analitza-lang \
analitza-lang-all \
locale-analitza-ar \
locale-analitza-bs \
locale-analitza-ca \
locale-analitza-ca@valencia \
locale-analitza-cs \
locale-analitza-da \
locale-analitza-de \
locale-analitza-el \
locale-analitza-en-GB \
locale-analitza-es \
locale-analitza-et \
locale-analitza-eu \
locale-analitza-fi \
locale-analitza-fr \
locale-analitza-ga \
locale-analitza-gl \
locale-analitza-hu \
locale-analitza-ia \
locale-analitza-it \
locale-analitza-ja \
locale-analitza-ka \
locale-analitza-kk \
locale-analitza-ko \
locale-analitza-lt \
locale-analitza-lv \
locale-analitza-ml \
locale-analitza-mr \
locale-analitza-nb \
locale-analitza-nds \
locale-analitza-nl \
locale-analitza-nn \
locale-analitza-pl \
locale-analitza-pt \
locale-analitza-pt-BR \
locale-analitza-ru \
locale-analitza-sk \
locale-analitza-sl \
locale-analitza-sv \
locale-analitza-tr \
locale-analitza-ug \
locale-analitza-uk \
locale-analitza-zh-CN \
locale-analitza-zh-TW"

RDEPENDS:${PN} += "analitza"

inherit rpm
