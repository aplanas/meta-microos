SUMMARY = "Translations for package hivex"
DESCRIPTION = "Provides translations for the 'hivex' package."
LICENSE = "GPL-2.0-only & LGPL-2.1-only"

PV = "1.3.23"

RPM_NAME = "hivex-lang-1.3.23-2.3.noarch.rpm"
RPM_HASH = "d440ab393485dfb66f28cd1b0947abb2fdebf1ba88294cb1101cb07b89df6d4c538051cbcef386932a14e3d41ff6cf0677f4a7604f036dd0303a0b1f944623b7"
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
