SUMMARY = "Translations for package goodvibes"
DESCRIPTION = "Provides translations for the 'goodvibes' package."
LICENSE = "GPL-3.0-only"

PV = "0.7.6"

RPM_NAME = "goodvibes-lang-0.7.6-1.4.noarch.rpm"
RPM_HASH = "5e981cf71f40a58b762d82054ea3b094d48d0ff1a9ad1612f02e5e34c154b0168c23e71aed424d7db1c6264ba491b4c770301635844f2eb699acf58488ecc2fa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "goodvibes-lang \
goodvibes-lang-all \
locale-goodvibes-ca \
locale-goodvibes-cs \
locale-goodvibes-da \
locale-goodvibes-de \
locale-goodvibes-en-US \
locale-goodvibes-es \
locale-goodvibes-fi \
locale-goodvibes-fr \
locale-goodvibes-hr \
locale-goodvibes-hu \
locale-goodvibes-id \
locale-goodvibes-it \
locale-goodvibes-mr \
locale-goodvibes-nb-NO \
locale-goodvibes-nl \
locale-goodvibes-pl \
locale-goodvibes-pt \
locale-goodvibes-pt-BR \
locale-goodvibes-pt-PT \
locale-goodvibes-ru \
locale-goodvibes-sk \
locale-goodvibes-te \
locale-goodvibes-tr \
locale-goodvibes-zh-Hant"

RDEPENDS:${PN} += "goodvibes"

inherit rpm
