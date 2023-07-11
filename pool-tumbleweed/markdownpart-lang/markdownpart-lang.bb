SUMMARY = "Translations for package markdownpart"
DESCRIPTION = "Provides translations for the 'markdownpart' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "markdownpart-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "494d52d93525d4cf90fd721707f37ee0bcd6c0187248b21662a6815bd15a3660d0838a953568ced17074217aa942cb209f1ecadf601f1a29d0882e9c3cbed607"
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
