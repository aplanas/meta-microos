SUMMARY = "Translations for package trader"
DESCRIPTION = "Provides translations for the 'trader' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.18"

RPM_NAME = "trader-lang-7.18-1.3.noarch.rpm"
RPM_HASH = "f92cf03d25e03d992bf0a115854ab961c01863c3857c2b2c1c63768787c0a2c9dc5911c48a1f4103591d3b393b166d50c22163e0a1f136ff1c2fa181bf303665"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-trader-da \
locale-trader-de \
locale-trader-en-AU \
locale-trader-en-CA \
locale-trader-en-GB \
locale-trader-en-US \
locale-trader-en@quot \
locale-trader-eo \
locale-trader-fi \
locale-trader-fr \
locale-trader-hr \
locale-trader-hu \
locale-trader-nb \
locale-trader-pt-BR \
locale-trader-ru \
locale-trader-sr \
locale-trader-sv \
trader-lang \
trader-lang-all"

RDEPENDS:${PN} += "trader"

inherit rpm
