SUMMARY = "Translations for package xdg-desktop-portal-kde"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal-kde' package."
LICENSE = "LGPL-2.1-or-later"

PV = "5.27.5"

RPM_NAME = "xdg-desktop-portal-kde-lang-5.27.5-1.1.noarch.rpm"
RPM_HASH = "144e3db7364231cbe5023cae771ef7359b58c3ce29cd2e1066ccf9b5cc232fe4202246af176f54d2fb59c9be957bb2e654a72690c46fe0412c93c67fa6d4c1bd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xdg-desktop-portal-kde:ar) \
locale(xdg-desktop-portal-kde:az) \
locale(xdg-desktop-portal-kde:bg) \
locale(xdg-desktop-portal-kde:ca) \
locale(xdg-desktop-portal-kde:ca@valencia) \
locale(xdg-desktop-portal-kde:cs) \
locale(xdg-desktop-portal-kde:da) \
locale(xdg-desktop-portal-kde:de) \
locale(xdg-desktop-portal-kde:el) \
locale(xdg-desktop-portal-kde:en_GB) \
locale(xdg-desktop-portal-kde:es) \
locale(xdg-desktop-portal-kde:et) \
locale(xdg-desktop-portal-kde:eu) \
locale(xdg-desktop-portal-kde:fi) \
locale(xdg-desktop-portal-kde:fr) \
locale(xdg-desktop-portal-kde:gl) \
locale(xdg-desktop-portal-kde:he) \
locale(xdg-desktop-portal-kde:hu) \
locale(xdg-desktop-portal-kde:ia) \
locale(xdg-desktop-portal-kde:id) \
locale(xdg-desktop-portal-kde:it) \
locale(xdg-desktop-portal-kde:ja) \
locale(xdg-desktop-portal-kde:ka) \
locale(xdg-desktop-portal-kde:ko) \
locale(xdg-desktop-portal-kde:lt) \
locale(xdg-desktop-portal-kde:ml) \
locale(xdg-desktop-portal-kde:nl) \
locale(xdg-desktop-portal-kde:nn) \
locale(xdg-desktop-portal-kde:pa) \
locale(xdg-desktop-portal-kde:pl) \
locale(xdg-desktop-portal-kde:pt) \
locale(xdg-desktop-portal-kde:pt_BR) \
locale(xdg-desktop-portal-kde:ro) \
locale(xdg-desktop-portal-kde:ru) \
locale(xdg-desktop-portal-kde:sk) \
locale(xdg-desktop-portal-kde:sl) \
locale(xdg-desktop-portal-kde:sr) \
locale(xdg-desktop-portal-kde:sr@ijekavian) \
locale(xdg-desktop-portal-kde:sr@ijekavianlatin) \
locale(xdg-desktop-portal-kde:sr@latin) \
locale(xdg-desktop-portal-kde:sv) \
locale(xdg-desktop-portal-kde:ta) \
locale(xdg-desktop-portal-kde:tr) \
locale(xdg-desktop-portal-kde:uk) \
locale(xdg-desktop-portal-kde:zh_CN) \
locale(xdg-desktop-portal-kde:zh_TW) \
xdg-desktop-portal-kde-lang \
xdg-desktop-portal-kde-lang-all"
RDEPENDS:${PN} += "xdg-desktop-portal-kde"

inherit rpm
