SUMMARY = "Translations for package libKPim5SMTP5"
DESCRIPTION = "Provides translations for the 'libKPim5SMTP5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.3"

RPM_NAME = "libKPim5SMTP5-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "7b42d0bca262ea378027a3529e2c48abee5420eaef0a147399170a2d306f268c66b22b938a07dcfb015b60d3caae4b67f59c4ee0c55186699d29f1f414db817a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKPim5SMTP5-lang \
libKPim5SMTP5-lang-all \
locale-libKPim5SMTP5-ar \
locale-libKPim5SMTP5-bs \
locale-libKPim5SMTP5-ca \
locale-libKPim5SMTP5-ca@valencia \
locale-libKPim5SMTP5-cs \
locale-libKPim5SMTP5-de \
locale-libKPim5SMTP5-en-GB \
locale-libKPim5SMTP5-es \
locale-libKPim5SMTP5-et \
locale-libKPim5SMTP5-eu \
locale-libKPim5SMTP5-fi \
locale-libKPim5SMTP5-fr \
locale-libKPim5SMTP5-ga \
locale-libKPim5SMTP5-gl \
locale-libKPim5SMTP5-hi \
locale-libKPim5SMTP5-hu \
locale-libKPim5SMTP5-ia \
locale-libKPim5SMTP5-it \
locale-libKPim5SMTP5-ja \
locale-libKPim5SMTP5-ka \
locale-libKPim5SMTP5-km \
locale-libKPim5SMTP5-ko \
locale-libKPim5SMTP5-lt \
locale-libKPim5SMTP5-mr \
locale-libKPim5SMTP5-nds \
locale-libKPim5SMTP5-nl \
locale-libKPim5SMTP5-nn \
locale-libKPim5SMTP5-pl \
locale-libKPim5SMTP5-pt \
locale-libKPim5SMTP5-pt-BR \
locale-libKPim5SMTP5-ro \
locale-libKPim5SMTP5-ru \
locale-libKPim5SMTP5-sk \
locale-libKPim5SMTP5-sl \
locale-libKPim5SMTP5-sr \
locale-libKPim5SMTP5-sr@ijekavian \
locale-libKPim5SMTP5-sr@ijekavianlatin \
locale-libKPim5SMTP5-sr@latin \
locale-libKPim5SMTP5-sv \
locale-libKPim5SMTP5-ta \
locale-libKPim5SMTP5-tr \
locale-libKPim5SMTP5-ug \
locale-libKPim5SMTP5-uk \
locale-libKPim5SMTP5-zh-CN \
locale-libKPim5SMTP5-zh-TW"

RDEPENDS:${PN} += "libKPim5SMTP5"

inherit rpm
