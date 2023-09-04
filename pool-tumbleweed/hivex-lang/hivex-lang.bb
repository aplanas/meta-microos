SUMMARY = "Translations for package hivex"
DESCRIPTION = "Provides translations for the 'hivex' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "hivex-lang-1.3.23-2.6.noarch.rpm"
RPM_HASH = "b366ce12c6cb0725a846969fe288817b2f02524df358a093de0ce9b12761945f45f9839e0900cce8ee0999905d32b19824ada951030c7c916ecc1216544b7276"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "hivex-lang \
hivex-lang-all \
locale-hivex-ca \
locale-hivex-cs \
locale-hivex-de \
locale-hivex-es \
locale-hivex-eu \
locale-hivex-fr \
locale-hivex-gu \
locale-hivex-hi \
locale-hivex-hu \
locale-hivex-ja \
locale-hivex-ka \
locale-hivex-kn \
locale-hivex-ml \
locale-hivex-mr \
locale-hivex-nl \
locale-hivex-or \
locale-hivex-pl \
locale-hivex-pt \
locale-hivex-pt-BR \
locale-hivex-ru \
locale-hivex-si \
locale-hivex-sr \
locale-hivex-uk \
locale-hivex-zh-CN"

RDEPENDS:${PN} += "hivex"

inherit rpm
