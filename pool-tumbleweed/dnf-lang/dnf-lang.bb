SUMMARY = "Translations for package dnf"
DESCRIPTION = "Provides translations for the 'dnf' package."
LICENSE = "GPL-2.0-only & GPL-2.0-or-later"

PV = "4.14.0"

RPM_NAME = "dnf-lang-4.14.0-3.2.noarch.rpm"
RPM_HASH = "f23eae6d9e74c6b02fa823e20ea62fb1510890f36d7c2812acd0caa527041bbf2aab2a45a88f57ddeb1f208773def783c68b206124b40d232ea30e7b74f82c9a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dnf-lang \
dnf-lang-all \
locale-dnf-ar \
locale-dnf-bg \
locale-dnf-bn \
locale-dnf-bn-IN \
locale-dnf-ca \
locale-dnf-cs \
locale-dnf-da \
locale-dnf-de \
locale-dnf-el \
locale-dnf-en-GB \
locale-dnf-eo \
locale-dnf-es \
locale-dnf-eu \
locale-dnf-fa \
locale-dnf-fi \
locale-dnf-fr \
locale-dnf-fur \
locale-dnf-gd \
locale-dnf-gu \
locale-dnf-he \
locale-dnf-hi \
locale-dnf-hr \
locale-dnf-hu \
locale-dnf-id \
locale-dnf-it \
locale-dnf-ja \
locale-dnf-ka \
locale-dnf-kk \
locale-dnf-ko \
locale-dnf-lt \
locale-dnf-ml \
locale-dnf-mr \
locale-dnf-ms \
locale-dnf-nb \
locale-dnf-nl \
locale-dnf-or \
locale-dnf-pa \
locale-dnf-pl \
locale-dnf-pt \
locale-dnf-pt-BR \
locale-dnf-ru \
locale-dnf-si \
locale-dnf-sk \
locale-dnf-sq \
locale-dnf-sr \
locale-dnf-sr@latin \
locale-dnf-sv \
locale-dnf-th \
locale-dnf-tr \
locale-dnf-uk \
locale-dnf-vi \
locale-dnf-zh-CN \
locale-dnf-zh-Hans \
locale-dnf-zh-TW"

RDEPENDS:${PN} += "dnf"

inherit rpm
