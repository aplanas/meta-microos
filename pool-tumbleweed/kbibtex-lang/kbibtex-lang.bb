SUMMARY = "Translations for package kbibtex"
DESCRIPTION = "Provides translations for the 'kbibtex' package."
LICENSE = "GPL-2.0-only"

PV = "0.9.3.2"

RPM_NAME = "kbibtex-lang-0.9.3.2-1.4.noarch.rpm"
RPM_HASH = "a3f9538eb7e7691617ad2ff8b6d8e8ccc6d0c320b04353cca345d598b7749cacd90b2efa82f0395b47b5418dc93a43bf91c561c523f9a9946651ad4b728af8ee"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kbibtex-lang \
kbibtex-lang-all \
locale-kbibtex-ast \
locale-kbibtex-bs \
locale-kbibtex-ca \
locale-kbibtex-ca@valencia \
locale-kbibtex-cs \
locale-kbibtex-de \
locale-kbibtex-en-GB \
locale-kbibtex-es \
locale-kbibtex-et \
locale-kbibtex-fi \
locale-kbibtex-fr \
locale-kbibtex-gl \
locale-kbibtex-hu \
locale-kbibtex-ia \
locale-kbibtex-it \
locale-kbibtex-ko \
locale-kbibtex-lt \
locale-kbibtex-nb \
locale-kbibtex-nl \
locale-kbibtex-pl \
locale-kbibtex-pt \
locale-kbibtex-pt-BR \
locale-kbibtex-ru \
locale-kbibtex-sk \
locale-kbibtex-sv \
locale-kbibtex-tr \
locale-kbibtex-uk \
locale-kbibtex-zh-CN"

RDEPENDS:${PN} += "kbibtex"

inherit rpm
