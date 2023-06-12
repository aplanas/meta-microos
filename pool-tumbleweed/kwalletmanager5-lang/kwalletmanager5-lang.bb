SUMMARY = "Translations for package kwalletmanager5"
DESCRIPTION = "Provides translations for the 'kwalletmanager5' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kwalletmanager5-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "6491e3649b6afdb6fbc753b55f38d46bacf2854dd100ffb77ddbe65fbabc6bdba8fa2b14d9114101b6f4913e51bec2956b413a6fb00dbf7cb688fe99c73e4a26"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kwalletmanager5-lang \
kwalletmanager5-lang-all \
locale(kwalletmanager5:ar) \
locale(kwalletmanager5:az) \
locale(kwalletmanager5:be) \
locale(kwalletmanager5:bg) \
locale(kwalletmanager5:br) \
locale(kwalletmanager5:bs) \
locale(kwalletmanager5:ca) \
locale(kwalletmanager5:ca@valencia) \
locale(kwalletmanager5:cs) \
locale(kwalletmanager5:cy) \
locale(kwalletmanager5:da) \
locale(kwalletmanager5:de) \
locale(kwalletmanager5:el) \
locale(kwalletmanager5:en_GB) \
locale(kwalletmanager5:eo) \
locale(kwalletmanager5:es) \
locale(kwalletmanager5:et) \
locale(kwalletmanager5:eu) \
locale(kwalletmanager5:fa) \
locale(kwalletmanager5:fi) \
locale(kwalletmanager5:fr) \
locale(kwalletmanager5:ga) \
locale(kwalletmanager5:gl) \
locale(kwalletmanager5:hi) \
locale(kwalletmanager5:hr) \
locale(kwalletmanager5:hu) \
locale(kwalletmanager5:ia) \
locale(kwalletmanager5:id) \
locale(kwalletmanager5:is) \
locale(kwalletmanager5:it) \
locale(kwalletmanager5:ja) \
locale(kwalletmanager5:ka) \
locale(kwalletmanager5:kk) \
locale(kwalletmanager5:km) \
locale(kwalletmanager5:ko) \
locale(kwalletmanager5:lt) \
locale(kwalletmanager5:lv) \
locale(kwalletmanager5:mk) \
locale(kwalletmanager5:mr) \
locale(kwalletmanager5:ms) \
locale(kwalletmanager5:nb) \
locale(kwalletmanager5:nds) \
locale(kwalletmanager5:ne) \
locale(kwalletmanager5:nl) \
locale(kwalletmanager5:nn) \
locale(kwalletmanager5:oc) \
locale(kwalletmanager5:pa) \
locale(kwalletmanager5:pl) \
locale(kwalletmanager5:pt) \
locale(kwalletmanager5:pt_BR) \
locale(kwalletmanager5:ro) \
locale(kwalletmanager5:ru) \
locale(kwalletmanager5:si) \
locale(kwalletmanager5:sk) \
locale(kwalletmanager5:sl) \
locale(kwalletmanager5:sq) \
locale(kwalletmanager5:sr) \
locale(kwalletmanager5:sr@ijekavian) \
locale(kwalletmanager5:sr@ijekavianlatin) \
locale(kwalletmanager5:sr@latin) \
locale(kwalletmanager5:sv) \
locale(kwalletmanager5:ta) \
locale(kwalletmanager5:th) \
locale(kwalletmanager5:tr) \
locale(kwalletmanager5:ug) \
locale(kwalletmanager5:uk) \
locale(kwalletmanager5:vi) \
locale(kwalletmanager5:zh_CN) \
locale(kwalletmanager5:zh_TW)"
RDEPENDS:${PN} += "kwalletmanager5"

inherit rpm
