SUMMARY = "Translations for package kweather"
DESCRIPTION = "Provides translations for the 'kweather' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.08.0"

RPM_NAME = "kweather-lang-23.08.0-1.1.noarch.rpm"
RPM_HASH = "3880680f03f7d78bbfc4a457853b2501b0bc431cf6b7812edfafb26133200238df12eb255e25c3f0fed006144bafe16f98beb38e081a4c7fab7f196095abfe39"
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
