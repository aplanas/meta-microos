SUMMARY = "Translations for package cherrytree"
DESCRIPTION = "Provides translations for the 'cherrytree' package."
LICENSE = "GPL-3.0-or-later & LGPL-2.1-only"

PV = "0.99.55"

RPM_NAME = "cherrytree-lang-0.99.55-1.3.noarch.rpm"
RPM_HASH = "90c387d24d20f6361c1bd5fff963d9b7467eaaffe0f73e5ed9ff310437b1bd9312b6a593a05782e6eb680373c210b2f283baec5c6abb8be445b9a1905b5cf32f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cherrytree-lang \
cherrytree-lang-all \
locale(cherrytree:ar) \
locale(cherrytree:bg) \
locale(cherrytree:cs) \
locale(cherrytree:de) \
locale(cherrytree:el) \
locale(cherrytree:es) \
locale(cherrytree:fi) \
locale(cherrytree:fr) \
locale(cherrytree:hr) \
locale(cherrytree:hu) \
locale(cherrytree:it) \
locale(cherrytree:ja) \
locale(cherrytree:ko) \
locale(cherrytree:lt) \
locale(cherrytree:nl) \
locale(cherrytree:pl) \
locale(cherrytree:pt) \
locale(cherrytree:pt_BR) \
locale(cherrytree:ro) \
locale(cherrytree:ru) \
locale(cherrytree:sl) \
locale(cherrytree:sv) \
locale(cherrytree:tr) \
locale(cherrytree:uk) \
locale(cherrytree:zh_CN) \
locale(cherrytree:zh_TW)"

RDEPENDS:${PN} += "cherrytree"

inherit rpm
