SUMMARY = "Translations for package libKF5Holidays5"
DESCRIPTION = "Provides translations for the 'libKF5Holidays5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5Holidays5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "ef714d5f5c7b7624bd40b3f1846ae20750211280c06d0a32bf8e4d312ffbc8e229d87003ad96da6b939afbaca33ab7049a1cf9c019b2b58aada4fa50ff9a1ceb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5Holidays5-lang \
libKF5Holidays5-lang-all \
locale(libKF5Holidays5:ar) \
locale(libKF5Holidays5:az) \
locale(libKF5Holidays5:be) \
locale(libKF5Holidays5:bg) \
locale(libKF5Holidays5:br) \
locale(libKF5Holidays5:bs) \
locale(libKF5Holidays5:ca) \
locale(libKF5Holidays5:ca@valencia) \
locale(libKF5Holidays5:cs) \
locale(libKF5Holidays5:cy) \
locale(libKF5Holidays5:da) \
locale(libKF5Holidays5:de) \
locale(libKF5Holidays5:el) \
locale(libKF5Holidays5:en_GB) \
locale(libKF5Holidays5:eo) \
locale(libKF5Holidays5:es) \
locale(libKF5Holidays5:et) \
locale(libKF5Holidays5:eu) \
locale(libKF5Holidays5:fa) \
locale(libKF5Holidays5:fi) \
locale(libKF5Holidays5:fr) \
locale(libKF5Holidays5:ga) \
locale(libKF5Holidays5:gl) \
locale(libKF5Holidays5:he) \
locale(libKF5Holidays5:hi) \
locale(libKF5Holidays5:hu) \
locale(libKF5Holidays5:ia) \
locale(libKF5Holidays5:id) \
locale(libKF5Holidays5:is) \
locale(libKF5Holidays5:it) \
locale(libKF5Holidays5:ja) \
locale(libKF5Holidays5:ka) \
locale(libKF5Holidays5:kk) \
locale(libKF5Holidays5:km) \
locale(libKF5Holidays5:ko) \
locale(libKF5Holidays5:lt) \
locale(libKF5Holidays5:lv) \
locale(libKF5Holidays5:mk) \
locale(libKF5Holidays5:ml) \
locale(libKF5Holidays5:mr) \
locale(libKF5Holidays5:ms) \
locale(libKF5Holidays5:nb) \
locale(libKF5Holidays5:nds) \
locale(libKF5Holidays5:ne) \
locale(libKF5Holidays5:nl) \
locale(libKF5Holidays5:nn) \
locale(libKF5Holidays5:pa) \
locale(libKF5Holidays5:pl) \
locale(libKF5Holidays5:pt) \
locale(libKF5Holidays5:pt_BR) \
locale(libKF5Holidays5:ro) \
locale(libKF5Holidays5:ru) \
locale(libKF5Holidays5:sk) \
locale(libKF5Holidays5:sl) \
locale(libKF5Holidays5:sq) \
locale(libKF5Holidays5:sr) \
locale(libKF5Holidays5:sr@ijekavian) \
locale(libKF5Holidays5:sr@ijekavianlatin) \
locale(libKF5Holidays5:sr@latin) \
locale(libKF5Holidays5:sv) \
locale(libKF5Holidays5:ta) \
locale(libKF5Holidays5:th) \
locale(libKF5Holidays5:tr) \
locale(libKF5Holidays5:ug) \
locale(libKF5Holidays5:uk) \
locale(libKF5Holidays5:wa) \
locale(libKF5Holidays5:zh_CN) \
locale(libKF5Holidays5:zh_TW)"

RDEPENDS:${PN} += "libKF5Holidays5"

inherit rpm
