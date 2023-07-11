SUMMARY = "Translations for package kproperty"
DESCRIPTION = "Provides translations for the 'kproperty' package."
LICENSE = "LGPL-2.0-only"

PV = "3.2.0"

RPM_NAME = "kproperty-lang-3.2.0-2.22.noarch.rpm"
RPM_HASH = "57721b9df8755f186c6508b6751e77ce77ac0c2ea8b3f16284b5eae09c44c3fd59c9eb5720d95851f022863ade6859d1792d328e22614c53ce1d536a89fe81a5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kproperty-lang \
kproperty-lang-all \
locale-kproperty-ast \
locale-kproperty-ca \
locale-kproperty-ca@valencia \
locale-kproperty-cs \
locale-kproperty-de \
locale-kproperty-en-GB \
locale-kproperty-es \
locale-kproperty-fi \
locale-kproperty-fr \
locale-kproperty-gl \
locale-kproperty-ia \
locale-kproperty-it \
locale-kproperty-ja \
locale-kproperty-ko \
locale-kproperty-lt \
locale-kproperty-nl \
locale-kproperty-nn \
locale-kproperty-pl \
locale-kproperty-pt \
locale-kproperty-pt-BR \
locale-kproperty-ru \
locale-kproperty-sk \
locale-kproperty-sv \
locale-kproperty-tr \
locale-kproperty-uk \
locale-kproperty-zh-CN \
locale-kproperty-zh-TW"

RDEPENDS:${PN} += "kproperty"

inherit rpm
