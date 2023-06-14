SUMMARY = "Translations for package markdownpart"
DESCRIPTION = "Provides translations for the 'markdownpart' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "markdownpart-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "f3f218df7b3fd41e32a00c6664d41b40c870ca914e1a8067832d9486c2e89950a7257a54152b144633a356a6a5074f70606e22ed54dcd2944df54f06fa96b0e0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-markdownpart-ar \
locale-markdownpart-ca \
locale-markdownpart-ca@valencia \
locale-markdownpart-cs \
locale-markdownpart-de \
locale-markdownpart-el \
locale-markdownpart-en-GB \
locale-markdownpart-es \
locale-markdownpart-et \
locale-markdownpart-eu \
locale-markdownpart-fi \
locale-markdownpart-fr \
locale-markdownpart-gl \
locale-markdownpart-hi \
locale-markdownpart-it \
locale-markdownpart-ja \
locale-markdownpart-ka \
locale-markdownpart-ko \
locale-markdownpart-lt \
locale-markdownpart-nl \
locale-markdownpart-nn \
locale-markdownpart-pl \
locale-markdownpart-pt \
locale-markdownpart-pt-BR \
locale-markdownpart-ro \
locale-markdownpart-ru \
locale-markdownpart-sk \
locale-markdownpart-sl \
locale-markdownpart-sv \
locale-markdownpart-tr \
locale-markdownpart-uk \
locale-markdownpart-vi \
locale-markdownpart-zh-CN \
locale-markdownpart-zh-TW \
markdownpart-lang \
markdownpart-lang-all"

RDEPENDS:${PN} += "markdownpart"

inherit rpm
