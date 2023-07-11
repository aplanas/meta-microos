SUMMARY = "Translations for package tar"
DESCRIPTION = "Provides translations for the 'tar' package."
LICENSE = "GPL-3.0-or-later"

PV = "1.34"

RPM_NAME = "tar-lang-1.34-10.4.noarch.rpm"
RPM_HASH = "fb3b5227ed34f7bea78c396a0dcd949474ed235d1810c693e5ca7f465719ec80f1e78ddf99ea1b2460283df836aa6457b653aa1a6673bce1169e436f5065dd50"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tar-bg \
locale-tar-ca \
locale-tar-cs \
locale-tar-da \
locale-tar-de \
locale-tar-el \
locale-tar-eo \
locale-tar-es \
locale-tar-et \
locale-tar-eu \
locale-tar-fi \
locale-tar-fr \
locale-tar-ga \
locale-tar-gl \
locale-tar-hr \
locale-tar-hu \
locale-tar-id \
locale-tar-it \
locale-tar-ja \
locale-tar-ko \
locale-tar-ms \
locale-tar-nb \
locale-tar-nl \
locale-tar-pl \
locale-tar-pt \
locale-tar-pt-BR \
locale-tar-ro \
locale-tar-ru \
locale-tar-sk \
locale-tar-sl \
locale-tar-sr \
locale-tar-sv \
locale-tar-tr \
locale-tar-uk \
locale-tar-vi \
locale-tar-zh-CN \
locale-tar-zh-TW \
tar-lang \
tar-lang-all"

RDEPENDS:${PN} += "tar"

inherit rpm
