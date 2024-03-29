SUMMARY = "Translations for package kubrick"
DESCRIPTION = "Provides translations for the 'kubrick' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kubrick-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "3fdf152b6b353d093ed7d34a8eaafc982c738fa66dc1a18d32fa656df51281a1253ddc3d8721747129f4967242d00f54b0487f7f8cb6503e047e8cf65c6f4a98"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kubrick-lang \
kubrick-lang-all \
locale-kubrick-bg \
locale-kubrick-bs \
locale-kubrick-ca \
locale-kubrick-ca@valencia \
locale-kubrick-cs \
locale-kubrick-da \
locale-kubrick-de \
locale-kubrick-el \
locale-kubrick-en-GB \
locale-kubrick-eo \
locale-kubrick-es \
locale-kubrick-et \
locale-kubrick-eu \
locale-kubrick-fi \
locale-kubrick-fr \
locale-kubrick-ga \
locale-kubrick-gl \
locale-kubrick-hr \
locale-kubrick-hu \
locale-kubrick-id \
locale-kubrick-is \
locale-kubrick-it \
locale-kubrick-ja \
locale-kubrick-ka \
locale-kubrick-kk \
locale-kubrick-km \
locale-kubrick-ko \
locale-kubrick-lt \
locale-kubrick-lv \
locale-kubrick-mai \
locale-kubrick-ml \
locale-kubrick-mr \
locale-kubrick-nb \
locale-kubrick-nds \
locale-kubrick-nl \
locale-kubrick-nn \
locale-kubrick-pl \
locale-kubrick-pt \
locale-kubrick-pt-BR \
locale-kubrick-ro \
locale-kubrick-ru \
locale-kubrick-sk \
locale-kubrick-sl \
locale-kubrick-sr \
locale-kubrick-sr@ijekavian \
locale-kubrick-sr@ijekavianlatin \
locale-kubrick-sr@latin \
locale-kubrick-sv \
locale-kubrick-tr \
locale-kubrick-ug \
locale-kubrick-uk \
locale-kubrick-zh-CN \
locale-kubrick-zh-TW"

RDEPENDS:${PN} += "kubrick"

inherit rpm
