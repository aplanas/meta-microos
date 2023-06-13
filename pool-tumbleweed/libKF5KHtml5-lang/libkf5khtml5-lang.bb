SUMMARY = "Translations for package libKF5KHtml5"
DESCRIPTION = "Provides translations for the 'libKF5KHtml5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5KHtml5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "495d25e9cf11aadfdde6595c525f509ef71198b89731eed2c1ad649be63d2a300036cbb268701b1157efaf0c26e5f0c7af13e5f768da268d8989b2097d5282ae"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5KHtml5-lang \
libKF5KHtml5-lang-all \
locale(libKF5KHtml5:af) \
locale(libKF5KHtml5:ar) \
locale(libKF5KHtml5:as) \
locale(libKF5KHtml5:az) \
locale(libKF5KHtml5:be) \
locale(libKF5KHtml5:be@latin) \
locale(libKF5KHtml5:bg) \
locale(libKF5KHtml5:bn) \
locale(libKF5KHtml5:bn_IN) \
locale(libKF5KHtml5:br) \
locale(libKF5KHtml5:bs) \
locale(libKF5KHtml5:ca) \
locale(libKF5KHtml5:ca@valencia) \
locale(libKF5KHtml5:cs) \
locale(libKF5KHtml5:cy) \
locale(libKF5KHtml5:da) \
locale(libKF5KHtml5:de) \
locale(libKF5KHtml5:el) \
locale(libKF5KHtml5:en_GB) \
locale(libKF5KHtml5:eo) \
locale(libKF5KHtml5:es) \
locale(libKF5KHtml5:et) \
locale(libKF5KHtml5:eu) \
locale(libKF5KHtml5:fa) \
locale(libKF5KHtml5:fi) \
locale(libKF5KHtml5:fr) \
locale(libKF5KHtml5:ga) \
locale(libKF5KHtml5:gd) \
locale(libKF5KHtml5:gl) \
locale(libKF5KHtml5:gu) \
locale(libKF5KHtml5:he) \
locale(libKF5KHtml5:hi) \
locale(libKF5KHtml5:hr) \
locale(libKF5KHtml5:hu) \
locale(libKF5KHtml5:ia) \
locale(libKF5KHtml5:id) \
locale(libKF5KHtml5:is) \
locale(libKF5KHtml5:it) \
locale(libKF5KHtml5:ja) \
locale(libKF5KHtml5:ka) \
locale(libKF5KHtml5:kk) \
locale(libKF5KHtml5:km) \
locale(libKF5KHtml5:kn) \
locale(libKF5KHtml5:ko) \
locale(libKF5KHtml5:lt) \
locale(libKF5KHtml5:lv) \
locale(libKF5KHtml5:mai) \
locale(libKF5KHtml5:mk) \
locale(libKF5KHtml5:ml) \
locale(libKF5KHtml5:mr) \
locale(libKF5KHtml5:ms) \
locale(libKF5KHtml5:nb) \
locale(libKF5KHtml5:nds) \
locale(libKF5KHtml5:ne) \
locale(libKF5KHtml5:nl) \
locale(libKF5KHtml5:nn) \
locale(libKF5KHtml5:oc) \
locale(libKF5KHtml5:or) \
locale(libKF5KHtml5:pa) \
locale(libKF5KHtml5:pl) \
locale(libKF5KHtml5:pt) \
locale(libKF5KHtml5:pt_BR) \
locale(libKF5KHtml5:ro) \
locale(libKF5KHtml5:ru) \
locale(libKF5KHtml5:si) \
locale(libKF5KHtml5:sk) \
locale(libKF5KHtml5:sl) \
locale(libKF5KHtml5:sq) \
locale(libKF5KHtml5:sr) \
locale(libKF5KHtml5:sr@ijekavian) \
locale(libKF5KHtml5:sr@ijekavianlatin) \
locale(libKF5KHtml5:sr@latin) \
locale(libKF5KHtml5:sv) \
locale(libKF5KHtml5:ta) \
locale(libKF5KHtml5:te) \
locale(libKF5KHtml5:th) \
locale(libKF5KHtml5:tr) \
locale(libKF5KHtml5:ug) \
locale(libKF5KHtml5:uk) \
locale(libKF5KHtml5:vi) \
locale(libKF5KHtml5:wa) \
locale(libKF5KHtml5:zh_CN) \
locale(libKF5KHtml5:zh_HK) \
locale(libKF5KHtml5:zh_TW)"

RDEPENDS:${PN} += "libKF5KHtml5"

inherit rpm
