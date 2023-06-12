SUMMARY = "Translations for package sakura"
DESCRIPTION = "Provides translations for the 'sakura' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.8.5"

RPM_NAME = "sakura-lang-3.8.5-1.4.noarch.rpm"
RPM_HASH = "fd3b2a8c7828339823c1d859a66f64dc10e0e8573d8262f08aafab17d737f97d8a28cffe098abe692b50b313dbd49648effaab266ed9359f4a014ceaa4f64d19"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(sakura:ca) \
locale(sakura:cs) \
locale(sakura:de) \
locale(sakura:en_GB) \
locale(sakura:es) \
locale(sakura:fr) \
locale(sakura:he) \
locale(sakura:hr) \
locale(sakura:hu) \
locale(sakura:it) \
locale(sakura:ja) \
locale(sakura:ko) \
locale(sakura:pl) \
locale(sakura:pt) \
locale(sakura:pt_BR) \
locale(sakura:ru) \
locale(sakura:sv) \
locale(sakura:uk) \
locale(sakura:zh_CN) \
sakura-lang \
sakura-lang-all"
RDEPENDS:${PN} += "sakura"

inherit rpm
