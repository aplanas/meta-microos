SUMMARY = "Translations for package libKF5UnitConversion5"
DESCRIPTION = "Provides translations for the 'libKF5UnitConversion5' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.106.0"

RPM_NAME = "libKF5UnitConversion5-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "16ade220b31f3274831fc4abebc5f4f78bd0d25ab19b4dfbae673f82cf54cb139a13f2811c4b1f28fa61a42987f38d44dd6be04bd213ed1b8d6036404399d3f6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libKF5UnitConversion5-lang \
libKF5UnitConversion5-lang-all \
locale(libKF5UnitConversion5:ar) \
locale(libKF5UnitConversion5:az) \
locale(libKF5UnitConversion5:bg) \
locale(libKF5UnitConversion5:bs) \
locale(libKF5UnitConversion5:ca) \
locale(libKF5UnitConversion5:ca@valencia) \
locale(libKF5UnitConversion5:cs) \
locale(libKF5UnitConversion5:da) \
locale(libKF5UnitConversion5:de) \
locale(libKF5UnitConversion5:el) \
locale(libKF5UnitConversion5:en_GB) \
locale(libKF5UnitConversion5:eo) \
locale(libKF5UnitConversion5:es) \
locale(libKF5UnitConversion5:et) \
locale(libKF5UnitConversion5:eu) \
locale(libKF5UnitConversion5:fi) \
locale(libKF5UnitConversion5:fr) \
locale(libKF5UnitConversion5:ga) \
locale(libKF5UnitConversion5:gd) \
locale(libKF5UnitConversion5:gl) \
locale(libKF5UnitConversion5:hr) \
locale(libKF5UnitConversion5:hu) \
locale(libKF5UnitConversion5:ia) \
locale(libKF5UnitConversion5:id) \
locale(libKF5UnitConversion5:is) \
locale(libKF5UnitConversion5:it) \
locale(libKF5UnitConversion5:ja) \
locale(libKF5UnitConversion5:ka) \
locale(libKF5UnitConversion5:kk) \
locale(libKF5UnitConversion5:ko) \
locale(libKF5UnitConversion5:lt) \
locale(libKF5UnitConversion5:lv) \
locale(libKF5UnitConversion5:ml) \
locale(libKF5UnitConversion5:mr) \
locale(libKF5UnitConversion5:ms) \
locale(libKF5UnitConversion5:nb) \
locale(libKF5UnitConversion5:nds) \
locale(libKF5UnitConversion5:nl) \
locale(libKF5UnitConversion5:nn) \
locale(libKF5UnitConversion5:pa) \
locale(libKF5UnitConversion5:pl) \
locale(libKF5UnitConversion5:pt) \
locale(libKF5UnitConversion5:pt_BR) \
locale(libKF5UnitConversion5:ro) \
locale(libKF5UnitConversion5:ru) \
locale(libKF5UnitConversion5:sk) \
locale(libKF5UnitConversion5:sl) \
locale(libKF5UnitConversion5:sr) \
locale(libKF5UnitConversion5:sr@ijekavian) \
locale(libKF5UnitConversion5:sr@ijekavianlatin) \
locale(libKF5UnitConversion5:sr@latin) \
locale(libKF5UnitConversion5:sv) \
locale(libKF5UnitConversion5:ta) \
locale(libKF5UnitConversion5:th) \
locale(libKF5UnitConversion5:tr) \
locale(libKF5UnitConversion5:ug) \
locale(libKF5UnitConversion5:uk) \
locale(libKF5UnitConversion5:zh_CN) \
locale(libKF5UnitConversion5:zh_TW)"

RDEPENDS:${PN} += "libKF5UnitConversion5"

inherit rpm
