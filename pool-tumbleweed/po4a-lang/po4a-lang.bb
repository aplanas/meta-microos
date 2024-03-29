SUMMARY = "Translations for package po4a"
DESCRIPTION = "Provides translations for the 'po4a' package."
LICENSE = "GPL-2.0-only"

PV = "0.69"

RPM_NAME = "po4a-lang-0.69-1.4.noarch.rpm"
RPM_HASH = "7f8ef0a6509b1dc4788c25865b60ea4ae0bd59c24681e617fd66bed5602f242d72a06cba1c01a70b553a4ebc73bd1f87c7492d1f0256c4cab1a9325a2f20124a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-po4a-af \
locale-po4a-ar \
locale-po4a-ca \
locale-po4a-cs \
locale-po4a-da \
locale-po4a-de \
locale-po4a-eo \
locale-po4a-es \
locale-po4a-et \
locale-po4a-eu \
locale-po4a-fr \
locale-po4a-hr \
locale-po4a-hu \
locale-po4a-id \
locale-po4a-it \
locale-po4a-ja \
locale-po4a-ka \
locale-po4a-kn \
locale-po4a-ko \
locale-po4a-nb \
locale-po4a-nl \
locale-po4a-pl \
locale-po4a-pt \
locale-po4a-pt-BR \
locale-po4a-ru \
locale-po4a-sl \
locale-po4a-sv \
locale-po4a-uk \
locale-po4a-vi \
locale-po4a-zh-CN \
locale-po4a-zh-HK \
locale-po4a-zh-Hant \
po4a-lang \
po4a-lang-all"

RDEPENDS:${PN} += "po4a"

inherit rpm
