SUMMARY = "Translations for package alkimia"
DESCRIPTION = "Provides translations for the 'alkimia' package."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.1"

RPM_NAME = "alkimia-lang-8.1.1-1.5.noarch.rpm"
RPM_HASH = "3a4829c2a77935949472180cbf7881269d1177494ecdca220e36278d6f37a37453285f3c6acd7cbe13eddaa601d268cc7038ce50ff333076af6100d35700af0e"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alkimia-lang \
alkimia-lang-all \
locale-alkimia-ca \
locale-alkimia-ca@valencia \
locale-alkimia-cs \
locale-alkimia-de \
locale-alkimia-el \
locale-alkimia-en-GB \
locale-alkimia-es \
locale-alkimia-et \
locale-alkimia-fi \
locale-alkimia-fr \
locale-alkimia-gl \
locale-alkimia-hu \
locale-alkimia-ia \
locale-alkimia-it \
locale-alkimia-ko \
locale-alkimia-nl \
locale-alkimia-nn \
locale-alkimia-pl \
locale-alkimia-pt \
locale-alkimia-pt-BR \
locale-alkimia-ru \
locale-alkimia-sk \
locale-alkimia-sl \
locale-alkimia-sv \
locale-alkimia-uk \
locale-alkimia-zh-CN \
locale-alkimia-zh-TW"

RDEPENDS:${PN} += "alkimia"

inherit rpm
