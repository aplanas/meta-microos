SUMMARY = "Translations for package libfm"
DESCRIPTION = "Provides translations for the 'libfm' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.2"

RPM_NAME = "libfm-lang-1.3.2-1.13.noarch.rpm"
RPM_HASH = "6d792b3d0dfc4a74f953d59123ec8784a6195ee38b86f9c1b73d7b1cb4414cface1d589fdbb204cb45ee055c33ea14ef2fd8147cc5c758241fddbdc55b064fd1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libfm-lang \
libfm-lang-all \
locale-libfm-af \
locale-libfm-ar \
locale-libfm-be \
locale-libfm-bg \
locale-libfm-bn \
locale-libfm-bn-IN \
locale-libfm-ca \
locale-libfm-cs \
locale-libfm-da \
locale-libfm-de \
locale-libfm-el \
locale-libfm-en-GB \
locale-libfm-es \
locale-libfm-et \
locale-libfm-eu \
locale-libfm-fa \
locale-libfm-fi \
locale-libfm-fr \
locale-libfm-gl \
locale-libfm-he \
locale-libfm-hr \
locale-libfm-hu \
locale-libfm-id \
locale-libfm-is \
locale-libfm-it \
locale-libfm-ja \
locale-libfm-kk \
locale-libfm-ko \
locale-libfm-lt \
locale-libfm-ml \
locale-libfm-ms \
locale-libfm-nb \
locale-libfm-nl \
locale-libfm-nn \
locale-libfm-pa \
locale-libfm-pl \
locale-libfm-pt \
locale-libfm-pt-BR \
locale-libfm-ro \
locale-libfm-ru \
locale-libfm-sk \
locale-libfm-sl \
locale-libfm-sr \
locale-libfm-sr@latin \
locale-libfm-sv \
locale-libfm-te \
locale-libfm-th \
locale-libfm-tr \
locale-libfm-ug \
locale-libfm-uk \
locale-libfm-vi \
locale-libfm-zh-CN \
locale-libfm-zh-TW"

RDEPENDS:${PN} += "libfm"

inherit rpm
