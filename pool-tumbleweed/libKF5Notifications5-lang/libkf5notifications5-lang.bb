SUMMARY = "Translations for package libKF5Notifications5"
DESCRIPTION = "Provides translations for the 'libKF5Notifications5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Notifications5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "5b3b513de0c3d548872708dd84fd9d30b210ec60169b7d8b3e01e8096736470697e8f56d771996b17a9a2825de547cca9edad255a1f855a068ad180603626100"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Notifications5-lang \
libKF5Notifications5-lang-all \
locale(libKF5Notifications5:af) \
locale(libKF5Notifications5:ar) \
locale(libKF5Notifications5:as) \
locale(libKF5Notifications5:az) \
locale(libKF5Notifications5:be) \
locale(libKF5Notifications5:be@latin) \
locale(libKF5Notifications5:bg) \
locale(libKF5Notifications5:bn) \
locale(libKF5Notifications5:bn_IN) \
locale(libKF5Notifications5:br) \
locale(libKF5Notifications5:bs) \
locale(libKF5Notifications5:ca) \
locale(libKF5Notifications5:ca@valencia) \
locale(libKF5Notifications5:cs) \
locale(libKF5Notifications5:cy) \
locale(libKF5Notifications5:da) \
locale(libKF5Notifications5:de) \
locale(libKF5Notifications5:el) \
locale(libKF5Notifications5:en_GB) \
locale(libKF5Notifications5:eo) \
locale(libKF5Notifications5:es) \
locale(libKF5Notifications5:et) \
locale(libKF5Notifications5:eu) \
locale(libKF5Notifications5:fa) \
locale(libKF5Notifications5:fi) \
locale(libKF5Notifications5:fr) \
locale(libKF5Notifications5:ga) \
locale(libKF5Notifications5:gd) \
locale(libKF5Notifications5:gl) \
locale(libKF5Notifications5:gu) \
locale(libKF5Notifications5:he) \
locale(libKF5Notifications5:hi) \
locale(libKF5Notifications5:hr) \
locale(libKF5Notifications5:hu) \
locale(libKF5Notifications5:ia) \
locale(libKF5Notifications5:id) \
locale(libKF5Notifications5:is) \
locale(libKF5Notifications5:it) \
locale(libKF5Notifications5:ja) \
locale(libKF5Notifications5:ka) \
locale(libKF5Notifications5:kk) \
locale(libKF5Notifications5:km) \
locale(libKF5Notifications5:kn) \
locale(libKF5Notifications5:ko) \
locale(libKF5Notifications5:lt) \
locale(libKF5Notifications5:lv) \
locale(libKF5Notifications5:mai) \
locale(libKF5Notifications5:mk) \
locale(libKF5Notifications5:ml) \
locale(libKF5Notifications5:mr) \
locale(libKF5Notifications5:ms) \
locale(libKF5Notifications5:nb) \
locale(libKF5Notifications5:nds) \
locale(libKF5Notifications5:ne) \
locale(libKF5Notifications5:nl) \
locale(libKF5Notifications5:nn) \
locale(libKF5Notifications5:oc) \
locale(libKF5Notifications5:or) \
locale(libKF5Notifications5:pa) \
locale(libKF5Notifications5:pl) \
locale(libKF5Notifications5:pt) \
locale(libKF5Notifications5:pt_BR) \
locale(libKF5Notifications5:ro) \
locale(libKF5Notifications5:ru) \
locale(libKF5Notifications5:si) \
locale(libKF5Notifications5:sk) \
locale(libKF5Notifications5:sl) \
locale(libKF5Notifications5:sq) \
locale(libKF5Notifications5:sr) \
locale(libKF5Notifications5:sr@ijekavian) \
locale(libKF5Notifications5:sr@ijekavianlatin) \
locale(libKF5Notifications5:sr@latin) \
locale(libKF5Notifications5:sv) \
locale(libKF5Notifications5:ta) \
locale(libKF5Notifications5:te) \
locale(libKF5Notifications5:th) \
locale(libKF5Notifications5:tr) \
locale(libKF5Notifications5:ug) \
locale(libKF5Notifications5:uk) \
locale(libKF5Notifications5:vi) \
locale(libKF5Notifications5:wa) \
locale(libKF5Notifications5:zh_CN) \
locale(libKF5Notifications5:zh_HK) \
locale(libKF5Notifications5:zh_TW)"
RDEPENDS:${PN} += "libKF5Notifications5"

inherit rpm