SUMMARY = "Translations for package kdevplatform"
DESCRIPTION = "Provides translations for the 'kdevplatform' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kdevplatform-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "3806d85795d85cba6cb5424717459624fd94703765cce4b4b32c9076fc08c557b619bd5952a90cfabcb88f8aee3f131b92bcc3a41fc5c07e7d4d7e3ec58a877a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdevplatform-lang \
kdevplatform-lang-all \
locale-kdevplatform-ar \
locale-kdevplatform-az \
locale-kdevplatform-bg \
locale-kdevplatform-bs \
locale-kdevplatform-ca \
locale-kdevplatform-ca@valencia \
locale-kdevplatform-cs \
locale-kdevplatform-da \
locale-kdevplatform-de \
locale-kdevplatform-el \
locale-kdevplatform-en-GB \
locale-kdevplatform-eo \
locale-kdevplatform-es \
locale-kdevplatform-et \
locale-kdevplatform-eu \
locale-kdevplatform-fi \
locale-kdevplatform-fr \
locale-kdevplatform-ga \
locale-kdevplatform-gl \
locale-kdevplatform-hr \
locale-kdevplatform-hu \
locale-kdevplatform-it \
locale-kdevplatform-ja \
locale-kdevplatform-ka \
locale-kdevplatform-kk \
locale-kdevplatform-ko \
locale-kdevplatform-lt \
locale-kdevplatform-mr \
locale-kdevplatform-ms \
locale-kdevplatform-nb \
locale-kdevplatform-nds \
locale-kdevplatform-nl \
locale-kdevplatform-nn \
locale-kdevplatform-pa \
locale-kdevplatform-pl \
locale-kdevplatform-pt \
locale-kdevplatform-pt-BR \
locale-kdevplatform-ro \
locale-kdevplatform-ru \
locale-kdevplatform-sk \
locale-kdevplatform-sl \
locale-kdevplatform-sv \
locale-kdevplatform-tr \
locale-kdevplatform-ug \
locale-kdevplatform-uk \
locale-kdevplatform-zh-CN \
locale-kdevplatform-zh-TW"

RDEPENDS:${PN} += "kdevplatform"

inherit rpm
