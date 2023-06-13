SUMMARY = "Translations for package gcab"
DESCRIPTION = "Provides translations for the 'gcab' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.5"

RPM_NAME = "gcab-lang-1.5-1.5.noarch.rpm"
RPM_HASH = "4e803a35cd602ef036f5062037b03a620ec2f5c91c81d0b54df13e0ee0fb8109dabd52e2b3ce0f6dc764a340939206874b39943e0d1b0683e67bce2f44fdf6fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gcab-lang \
gcab-lang-all \
locale(gcab:bs) \
locale(gcab:cs) \
locale(gcab:da) \
locale(gcab:de) \
locale(gcab:el) \
locale(gcab:en_GB) \
locale(gcab:es) \
locale(gcab:eu) \
locale(gcab:fi) \
locale(gcab:fr) \
locale(gcab:fur) \
locale(gcab:gl) \
locale(gcab:hr) \
locale(gcab:hu) \
locale(gcab:id) \
locale(gcab:ja) \
locale(gcab:ka) \
locale(gcab:lt) \
locale(gcab:lv) \
locale(gcab:nb) \
locale(gcab:nl) \
locale(gcab:oc) \
locale(gcab:pl) \
locale(gcab:pt) \
locale(gcab:pt_BR) \
locale(gcab:ro) \
locale(gcab:ru) \
locale(gcab:sl) \
locale(gcab:sr) \
locale(gcab:sr@latin) \
locale(gcab:sv) \
locale(gcab:tr) \
locale(gcab:uk) \
locale(gcab:zh_CN)"

RDEPENDS:${PN} += "gcab"

inherit rpm
