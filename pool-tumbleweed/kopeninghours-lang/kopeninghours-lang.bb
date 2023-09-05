SUMMARY = "Translations for package kopeninghours"
DESCRIPTION = "Provides translations for the 'kopeninghours' package."
LICENSE = "LGPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kopeninghours-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "908de39bee10104ed4826d5df00d1a31c887024e9bb608a153146de0dc2334659f20a0f2b11c778c360dc7fbd72bfcbe200305d68d7403f4f13e2065bc8d8086"
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
