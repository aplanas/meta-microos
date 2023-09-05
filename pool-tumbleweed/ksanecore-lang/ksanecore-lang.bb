SUMMARY = "Translations for package ksanecore"
DESCRIPTION = "Provides translations for the 'ksanecore' package."
LICENSE = "LGPL-2.1-only | LGPL-3.0-only"

PV = "23.08.0"

RPM_NAME = "ksanecore-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "afaea467f072529a5674f38343229489a258094aa4ca1c38989f8f1477c24572d9336134aece07b4a7197933f03b4756744d0050d92b55a02408e7a400a9be7a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ksanecore-lang \
ksanecore-lang-all \
locale-ksanecore-ar \
locale-ksanecore-bg \
locale-ksanecore-ca \
locale-ksanecore-ca@valencia \
locale-ksanecore-cs \
locale-ksanecore-de \
locale-ksanecore-en-GB \
locale-ksanecore-es \
locale-ksanecore-eu \
locale-ksanecore-fi \
locale-ksanecore-fr \
locale-ksanecore-gl \
locale-ksanecore-hi \
locale-ksanecore-it \
locale-ksanecore-ja \
locale-ksanecore-ka \
locale-ksanecore-ko \
locale-ksanecore-lt \
locale-ksanecore-nl \
locale-ksanecore-nn \
locale-ksanecore-pl \
locale-ksanecore-pt \
locale-ksanecore-pt-BR \
locale-ksanecore-ro \
locale-ksanecore-ru \
locale-ksanecore-sk \
locale-ksanecore-sl \
locale-ksanecore-sv \
locale-ksanecore-tr \
locale-ksanecore-uk \
locale-ksanecore-zh-CN \
locale-ksanecore-zh-TW"

RDEPENDS:${PN} += "ksanecore"

inherit rpm
