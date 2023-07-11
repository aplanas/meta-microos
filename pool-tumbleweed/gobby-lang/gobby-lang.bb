SUMMARY = "Translations for package gobby"
DESCRIPTION = "Provides translations for the 'gobby' package."
LICENSE = "GPL-2.0-or-later & ISC"

PV = "0.5.1+20180826.d16519e"

RPM_NAME = "gobby-lang-0.5.1+20180826.d16519e-2.12.noarch.rpm"
RPM_HASH = "831f1232c781d05576227a8f8df0f69610d969cdc91ee3e5d08adab2e36f442290c3051264de52b39995a7c655babb639d8feac98f42613935e7de757ab1d969"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gobby-lang \
gobby-lang-all \
locale-gobby-ca \
locale-gobby-de \
locale-gobby-el-GR \
locale-gobby-en-GB \
locale-gobby-fr \
locale-gobby-it-IT \
locale-gobby-ja \
locale-gobby-pt-BR \
locale-gobby-zh-TW"

RDEPENDS:${PN} += "gobby"

inherit rpm
