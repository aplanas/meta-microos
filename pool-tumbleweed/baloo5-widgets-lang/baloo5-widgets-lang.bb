SUMMARY = "Translations for package baloo5-widgets"
DESCRIPTION = "Provides translations for the 'baloo5-widgets' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.1"

RPM_NAME = "baloo5-widgets-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "09064daaeb3c9721e5cbf1fc20764f45cdda0384396eb2a125291f8221d8a165cf50fbe507e6e8168fbcadefe7f0b21ceafcbbdfccbe90dbc7791eac24c874fc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "baloo5-widgets-lang \
baloo5-widgets-lang-all \
locale(baloo5-widgets:ar) \
locale(baloo5-widgets:az) \
locale(baloo5-widgets:bg) \
locale(baloo5-widgets:bs) \
locale(baloo5-widgets:ca) \
locale(baloo5-widgets:ca@valencia) \
locale(baloo5-widgets:cs) \
locale(baloo5-widgets:da) \
locale(baloo5-widgets:de) \
locale(baloo5-widgets:el) \
locale(baloo5-widgets:en_GB) \
locale(baloo5-widgets:es) \
locale(baloo5-widgets:et) \
locale(baloo5-widgets:eu) \
locale(baloo5-widgets:fi) \
locale(baloo5-widgets:fr) \
locale(baloo5-widgets:ga) \
locale(baloo5-widgets:gl) \
locale(baloo5-widgets:he) \
locale(baloo5-widgets:hu) \
locale(baloo5-widgets:ia) \
locale(baloo5-widgets:id) \
locale(baloo5-widgets:it) \
locale(baloo5-widgets:ja) \
locale(baloo5-widgets:ka) \
locale(baloo5-widgets:kk) \
locale(baloo5-widgets:ko) \
locale(baloo5-widgets:lt) \
locale(baloo5-widgets:ml) \
locale(baloo5-widgets:mr) \
locale(baloo5-widgets:nb) \
locale(baloo5-widgets:nds) \
locale(baloo5-widgets:nl) \
locale(baloo5-widgets:nn) \
locale(baloo5-widgets:pa) \
locale(baloo5-widgets:pl) \
locale(baloo5-widgets:pt) \
locale(baloo5-widgets:pt_BR) \
locale(baloo5-widgets:ro) \
locale(baloo5-widgets:ru) \
locale(baloo5-widgets:sk) \
locale(baloo5-widgets:sl) \
locale(baloo5-widgets:sr) \
locale(baloo5-widgets:sr@ijekavian) \
locale(baloo5-widgets:sr@ijekavianlatin) \
locale(baloo5-widgets:sr@latin) \
locale(baloo5-widgets:sv) \
locale(baloo5-widgets:ta) \
locale(baloo5-widgets:tr) \
locale(baloo5-widgets:ug) \
locale(baloo5-widgets:uk) \
locale(baloo5-widgets:zh_CN) \
locale(baloo5-widgets:zh_TW)"
RDEPENDS:${PN} += "baloo5-widgets"

inherit rpm
