SUMMARY = "Translations for package colord-kde"
DESCRIPTION = "Provides translations for the 'colord-kde' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "colord-kde-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "13a64e54c9098f7cef50468bb725539a00e90de1a3ee4a7b4f68e812ae68e70cab80b6767c3ffc062cbd8dd2853150d3a2f500f0d8e660978da56a2d2ee94b62"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "colord-kde-lang \
colord-kde-lang-all \
locale(colord-kde:ar) \
locale(colord-kde:az) \
locale(colord-kde:bg) \
locale(colord-kde:bs) \
locale(colord-kde:ca) \
locale(colord-kde:ca@valencia) \
locale(colord-kde:cs) \
locale(colord-kde:da) \
locale(colord-kde:de) \
locale(colord-kde:el) \
locale(colord-kde:en_GB) \
locale(colord-kde:es) \
locale(colord-kde:et) \
locale(colord-kde:eu) \
locale(colord-kde:fi) \
locale(colord-kde:fr) \
locale(colord-kde:ga) \
locale(colord-kde:gl) \
locale(colord-kde:hu) \
locale(colord-kde:id) \
locale(colord-kde:it) \
locale(colord-kde:ja) \
locale(colord-kde:ka) \
locale(colord-kde:km) \
locale(colord-kde:ko) \
locale(colord-kde:lt) \
locale(colord-kde:mr) \
locale(colord-kde:nl) \
locale(colord-kde:nn) \
locale(colord-kde:pa) \
locale(colord-kde:pl) \
locale(colord-kde:pt) \
locale(colord-kde:pt_BR) \
locale(colord-kde:ro) \
locale(colord-kde:ru) \
locale(colord-kde:sk) \
locale(colord-kde:sl) \
locale(colord-kde:sv) \
locale(colord-kde:ta) \
locale(colord-kde:tr) \
locale(colord-kde:ug) \
locale(colord-kde:uk) \
locale(colord-kde:zh_CN) \
locale(colord-kde:zh_TW)"

RDEPENDS:${PN} += "colord-kde"

inherit rpm
