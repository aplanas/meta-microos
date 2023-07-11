SUMMARY = "Translations for package trader"
DESCRIPTION = "Provides translations for the 'trader' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.18"

RPM_NAME = "trader-lang-7.18-1.4.noarch.rpm"
RPM_HASH = "796c8b466698649c13b974613edf7233005464680e62b40fd59c89fd4ff62c5d962c11dd52182c54481bbaa3fbbf9ce0192328a253871519b408bb766f7b2dff"
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
