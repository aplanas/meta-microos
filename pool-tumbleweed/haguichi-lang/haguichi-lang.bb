SUMMARY = "Translations for package haguichi"
DESCRIPTION = "Provides translations for the 'haguichi' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.4.6"

RPM_NAME = "haguichi-lang-1.4.6-1.2.noarch.rpm"
RPM_HASH = "6aeec478cac845d00fdcf816e8cb031e66bdce2aac874e0ff438ca1723fd40fc1896d62cc9d6ac9857351743f10ca4caf0ff02dfcc670d3d11ee1701ba0a79e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "haguichi-lang \
haguichi-lang-all \
locale-haguichi-ast \
locale-haguichi-bg \
locale-haguichi-cs \
locale-haguichi-de \
locale-haguichi-es \
locale-haguichi-fr \
locale-haguichi-id \
locale-haguichi-it \
locale-haguichi-ja \
locale-haguichi-kk \
locale-haguichi-lt \
locale-haguichi-nl \
locale-haguichi-pl \
locale-haguichi-pt \
locale-haguichi-pt-BR \
locale-haguichi-ru \
locale-haguichi-sk \
locale-haguichi-sv \
locale-haguichi-tr \
locale-haguichi-uk"

RDEPENDS:${PN} += "haguichi"

inherit rpm
