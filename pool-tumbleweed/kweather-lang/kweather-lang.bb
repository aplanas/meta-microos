SUMMARY = "Translations for package kweather"
DESCRIPTION = "Provides translations for the 'kweather' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.3"

RPM_NAME = "kweather-lang-23.04.3-1.1.noarch.rpm"
RPM_HASH = "de6328002ceef29c901c4dd7d306fa6b4b8f801c6f3d9a7aaf9eda3b24b4e45b5f589c658a26d057591bd520b2cc79650da64626d341a548452fdf1110da2886"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kweather-lang \
kweather-lang-all \
locale-kweather-az \
locale-kweather-ca \
locale-kweather-ca@valencia \
locale-kweather-cs \
locale-kweather-de \
locale-kweather-el \
locale-kweather-en-GB \
locale-kweather-es \
locale-kweather-et \
locale-kweather-eu \
locale-kweather-fi \
locale-kweather-fr \
locale-kweather-gl \
locale-kweather-is \
locale-kweather-it \
locale-kweather-ja \
locale-kweather-ka \
locale-kweather-ko \
locale-kweather-lt \
locale-kweather-nl \
locale-kweather-nn \
locale-kweather-pa \
locale-kweather-pl \
locale-kweather-pt \
locale-kweather-pt-BR \
locale-kweather-ru \
locale-kweather-sk \
locale-kweather-sl \
locale-kweather-sv \
locale-kweather-tr \
locale-kweather-uk \
locale-kweather-zh-CN \
locale-kweather-zh-TW"

RDEPENDS:${PN} += "kweather"

inherit rpm
