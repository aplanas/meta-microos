SUMMARY = "Translations for package net6"
DESCRIPTION = "Provides translations for the 'net6' package."
LICENSE = "LGPL-2.1+"

PV = "1.3.14"

RPM_NAME = "net6-lang-1.3.14-12.27.noarch.rpm"
RPM_HASH = "9e34886ad9d96b0b34e7b31388b4618edac2655b9bdf7a6e147b23a904a79c702bb3710614c34a0773ef782c2b7b57753be46c44452788e8f4f271b6c8b29894"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-net6-ast \
locale-net6-de \
locale-net6-en-GB \
locale-net6-es \
locale-net6-fr \
locale-net6-he \
locale-net6-it \
locale-net6-ko \
locale-net6-nb \
locale-net6-nl \
locale-net6-pt \
locale-net6-pt-BR \
locale-net6-ru \
locale-net6-sk \
locale-net6-sv \
locale-net6-uk \
locale-net6-zh-CN \
net6-lang \
net6-lang-all"

RDEPENDS:${PN} += "net6"

inherit rpm
