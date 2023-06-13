SUMMARY = "Translations for package compiz-emerald"
DESCRIPTION = "Provides translations for the 'compiz-emerald' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.8.18"

RPM_NAME = "compiz-emerald-lang-0.8.18-2.14.noarch.rpm"
RPM_HASH = "28b2bb7e7916a82507f5d629767098ad138faa0fbaf023652274596069106086a5e6f817558aa5c27d09ee33661e8dee9c23b288d89f9a96696b21e273176c6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "compiz-emerald-lang \
compiz-emerald-lang-all \
locale(compiz-emerald:ar) \
locale(compiz-emerald:bn) \
locale(compiz-emerald:bn_IN) \
locale(compiz-emerald:ca) \
locale(compiz-emerald:cs) \
locale(compiz-emerald:de) \
locale(compiz-emerald:el) \
locale(compiz-emerald:en_GB) \
locale(compiz-emerald:es) \
locale(compiz-emerald:es_AR) \
locale(compiz-emerald:eu) \
locale(compiz-emerald:fi) \
locale(compiz-emerald:fr) \
locale(compiz-emerald:gl) \
locale(compiz-emerald:gu) \
locale(compiz-emerald:he) \
locale(compiz-emerald:hi) \
locale(compiz-emerald:hu) \
locale(compiz-emerald:it) \
locale(compiz-emerald:ja) \
locale(compiz-emerald:ko) \
locale(compiz-emerald:nb) \
locale(compiz-emerald:nl) \
locale(compiz-emerald:or) \
locale(compiz-emerald:pa) \
locale(compiz-emerald:pl) \
locale(compiz-emerald:pt) \
locale(compiz-emerald:pt_BR) \
locale(compiz-emerald:ru) \
locale(compiz-emerald:sk) \
locale(compiz-emerald:sv) \
locale(compiz-emerald:tr) \
locale(compiz-emerald:zh_CN) \
locale(compiz-emerald:zh_HK) \
locale(compiz-emerald:zh_TW)"

RDEPENDS:${PN} += "compiz-emerald"

inherit rpm
