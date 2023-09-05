SUMMARY = "Translations for package zanshin"
DESCRIPTION = "Provides translations for the 'zanshin' package."
LICENSE = "GPL-2.0-only"

PV = "23.08.0"

RPM_NAME = "zanshin-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "5672331c5d8332ba6f2e51d9161c130890249dd1892ab3b8b9641a1029441f7d296f4fe50dae2693514d7f1ef8d22b777e17782e20b47e517fb12cf4bb6d8af6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-zanshin-bg \
locale-zanshin-bs \
locale-zanshin-ca \
locale-zanshin-ca@valencia \
locale-zanshin-cs \
locale-zanshin-da \
locale-zanshin-de \
locale-zanshin-en-GB \
locale-zanshin-es \
locale-zanshin-et \
locale-zanshin-eu \
locale-zanshin-fi \
locale-zanshin-fr \
locale-zanshin-ga \
locale-zanshin-gl \
locale-zanshin-hu \
locale-zanshin-ia \
locale-zanshin-it \
locale-zanshin-ja \
locale-zanshin-ka \
locale-zanshin-ko \
locale-zanshin-lt \
locale-zanshin-mr \
locale-zanshin-nb \
locale-zanshin-nds \
locale-zanshin-nl \
locale-zanshin-nn \
locale-zanshin-pl \
locale-zanshin-pt \
locale-zanshin-pt-BR \
locale-zanshin-ru \
locale-zanshin-sk \
locale-zanshin-sl \
locale-zanshin-sv \
locale-zanshin-tr \
locale-zanshin-ug \
locale-zanshin-uk \
locale-zanshin-zh-CN \
locale-zanshin-zh-TW \
zanshin-lang \
zanshin-lang-all"

RDEPENDS:${PN} += "zanshin"

inherit rpm
