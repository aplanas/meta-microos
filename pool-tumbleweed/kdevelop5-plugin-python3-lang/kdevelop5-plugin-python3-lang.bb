SUMMARY = "Translations for package kdevelop5-plugin-python3"
DESCRIPTION = "Provides translations to the package kdevelop5-plugin-python3"
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdevelop5-plugin-python3-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "438d8ef86fdb43774c716a95b382eee2967056c5bf7d9629308bdcc7cf6c2d64547ed5625d4c3a28d99e9e1cb265623e72b9ccc6427e76088c0247436bfa5762"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevelop5-plugin-python3-lang \
kdevelop5-plugin-python3-lang-all \
locale-kdevelop5-plugin-python3-bs \
locale-kdevelop5-plugin-python3-ca \
locale-kdevelop5-plugin-python3-ca@valencia \
locale-kdevelop5-plugin-python3-cs \
locale-kdevelop5-plugin-python3-da \
locale-kdevelop5-plugin-python3-de \
locale-kdevelop5-plugin-python3-en-GB \
locale-kdevelop5-plugin-python3-eo \
locale-kdevelop5-plugin-python3-es \
locale-kdevelop5-plugin-python3-et \
locale-kdevelop5-plugin-python3-eu \
locale-kdevelop5-plugin-python3-fi \
locale-kdevelop5-plugin-python3-fr \
locale-kdevelop5-plugin-python3-ga \
locale-kdevelop5-plugin-python3-gl \
locale-kdevelop5-plugin-python3-hu \
locale-kdevelop5-plugin-python3-it \
locale-kdevelop5-plugin-python3-ja \
locale-kdevelop5-plugin-python3-ka \
locale-kdevelop5-plugin-python3-kk \
locale-kdevelop5-plugin-python3-ko \
locale-kdevelop5-plugin-python3-lt \
locale-kdevelop5-plugin-python3-mai \
locale-kdevelop5-plugin-python3-mr \
locale-kdevelop5-plugin-python3-nds \
locale-kdevelop5-plugin-python3-nl \
locale-kdevelop5-plugin-python3-nn \
locale-kdevelop5-plugin-python3-pl \
locale-kdevelop5-plugin-python3-pt \
locale-kdevelop5-plugin-python3-pt-BR \
locale-kdevelop5-plugin-python3-ro \
locale-kdevelop5-plugin-python3-ru \
locale-kdevelop5-plugin-python3-sk \
locale-kdevelop5-plugin-python3-sl \
locale-kdevelop5-plugin-python3-sv \
locale-kdevelop5-plugin-python3-th \
locale-kdevelop5-plugin-python3-tr \
locale-kdevelop5-plugin-python3-ug \
locale-kdevelop5-plugin-python3-uk \
locale-kdevelop5-plugin-python3-zh-CN \
locale-kdevelop5-plugin-python3-zh-TW"

RDEPENDS:${PN} += "kdevelop5-plugin-python3"

inherit rpm
