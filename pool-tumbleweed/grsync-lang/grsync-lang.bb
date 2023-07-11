SUMMARY = "Translations for package grsync"
DESCRIPTION = "Provides translations for the 'grsync' package."
LICENSE = "GPL-2.0-only"

PV = "1.3.0"

RPM_NAME = "grsync-lang-1.3.0-1.13.noarch.rpm"
RPM_HASH = "49bb6eabe99bec12dcd5196e49d53ad24bba80aa353162c51ffce1c6ce95d0a33d851935c8f3ef211cdc3a5e64bd4a475f4e79bbb86ea532233146df147d81cc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "grsync-lang \
grsync-lang-all \
locale-grsync-ca \
locale-grsync-cs \
locale-grsync-de \
locale-grsync-es \
locale-grsync-fr \
locale-grsync-gl \
locale-grsync-hr \
locale-grsync-hu \
locale-grsync-id \
locale-grsync-it \
locale-grsync-nb \
locale-grsync-nl \
locale-grsync-pt-BR \
locale-grsync-ru \
locale-grsync-sv \
locale-grsync-tr \
locale-grsync-zh-CN \
locale-grsync-zh-TW"

RDEPENDS:${PN} += "grsync"

inherit rpm
