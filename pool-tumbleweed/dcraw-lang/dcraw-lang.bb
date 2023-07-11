SUMMARY = "Translations for package dcraw"
DESCRIPTION = "Provides translations for the 'dcraw' package."
LICENSE = "GPL-2.0-or-later"

PV = "9.28.0"

RPM_NAME = "dcraw-lang-9.28.0-2.8.noarch.rpm"
RPM_HASH = "4d01228bc728577bf893ebaefe852e7e00ea6eda2aa006137a32dcc07c3d6a402a98e3fcaf9a81c693d868249fed338f105f2abd2beafac09f6413dea452356d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dcraw-lang \
dcraw-lang-all \
locale-dcraw-ca \
locale-dcraw-cs \
locale-dcraw-da \
locale-dcraw-de \
locale-dcraw-eo \
locale-dcraw-es \
locale-dcraw-fr \
locale-dcraw-hu \
locale-dcraw-it \
locale-dcraw-ja \
locale-dcraw-nl \
locale-dcraw-pl \
locale-dcraw-pt \
locale-dcraw-ro \
locale-dcraw-ru \
locale-dcraw-sv \
locale-dcraw-zh-CN \
locale-dcraw-zh-TW"

RDEPENDS:${PN} += "dcraw"

inherit rpm
