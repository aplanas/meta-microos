SUMMARY = "Translations for package reco"
DESCRIPTION = "Provides translations for the 'reco' package."
LICENSE = "GPL-3.0-or-later"

PV = "3.2.1"

RPM_NAME = "reco-lang-3.2.1-1.8.noarch.rpm"
RPM_HASH = "a2e7ba2463df49dde34a843aafa8c74f8609a9eb8e754446d41e33e33f7d36dffd028174be835efb3b741acd063261fd2cf5aa432f8e8021426f98f1add225af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-reco-ca \
locale-reco-es \
locale-reco-fr \
locale-reco-it \
locale-reco-ja \
locale-reco-lt \
locale-reco-nl \
locale-reco-pl \
locale-reco-pt \
locale-reco-pt-BR \
locale-reco-ru \
locale-reco-tr \
reco-lang \
reco-lang-all"

RDEPENDS:${PN} += "reco"

inherit rpm
