SUMMARY = "Translations for package secrets"
DESCRIPTION = "Provides translations for the 'secrets' package."
LICENSE = "GPL-3.0-or-later"

PV = "7.3"

RPM_NAME = "secrets-lang-7.3-1.2.noarch.rpm"
RPM_HASH = "55a0c706f63c86ec116c15985ff4087811e33f91da7eb937a0db5abd8c4fd673804e70bd703576cecc9def829bcf384435fcc607182aa01e10a37653501e4862"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale-secrets-ca \
locale-secrets-cs \
locale-secrets-da \
locale-secrets-de \
locale-secrets-el \
locale-secrets-en-GB \
locale-secrets-es \
locale-secrets-eu \
locale-secrets-fi \
locale-secrets-fr \
locale-secrets-gl \
locale-secrets-he \
locale-secrets-hr \
locale-secrets-hu \
locale-secrets-id \
locale-secrets-is \
locale-secrets-it \
locale-secrets-ka \
locale-secrets-ko \
locale-secrets-nb \
locale-secrets-nl \
locale-secrets-nn \
locale-secrets-oc \
locale-secrets-pa \
locale-secrets-pl \
locale-secrets-pt \
locale-secrets-pt-BR \
locale-secrets-ro \
locale-secrets-ru \
locale-secrets-sl \
locale-secrets-sr \
locale-secrets-sv \
locale-secrets-tr \
locale-secrets-uk \
locale-secrets-vi \
locale-secrets-zh-CN \
secrets-lang \
secrets-lang-all"

RDEPENDS:${PN} += "secrets"

inherit rpm
