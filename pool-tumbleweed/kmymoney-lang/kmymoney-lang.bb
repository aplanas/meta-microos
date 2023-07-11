SUMMARY = "Translations for package kmymoney"
DESCRIPTION = "Provides translations for the 'kmymoney' package."
LICENSE = "GPL-2.0-only | GPL-3.0-only"

PV = "5.1.3"

RPM_NAME = "kmymoney-lang-5.1.3-2.12.noarch.rpm"
RPM_HASH = "38462095293e45429bbec235eb5e721cb73ab80d27f9195ed9ee0c01d23efdb108ebf61e8b6efa2cbeaa8ff62aa36ebf6002db10e526caae9af9320e3b834567"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kmymoney-lang \
kmymoney-lang-all \
locale-kmymoney-ar \
locale-kmymoney-ast \
locale-kmymoney-bg \
locale-kmymoney-bs \
locale-kmymoney-ca \
locale-kmymoney-ca@valencia \
locale-kmymoney-cs \
locale-kmymoney-da \
locale-kmymoney-de \
locale-kmymoney-el \
locale-kmymoney-en-GB \
locale-kmymoney-eo \
locale-kmymoney-es \
locale-kmymoney-et \
locale-kmymoney-eu \
locale-kmymoney-fi \
locale-kmymoney-fr \
locale-kmymoney-ga \
locale-kmymoney-gl \
locale-kmymoney-hu \
locale-kmymoney-ia \
locale-kmymoney-it \
locale-kmymoney-kk \
locale-kmymoney-ko \
locale-kmymoney-lt \
locale-kmymoney-mr \
locale-kmymoney-ms \
locale-kmymoney-nds \
locale-kmymoney-nl \
locale-kmymoney-pl \
locale-kmymoney-pt \
locale-kmymoney-pt-BR \
locale-kmymoney-ro \
locale-kmymoney-ru \
locale-kmymoney-sk \
locale-kmymoney-sl \
locale-kmymoney-sv \
locale-kmymoney-tr \
locale-kmymoney-ug \
locale-kmymoney-uk \
locale-kmymoney-zh-CN \
locale-kmymoney-zh-TW"

RDEPENDS:${PN} += "kmymoney"

inherit rpm
