SUMMARY = "Translations for package kde-print-manager"
DESCRIPTION = "Provides translations for the 'kde-print-manager' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kde-print-manager-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "98d0a676d04efb861cfe1175061c788324cec8663453b7c3741d8746fdfc173915bc13d48b99805260709ac570390d18aa16ec0cfa870fb02c423f0dec6b6d88"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kde-print-manager-lang \
kde-print-manager-lang-all \
locale(kde-print-manager:ar) \
locale(kde-print-manager:az) \
locale(kde-print-manager:be) \
locale(kde-print-manager:bg) \
locale(kde-print-manager:bs) \
locale(kde-print-manager:ca) \
locale(kde-print-manager:ca@valencia) \
locale(kde-print-manager:cs) \
locale(kde-print-manager:da) \
locale(kde-print-manager:de) \
locale(kde-print-manager:el) \
locale(kde-print-manager:en_GB) \
locale(kde-print-manager:es) \
locale(kde-print-manager:et) \
locale(kde-print-manager:eu) \
locale(kde-print-manager:fi) \
locale(kde-print-manager:fr) \
locale(kde-print-manager:ga) \
locale(kde-print-manager:gl) \
locale(kde-print-manager:hu) \
locale(kde-print-manager:ia) \
locale(kde-print-manager:id) \
locale(kde-print-manager:is) \
locale(kde-print-manager:it) \
locale(kde-print-manager:ja) \
locale(kde-print-manager:ka) \
locale(kde-print-manager:kk) \
locale(kde-print-manager:km) \
locale(kde-print-manager:ko) \
locale(kde-print-manager:lt) \
locale(kde-print-manager:mr) \
locale(kde-print-manager:nb) \
locale(kde-print-manager:nds) \
locale(kde-print-manager:nl) \
locale(kde-print-manager:nn) \
locale(kde-print-manager:pa) \
locale(kde-print-manager:pl) \
locale(kde-print-manager:pt) \
locale(kde-print-manager:pt_BR) \
locale(kde-print-manager:ro) \
locale(kde-print-manager:ru) \
locale(kde-print-manager:sk) \
locale(kde-print-manager:sl) \
locale(kde-print-manager:sr) \
locale(kde-print-manager:sr@ijekavian) \
locale(kde-print-manager:sr@ijekavianlatin) \
locale(kde-print-manager:sr@latin) \
locale(kde-print-manager:sv) \
locale(kde-print-manager:ta) \
locale(kde-print-manager:tr) \
locale(kde-print-manager:ug) \
locale(kde-print-manager:uk) \
locale(kde-print-manager:zh_CN) \
locale(kde-print-manager:zh_TW)"

RDEPENDS:${PN} += "kde-print-manager"

inherit rpm
