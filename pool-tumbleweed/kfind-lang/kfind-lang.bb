SUMMARY = "Translations for package kfind"
DESCRIPTION = "Provides translations for the 'kfind' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kfind-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "aaaec530253587ba7e140c64d91882093d4f5dea11c65634deb2acf5f38079ecca593275b8c5b49b5082e22e6794a3af3de0ff53340e3492163b91f54c75ec4c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kfind-lang \
kfind-lang-all \
locale(kfind:af) \
locale(kfind:ar) \
locale(kfind:az) \
locale(kfind:be) \
locale(kfind:be@latin) \
locale(kfind:bg) \
locale(kfind:bn) \
locale(kfind:bn_IN) \
locale(kfind:br) \
locale(kfind:bs) \
locale(kfind:ca) \
locale(kfind:ca@valencia) \
locale(kfind:cs) \
locale(kfind:cy) \
locale(kfind:da) \
locale(kfind:de) \
locale(kfind:el) \
locale(kfind:en_GB) \
locale(kfind:eo) \
locale(kfind:es) \
locale(kfind:et) \
locale(kfind:eu) \
locale(kfind:fa) \
locale(kfind:fi) \
locale(kfind:fr) \
locale(kfind:ga) \
locale(kfind:gl) \
locale(kfind:gu) \
locale(kfind:he) \
locale(kfind:hi) \
locale(kfind:hr) \
locale(kfind:hu) \
locale(kfind:ia) \
locale(kfind:id) \
locale(kfind:is) \
locale(kfind:it) \
locale(kfind:ja) \
locale(kfind:ka) \
locale(kfind:kk) \
locale(kfind:km) \
locale(kfind:kn) \
locale(kfind:ko) \
locale(kfind:lt) \
locale(kfind:lv) \
locale(kfind:mai) \
locale(kfind:mk) \
locale(kfind:ml) \
locale(kfind:mr) \
locale(kfind:ms) \
locale(kfind:nb) \
locale(kfind:nds) \
locale(kfind:ne) \
locale(kfind:nl) \
locale(kfind:nn) \
locale(kfind:oc) \
locale(kfind:or) \
locale(kfind:pa) \
locale(kfind:pl) \
locale(kfind:pt) \
locale(kfind:pt_BR) \
locale(kfind:ro) \
locale(kfind:ru) \
locale(kfind:si) \
locale(kfind:sk) \
locale(kfind:sl) \
locale(kfind:sq) \
locale(kfind:sr) \
locale(kfind:sr@ijekavian) \
locale(kfind:sr@ijekavianlatin) \
locale(kfind:sr@latin) \
locale(kfind:sv) \
locale(kfind:ta) \
locale(kfind:te) \
locale(kfind:th) \
locale(kfind:tr) \
locale(kfind:ug) \
locale(kfind:uk) \
locale(kfind:vi) \
locale(kfind:wa) \
locale(kfind:zh_CN) \
locale(kfind:zh_TW)"
RDEPENDS:${PN} += "kfind"

inherit rpm
