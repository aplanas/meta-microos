SUMMARY = "Translations for package kseexpr"
DESCRIPTION = "Provides translations for the 'kseexpr' package."
LICENSE = "GPL-3.0-or-later & Apache-2.0 & BSD-3-Clause & MIT"

PV = "4.0.4.0"

RPM_NAME = "kseexpr-lang-4.0.4.0-1.11.noarch.rpm"
RPM_HASH = "1007e37f20a8a10da235adfae9070ccf09f933086aa2e26feeec81f84b7d1c635e1e867fb9916135d140d54bc7847d6f9f8ae58dbac2bbeffc4fff57eaaf7e99"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kseexpr-lang \
kseexpr-lang-all \
locale-kseexpr-ca \
locale-kseexpr-ca@valencia \
locale-kseexpr-cs \
locale-kseexpr-de \
locale-kseexpr-en-GB \
locale-kseexpr-es \
locale-kseexpr-fr \
locale-kseexpr-it \
locale-kseexpr-ja \
locale-kseexpr-ko \
locale-kseexpr-lt \
locale-kseexpr-nl \
locale-kseexpr-nn \
locale-kseexpr-pl \
locale-kseexpr-pt \
locale-kseexpr-pt-BR \
locale-kseexpr-ru \
locale-kseexpr-sk \
locale-kseexpr-sl \
locale-kseexpr-sv \
locale-kseexpr-uk \
locale-kseexpr-zh-CN \
locale-kseexpr-zh-TW"

RDEPENDS:${PN} += "kseexpr"

inherit rpm
