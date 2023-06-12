SUMMARY = "Translations for package evolution-ews"
DESCRIPTION = "Provides translations for the 'evolution-ews' package."
LICENSE = "LGPL-2.1-only"

PV = "3.48.2"

RPM_NAME = "evolution-ews-lang-3.48.2-1.1.noarch.rpm"
RPM_HASH = "5fb1334c4f0935f4cd5d1c69e6eaf5492ece84e6d5a6373639985399e1a4ec27fa9c45bd1e872598c557c2bfb8a6e38e13260391a97aaf11933d3c4370d91bd5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "evolution-ews-lang \
evolution-ews-lang-all \
locale(evolution-ews:as) \
locale(evolution-ews:bn_IN) \
locale(evolution-ews:bs) \
locale(evolution-ews:ca) \
locale(evolution-ews:cs) \
locale(evolution-ews:da) \
locale(evolution-ews:de) \
locale(evolution-ews:el) \
locale(evolution-ews:en_GB) \
locale(evolution-ews:es) \
locale(evolution-ews:eu) \
locale(evolution-ews:fr) \
locale(evolution-ews:gl) \
locale(evolution-ews:gu) \
locale(evolution-ews:hi) \
locale(evolution-ews:hr) \
locale(evolution-ews:hu) \
locale(evolution-ews:id) \
locale(evolution-ews:it) \
locale(evolution-ews:ja) \
locale(evolution-ews:kn) \
locale(evolution-ews:lt) \
locale(evolution-ews:lv) \
locale(evolution-ews:mr) \
locale(evolution-ews:nb) \
locale(evolution-ews:nl) \
locale(evolution-ews:oc) \
locale(evolution-ews:or) \
locale(evolution-ews:pl) \
locale(evolution-ews:pt) \
locale(evolution-ews:pt_BR) \
locale(evolution-ews:ro) \
locale(evolution-ews:ru) \
locale(evolution-ews:sk) \
locale(evolution-ews:sl) \
locale(evolution-ews:sr) \
locale(evolution-ews:sr@latin) \
locale(evolution-ews:sv) \
locale(evolution-ews:ta) \
locale(evolution-ews:te) \
locale(evolution-ews:tr) \
locale(evolution-ews:uk) \
locale(evolution-ews:zh_CN)"
RDEPENDS:${PN} += "evolution-ews"

inherit rpm
