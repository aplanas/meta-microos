SUMMARY = "Translations for package libKF5Parts5"
DESCRIPTION = "Provides translations for the 'libKF5Parts5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Parts5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "460b0a8ff0e0121429a57d3df46f99d9ac58b663cc81c4b2fd61f96c0ce02bbe62816a81cc17f433902264a55bf071416c485c667562f79e162f695563efe4af"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Parts5-lang \
libKF5Parts5-lang-all \
locale(libKF5Parts5:af) \
locale(libKF5Parts5:ar) \
locale(libKF5Parts5:as) \
locale(libKF5Parts5:az) \
locale(libKF5Parts5:be) \
locale(libKF5Parts5:be@latin) \
locale(libKF5Parts5:bg) \
locale(libKF5Parts5:bn) \
locale(libKF5Parts5:bn_IN) \
locale(libKF5Parts5:br) \
locale(libKF5Parts5:bs) \
locale(libKF5Parts5:ca) \
locale(libKF5Parts5:ca@valencia) \
locale(libKF5Parts5:cs) \
locale(libKF5Parts5:cy) \
locale(libKF5Parts5:da) \
locale(libKF5Parts5:de) \
locale(libKF5Parts5:el) \
locale(libKF5Parts5:en_GB) \
locale(libKF5Parts5:eo) \
locale(libKF5Parts5:es) \
locale(libKF5Parts5:et) \
locale(libKF5Parts5:eu) \
locale(libKF5Parts5:fa) \
locale(libKF5Parts5:fi) \
locale(libKF5Parts5:fr) \
locale(libKF5Parts5:ga) \
locale(libKF5Parts5:gd) \
locale(libKF5Parts5:gl) \
locale(libKF5Parts5:gu) \
locale(libKF5Parts5:he) \
locale(libKF5Parts5:hi) \
locale(libKF5Parts5:hr) \
locale(libKF5Parts5:hu) \
locale(libKF5Parts5:ia) \
locale(libKF5Parts5:id) \
locale(libKF5Parts5:is) \
locale(libKF5Parts5:it) \
locale(libKF5Parts5:ja) \
locale(libKF5Parts5:ka) \
locale(libKF5Parts5:kk) \
locale(libKF5Parts5:km) \
locale(libKF5Parts5:kn) \
locale(libKF5Parts5:ko) \
locale(libKF5Parts5:lt) \
locale(libKF5Parts5:lv) \
locale(libKF5Parts5:mai) \
locale(libKF5Parts5:mk) \
locale(libKF5Parts5:ml) \
locale(libKF5Parts5:mr) \
locale(libKF5Parts5:ms) \
locale(libKF5Parts5:nb) \
locale(libKF5Parts5:nds) \
locale(libKF5Parts5:ne) \
locale(libKF5Parts5:nl) \
locale(libKF5Parts5:nn) \
locale(libKF5Parts5:oc) \
locale(libKF5Parts5:or) \
locale(libKF5Parts5:pa) \
locale(libKF5Parts5:pl) \
locale(libKF5Parts5:pt) \
locale(libKF5Parts5:pt_BR) \
locale(libKF5Parts5:ro) \
locale(libKF5Parts5:ru) \
locale(libKF5Parts5:si) \
locale(libKF5Parts5:sk) \
locale(libKF5Parts5:sl) \
locale(libKF5Parts5:sq) \
locale(libKF5Parts5:sr) \
locale(libKF5Parts5:sr@ijekavian) \
locale(libKF5Parts5:sr@ijekavianlatin) \
locale(libKF5Parts5:sr@latin) \
locale(libKF5Parts5:sv) \
locale(libKF5Parts5:ta) \
locale(libKF5Parts5:te) \
locale(libKF5Parts5:th) \
locale(libKF5Parts5:tr) \
locale(libKF5Parts5:ug) \
locale(libKF5Parts5:uk) \
locale(libKF5Parts5:vi) \
locale(libKF5Parts5:wa) \
locale(libKF5Parts5:zh_CN) \
locale(libKF5Parts5:zh_HK) \
locale(libKF5Parts5:zh_TW)"

RDEPENDS:${PN} += "libKF5Parts5"

inherit rpm
