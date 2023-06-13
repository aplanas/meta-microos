SUMMARY = "Translations for package libKF5I18n5"
DESCRIPTION = "Provides translations for the 'libKF5I18n5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5I18n5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "5a03773200bc3a2faa7bef4d2951eca804be941f293e0bd1ff4005b5f208d949e14842e9a1fbffed41a42438066ce915dfb4fe2bbc3e61f3b31540ada9594a90"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5I18n5-lang \
libKF5I18n5-lang-all \
locale(libKF5I18n5:af) \
locale(libKF5I18n5:ar) \
locale(libKF5I18n5:as) \
locale(libKF5I18n5:az) \
locale(libKF5I18n5:be) \
locale(libKF5I18n5:be@latin) \
locale(libKF5I18n5:bg) \
locale(libKF5I18n5:bn) \
locale(libKF5I18n5:bn_IN) \
locale(libKF5I18n5:br) \
locale(libKF5I18n5:bs) \
locale(libKF5I18n5:ca) \
locale(libKF5I18n5:ca@valencia) \
locale(libKF5I18n5:cs) \
locale(libKF5I18n5:cy) \
locale(libKF5I18n5:da) \
locale(libKF5I18n5:de) \
locale(libKF5I18n5:el) \
locale(libKF5I18n5:en_GB) \
locale(libKF5I18n5:eo) \
locale(libKF5I18n5:es) \
locale(libKF5I18n5:et) \
locale(libKF5I18n5:eu) \
locale(libKF5I18n5:fa) \
locale(libKF5I18n5:fi) \
locale(libKF5I18n5:fr) \
locale(libKF5I18n5:ga) \
locale(libKF5I18n5:gd) \
locale(libKF5I18n5:gl) \
locale(libKF5I18n5:gu) \
locale(libKF5I18n5:he) \
locale(libKF5I18n5:hi) \
locale(libKF5I18n5:hr) \
locale(libKF5I18n5:hu) \
locale(libKF5I18n5:ia) \
locale(libKF5I18n5:id) \
locale(libKF5I18n5:is) \
locale(libKF5I18n5:it) \
locale(libKF5I18n5:ja) \
locale(libKF5I18n5:ka) \
locale(libKF5I18n5:kk) \
locale(libKF5I18n5:km) \
locale(libKF5I18n5:kn) \
locale(libKF5I18n5:ko) \
locale(libKF5I18n5:lt) \
locale(libKF5I18n5:lv) \
locale(libKF5I18n5:mai) \
locale(libKF5I18n5:mk) \
locale(libKF5I18n5:ml) \
locale(libKF5I18n5:mr) \
locale(libKF5I18n5:ms) \
locale(libKF5I18n5:nb) \
locale(libKF5I18n5:nds) \
locale(libKF5I18n5:ne) \
locale(libKF5I18n5:nl) \
locale(libKF5I18n5:nn) \
locale(libKF5I18n5:oc) \
locale(libKF5I18n5:or) \
locale(libKF5I18n5:pa) \
locale(libKF5I18n5:pl) \
locale(libKF5I18n5:pt) \
locale(libKF5I18n5:pt_BR) \
locale(libKF5I18n5:ro) \
locale(libKF5I18n5:ru) \
locale(libKF5I18n5:si) \
locale(libKF5I18n5:sk) \
locale(libKF5I18n5:sl) \
locale(libKF5I18n5:sq) \
locale(libKF5I18n5:sr) \
locale(libKF5I18n5:sr@ijekavian) \
locale(libKF5I18n5:sr@ijekavianlatin) \
locale(libKF5I18n5:sr@latin) \
locale(libKF5I18n5:sv) \
locale(libKF5I18n5:ta) \
locale(libKF5I18n5:te) \
locale(libKF5I18n5:th) \
locale(libKF5I18n5:tr) \
locale(libKF5I18n5:ug) \
locale(libKF5I18n5:uk) \
locale(libKF5I18n5:vi) \
locale(libKF5I18n5:wa) \
locale(libKF5I18n5:zh_CN) \
locale(libKF5I18n5:zh_HK) \
locale(libKF5I18n5:zh_TW)"

RDEPENDS:${PN} += "libKF5I18n5"

inherit rpm
