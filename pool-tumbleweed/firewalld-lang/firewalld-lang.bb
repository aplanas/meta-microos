SUMMARY = "Translations for package firewalld"
DESCRIPTION = "Provides translations for the 'firewalld' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.0.0"

RPM_NAME = "firewalld-lang-2.0.0-2.1.noarch.rpm"
RPM_HASH = "104226ce5887bde481e61d2d1d854d5c9a57a58b990f051ac0646711b3e458c3811860c7a7bee2cd44586f11f5f6e45f2752c3c88f2c7d525ddfd211279edd10"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "firewalld-lang \
firewalld-lang-all \
locale-firewalld-ar \
locale-firewalld-as \
locale-firewalld-ast \
locale-firewalld-bg \
locale-firewalld-bn-IN \
locale-firewalld-ca \
locale-firewalld-cs \
locale-firewalld-da \
locale-firewalld-de \
locale-firewalld-el \
locale-firewalld-en-GB \
locale-firewalld-en-US \
locale-firewalld-es \
locale-firewalld-et \
locale-firewalld-eu \
locale-firewalld-fa \
locale-firewalld-fi \
locale-firewalld-fr \
locale-firewalld-gl \
locale-firewalld-gu \
locale-firewalld-hi \
locale-firewalld-hr \
locale-firewalld-hu \
locale-firewalld-ia \
locale-firewalld-id \
locale-firewalld-it \
locale-firewalld-ja \
locale-firewalld-ka \
locale-firewalld-kn \
locale-firewalld-ko \
locale-firewalld-lt \
locale-firewalld-ml \
locale-firewalld-mr \
locale-firewalld-nl \
locale-firewalld-or \
locale-firewalld-pa \
locale-firewalld-pl \
locale-firewalld-pt \
locale-firewalld-pt-BR \
locale-firewalld-ru \
locale-firewalld-si \
locale-firewalld-sk \
locale-firewalld-sq \
locale-firewalld-sr \
locale-firewalld-sr@latin \
locale-firewalld-sv \
locale-firewalld-ta \
locale-firewalld-te \
locale-firewalld-tr \
locale-firewalld-uk \
locale-firewalld-zh-CN \
locale-firewalld-zh-TW"

RDEPENDS:${PN} += "firewalld"

inherit rpm
