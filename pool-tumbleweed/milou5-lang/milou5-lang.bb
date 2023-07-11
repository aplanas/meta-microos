SUMMARY = "Translations for package milou5"
DESCRIPTION = "Provides translations for the 'milou5' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "5.27.6"

RPM_NAME = "milou5-lang-5.27.6-1.1.noarch.rpm"
RPM_HASH = "076ccf4920606bdaea108ab77036b09634d5c490cd0cee4a2beed7c7ec63bc4e77ddaf99224464b32bcbb434e7bd307d07e626e4d8e0ed948f28a6d26a1cf530"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-milou5-ar \
locale-milou5-bg \
locale-milou5-bs \
locale-milou5-ca \
locale-milou5-ca@valencia \
locale-milou5-cs \
locale-milou5-da \
locale-milou5-de \
locale-milou5-el \
locale-milou5-en-GB \
locale-milou5-es \
locale-milou5-et \
locale-milou5-eu \
locale-milou5-fi \
locale-milou5-fr \
locale-milou5-gl \
locale-milou5-he \
locale-milou5-hi \
locale-milou5-hu \
locale-milou5-ia \
locale-milou5-id \
locale-milou5-it \
locale-milou5-ja \
locale-milou5-ka \
locale-milou5-ko \
locale-milou5-lt \
locale-milou5-ml \
locale-milou5-nb \
locale-milou5-nds \
locale-milou5-nl \
locale-milou5-nn \
locale-milou5-pa \
locale-milou5-pl \
locale-milou5-pt \
locale-milou5-pt-BR \
locale-milou5-ro \
locale-milou5-ru \
locale-milou5-sk \
locale-milou5-sl \
locale-milou5-sr \
locale-milou5-sr@ijekavian \
locale-milou5-sr@ijekavianlatin \
locale-milou5-sr@latin \
locale-milou5-sv \
locale-milou5-tr \
locale-milou5-uk \
locale-milou5-zh-CN \
locale-milou5-zh-TW \
milou5-lang \
milou5-lang-all"

RDEPENDS:${PN} += "milou5"

inherit rpm
