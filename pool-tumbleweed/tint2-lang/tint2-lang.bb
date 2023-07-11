SUMMARY = "Translations for package tint2"
DESCRIPTION = "Provides translations for the 'tint2' package."
LICENSE = "GPL-2.0-only"

PV = "17.0.2"

RPM_NAME = "tint2-lang-17.0.2-1.8.noarch.rpm"
RPM_HASH = "05ad37eca3b347cbe6d207eb1c3f8effad840f306ec933f67feed6ae8632f166776e908043c2a0950c90a19e8bd36f35c7de55d774b2dfa1ca9da1051763b3b3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-tint2-bs \
locale-tint2-es \
locale-tint2-fr \
locale-tint2-hr \
locale-tint2-pl \
locale-tint2-ru \
locale-tint2-sr \
tint2-lang \
tint2-lang-all"

RDEPENDS:${PN} += "tint2"

inherit rpm
