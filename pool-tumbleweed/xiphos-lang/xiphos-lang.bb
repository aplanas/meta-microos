SUMMARY = "Translations for package xiphos"
DESCRIPTION = "Provides translations for the 'xiphos' package."
LICENSE = "GPL-2.0-only"

PV = "4.2.1.7"

RPM_NAME = "xiphos-lang-4.2.1.7-1.16.noarch.rpm"
RPM_HASH = "ba913728547e4fa7692a55c34c09e13218a1795f84db75c1e530ac8889be00f1855e3a6b71e32dc2bb6abd6d658a6e1b97ed788af224a7971c770ca111a6d3a0"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xiphos:ar) \
locale(xiphos:bg) \
locale(xiphos:cs) \
locale(xiphos:cy) \
locale(xiphos:da) \
locale(xiphos:de) \
locale(xiphos:en_GB) \
locale(xiphos:es) \
locale(xiphos:fa) \
locale(xiphos:fi) \
locale(xiphos:fr) \
locale(xiphos:he) \
locale(xiphos:hu) \
locale(xiphos:it) \
locale(xiphos:ja) \
locale(xiphos:lt) \
locale(xiphos:lv) \
locale(xiphos:nb) \
locale(xiphos:nl) \
locale(xiphos:pl) \
locale(xiphos:pt) \
locale(xiphos:pt_BR) \
locale(xiphos:ro) \
locale(xiphos:ru) \
locale(xiphos:sk) \
locale(xiphos:sl) \
locale(xiphos:sv) \
locale(xiphos:tr) \
locale(xiphos:vi) \
locale(xiphos:zh_CN) \
locale(xiphos:zh_TW) \
xiphos-lang \
xiphos-lang-all"

RDEPENDS:${PN} += "xiphos"

inherit rpm
