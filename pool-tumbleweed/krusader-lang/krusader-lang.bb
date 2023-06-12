SUMMARY = "Translations for package krusader"
DESCRIPTION = "Provides translations for the 'krusader' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.8.0"

RPM_NAME = "krusader-lang-2.8.0-1.3.noarch.rpm"
RPM_HASH = "3c881a5aec8e34c9a64bd7439eaf5b22a9b4ed3dfa55b3bbb4a0a2b8ff1defe528a8c0bb7b15d9a4231d89bf0027ac287f8337a7d76b908c2b102cdbc6a5b648"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "krusader-lang \
krusader-lang-all \
locale(krusader:ar) \
locale(krusader:ast) \
locale(krusader:bg) \
locale(krusader:bs) \
locale(krusader:ca) \
locale(krusader:ca@valencia) \
locale(krusader:cs) \
locale(krusader:da) \
locale(krusader:de) \
locale(krusader:el) \
locale(krusader:en_GB) \
locale(krusader:eo) \
locale(krusader:es) \
locale(krusader:et) \
locale(krusader:eu) \
locale(krusader:fi) \
locale(krusader:fr) \
locale(krusader:ga) \
locale(krusader:gl) \
locale(krusader:hr) \
locale(krusader:hu) \
locale(krusader:ia) \
locale(krusader:it) \
locale(krusader:ja) \
locale(krusader:ka) \
locale(krusader:ko) \
locale(krusader:lt) \
locale(krusader:mai) \
locale(krusader:mr) \
locale(krusader:nb) \
locale(krusader:nds) \
locale(krusader:nl) \
locale(krusader:nn) \
locale(krusader:pa) \
locale(krusader:pl) \
locale(krusader:pt) \
locale(krusader:pt_BR) \
locale(krusader:ro) \
locale(krusader:ru) \
locale(krusader:sk) \
locale(krusader:sl) \
locale(krusader:sr) \
locale(krusader:sr@ijekavian) \
locale(krusader:sr@ijekavianlatin) \
locale(krusader:sr@latin) \
locale(krusader:sv) \
locale(krusader:tr) \
locale(krusader:ug) \
locale(krusader:uk) \
locale(krusader:zh_CN) \
locale(krusader:zh_TW)"
RDEPENDS:${PN} += "krusader"

inherit rpm
