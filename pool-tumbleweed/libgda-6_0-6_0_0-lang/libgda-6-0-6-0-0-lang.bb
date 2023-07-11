SUMMARY = "Translations for package libgda-6_0-6_0_0"
DESCRIPTION = "Provides translations for the 'libgda-6_0-6_0_0' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "6.0.0"

RPM_NAME = "libgda-6_0-6_0_0-lang-6.0.0-6.8.noarch.rpm"
RPM_HASH = "1a44aa310a0f7766fc60e5c3d2b9cc318bcf89fda79a169f0e68480a97fc693e2d3ceb72e717c3877096ca4320ec0fa447ce2a6d02ef027a263af946456e17ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgda-6-0-6-0-0-lang \
libgda-6-0-6-0-0-lang-all \
locale-libgda-6-0-6-0-0-ar \
locale-libgda-6-0-6-0-0-az \
locale-libgda-6-0-6-0-0-bs \
locale-libgda-6-0-6-0-0-ca \
locale-libgda-6-0-6-0-0-ca@valencia \
locale-libgda-6-0-6-0-0-cs \
locale-libgda-6-0-6-0-0-da \
locale-libgda-6-0-6-0-0-de \
locale-libgda-6-0-6-0-0-dz \
locale-libgda-6-0-6-0-0-el \
locale-libgda-6-0-6-0-0-en-CA \
locale-libgda-6-0-6-0-0-en-GB \
locale-libgda-6-0-6-0-0-eo \
locale-libgda-6-0-6-0-0-es \
locale-libgda-6-0-6-0-0-eu \
locale-libgda-6-0-6-0-0-fa \
locale-libgda-6-0-6-0-0-fi \
locale-libgda-6-0-6-0-0-fr \
locale-libgda-6-0-6-0-0-ga \
locale-libgda-6-0-6-0-0-gl \
locale-libgda-6-0-6-0-0-hr \
locale-libgda-6-0-6-0-0-hu \
locale-libgda-6-0-6-0-0-id \
locale-libgda-6-0-6-0-0-it \
locale-libgda-6-0-6-0-0-ja \
locale-libgda-6-0-6-0-0-ko \
locale-libgda-6-0-6-0-0-lt \
locale-libgda-6-0-6-0-0-lv \
locale-libgda-6-0-6-0-0-mk \
locale-libgda-6-0-6-0-0-ml \
locale-libgda-6-0-6-0-0-ms \
locale-libgda-6-0-6-0-0-nb \
locale-libgda-6-0-6-0-0-ne \
locale-libgda-6-0-6-0-0-nl \
locale-libgda-6-0-6-0-0-oc \
locale-libgda-6-0-6-0-0-pa \
locale-libgda-6-0-6-0-0-pt \
locale-libgda-6-0-6-0-0-pt-BR \
locale-libgda-6-0-6-0-0-ro \
locale-libgda-6-0-6-0-0-ru \
locale-libgda-6-0-6-0-0-sk \
locale-libgda-6-0-6-0-0-sl \
locale-libgda-6-0-6-0-0-sq \
locale-libgda-6-0-6-0-0-sr \
locale-libgda-6-0-6-0-0-sr@latin \
locale-libgda-6-0-6-0-0-sv \
locale-libgda-6-0-6-0-0-tr \
locale-libgda-6-0-6-0-0-uk \
locale-libgda-6-0-6-0-0-vi \
locale-libgda-6-0-6-0-0-zh-CN \
locale-libgda-6-0-6-0-0-zh-HK \
locale-libgda-6-0-6-0-0-zh-TW"

RDEPENDS:${PN} += "libgda-6-0-6-0-0"

inherit rpm
