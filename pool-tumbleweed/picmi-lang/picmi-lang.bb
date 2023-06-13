SUMMARY = "Translations for package picmi"
DESCRIPTION = "Provides translations for the 'picmi' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "picmi-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "ea64c6e3cf582cbe7e6b86699769a6f8771ec10f4da2b1e79c6973314c3c985ff8f71778aa8607485c7fb62dc766dff813ad164a1948290774036b29d0b1147d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(picmi:bs) \
locale(picmi:ca) \
locale(picmi:ca@valencia) \
locale(picmi:cs) \
locale(picmi:da) \
locale(picmi:de) \
locale(picmi:el) \
locale(picmi:en_GB) \
locale(picmi:es) \
locale(picmi:et) \
locale(picmi:eu) \
locale(picmi:fi) \
locale(picmi:fr) \
locale(picmi:ga) \
locale(picmi:gl) \
locale(picmi:hu) \
locale(picmi:it) \
locale(picmi:ja) \
locale(picmi:ka) \
locale(picmi:kk) \
locale(picmi:ko) \
locale(picmi:lt) \
locale(picmi:lv) \
locale(picmi:ml) \
locale(picmi:mr) \
locale(picmi:nb) \
locale(picmi:nds) \
locale(picmi:nl) \
locale(picmi:nn) \
locale(picmi:pl) \
locale(picmi:pt) \
locale(picmi:pt_BR) \
locale(picmi:ro) \
locale(picmi:ru) \
locale(picmi:sk) \
locale(picmi:sl) \
locale(picmi:sr) \
locale(picmi:sr@ijekavian) \
locale(picmi:sr@ijekavianlatin) \
locale(picmi:sr@latin) \
locale(picmi:sv) \
locale(picmi:tr) \
locale(picmi:ug) \
locale(picmi:uk) \
locale(picmi:zh_CN) \
locale(picmi:zh_TW) \
picmi-lang \
picmi-lang-all"

RDEPENDS:${PN} += "picmi"

inherit rpm
