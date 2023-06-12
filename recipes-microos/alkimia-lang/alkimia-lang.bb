SUMMARY = "Translations for package alkimia"
DESCRIPTION = "Provides translations for the 'alkimia' package."
LICENSE = "LGPL-2.1-or-later"

PV = "8.1.1"

RPM_NAME = "alkimia-lang-8.1.1-1.4.noarch.rpm"
RPM_HASH = "cad3fbceb6cc7cdc028a2607d55c9118d25a46d71f82e21496b6f9e7025b1c606b178f30473b6080e69fe9c400bfec213f29b762d2a9bcf2a9ab0b925ad22272"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "alkimia-lang \
alkimia-lang-all \
locale(alkimia:ca) \
locale(alkimia:ca@valencia) \
locale(alkimia:cs) \
locale(alkimia:de) \
locale(alkimia:el) \
locale(alkimia:en_GB) \
locale(alkimia:es) \
locale(alkimia:et) \
locale(alkimia:fi) \
locale(alkimia:fr) \
locale(alkimia:gl) \
locale(alkimia:hu) \
locale(alkimia:ia) \
locale(alkimia:it) \
locale(alkimia:ko) \
locale(alkimia:nl) \
locale(alkimia:nn) \
locale(alkimia:pl) \
locale(alkimia:pt) \
locale(alkimia:pt_BR) \
locale(alkimia:ru) \
locale(alkimia:sk) \
locale(alkimia:sl) \
locale(alkimia:sv) \
locale(alkimia:uk) \
locale(alkimia:zh_CN) \
locale(alkimia:zh_TW)"
RDEPENDS:${PN} += "alkimia"

inherit rpm
