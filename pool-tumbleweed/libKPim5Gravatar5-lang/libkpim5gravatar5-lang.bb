SUMMARY = "Translations for package libKPim5Gravatar5"
DESCRIPTION = "Provides translations for the 'libKPim5Gravatar5' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5Gravatar5-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "fbcfbc4ad791d6416e354db06a5ad95daf79a9d0ad5fac70dead5f5c52ece66b47db3204fb52c5c46cdb9f51033541ed22fc3d7582487dd8c104ea48575e43f7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5Gravatar5-lang \
libKPim5Gravatar5-lang-all \
locale-libKPim5Gravatar5-ar \
locale-libKPim5Gravatar5-ca \
locale-libKPim5Gravatar5-ca@valencia \
locale-libKPim5Gravatar5-cs \
locale-libKPim5Gravatar5-da \
locale-libKPim5Gravatar5-de \
locale-libKPim5Gravatar5-el \
locale-libKPim5Gravatar5-en-GB \
locale-libKPim5Gravatar5-es \
locale-libKPim5Gravatar5-et \
locale-libKPim5Gravatar5-eu \
locale-libKPim5Gravatar5-fi \
locale-libKPim5Gravatar5-fr \
locale-libKPim5Gravatar5-gl \
locale-libKPim5Gravatar5-hi \
locale-libKPim5Gravatar5-hu \
locale-libKPim5Gravatar5-ia \
locale-libKPim5Gravatar5-is \
locale-libKPim5Gravatar5-it \
locale-libKPim5Gravatar5-ja \
locale-libKPim5Gravatar5-ka \
locale-libKPim5Gravatar5-ko \
locale-libKPim5Gravatar5-lt \
locale-libKPim5Gravatar5-nl \
locale-libKPim5Gravatar5-nn \
locale-libKPim5Gravatar5-pl \
locale-libKPim5Gravatar5-pt \
locale-libKPim5Gravatar5-pt-BR \
locale-libKPim5Gravatar5-ro \
locale-libKPim5Gravatar5-ru \
locale-libKPim5Gravatar5-sk \
locale-libKPim5Gravatar5-sl \
locale-libKPim5Gravatar5-sr \
locale-libKPim5Gravatar5-sr@ijekavian \
locale-libKPim5Gravatar5-sr@ijekavianlatin \
locale-libKPim5Gravatar5-sr@latin \
locale-libKPim5Gravatar5-sv \
locale-libKPim5Gravatar5-tr \
locale-libKPim5Gravatar5-uk \
locale-libKPim5Gravatar5-zh-CN \
locale-libKPim5Gravatar5-zh-TW"

RDEPENDS:${PN} += "libKPim5Gravatar5"

inherit rpm
