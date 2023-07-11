SUMMARY = "Translations for package kopeninghours"
DESCRIPTION = "Provides translations for the 'kopeninghours' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kopeninghours-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "56ad13c8c87293718691a01da01319ff52ff95331d47f27bb9d157073758bef1185555a3a43fdc6fcb931d92672aa0450759184fb5ab74ecc88a7c415b2e0c9e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kopeninghours-lang \
kopeninghours-lang-all \
locale-kopeninghours-ca \
locale-kopeninghours-ca@valencia \
locale-kopeninghours-cs \
locale-kopeninghours-de \
locale-kopeninghours-en-GB \
locale-kopeninghours-es \
locale-kopeninghours-eu \
locale-kopeninghours-fi \
locale-kopeninghours-fr \
locale-kopeninghours-gl \
locale-kopeninghours-hi \
locale-kopeninghours-it \
locale-kopeninghours-ja \
locale-kopeninghours-ka \
locale-kopeninghours-ko \
locale-kopeninghours-lt \
locale-kopeninghours-nl \
locale-kopeninghours-nn \
locale-kopeninghours-pl \
locale-kopeninghours-pt \
locale-kopeninghours-pt-BR \
locale-kopeninghours-ro \
locale-kopeninghours-ru \
locale-kopeninghours-sk \
locale-kopeninghours-sl \
locale-kopeninghours-sv \
locale-kopeninghours-tr \
locale-kopeninghours-uk \
locale-kopeninghours-zh-CN \
locale-kopeninghours-zh-TW"

RDEPENDS:${PN} += "kopeninghours"

inherit rpm
