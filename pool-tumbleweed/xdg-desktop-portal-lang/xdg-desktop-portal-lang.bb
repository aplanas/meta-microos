SUMMARY = "Translations for package xdg-desktop-portal"
DESCRIPTION = "Provides translations for the 'xdg-desktop-portal' package."
LICENSE = "LGPL-2.1-or-later"

PV = "1.16.0"

RPM_NAME = "xdg-desktop-portal-lang-1.16.0-1.3.noarch.rpm"
RPM_HASH = "802dcd26965627d0cd46772e76a75d483274916a64eb4c30276b7a7a9aefc614b81853f1b4606e27536206a5841e3e8325906d23203dc2fde496cf32c2fbb83c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xdg-desktop-portal:cs) \
locale(xdg-desktop-portal:da) \
locale(xdg-desktop-portal:de) \
locale(xdg-desktop-portal:en_GB) \
locale(xdg-desktop-portal:es) \
locale(xdg-desktop-portal:fr) \
locale(xdg-desktop-portal:gl) \
locale(xdg-desktop-portal:he) \
locale(xdg-desktop-portal:hi) \
locale(xdg-desktop-portal:hr) \
locale(xdg-desktop-portal:hu) \
locale(xdg-desktop-portal:id) \
locale(xdg-desktop-portal:it) \
locale(xdg-desktop-portal:ka) \
locale(xdg-desktop-portal:lt) \
locale(xdg-desktop-portal:nl) \
locale(xdg-desktop-portal:oc) \
locale(xdg-desktop-portal:pl) \
locale(xdg-desktop-portal:pt) \
locale(xdg-desktop-portal:pt_BR) \
locale(xdg-desktop-portal:ro) \
locale(xdg-desktop-portal:ru) \
locale(xdg-desktop-portal:sk) \
locale(xdg-desktop-portal:sr) \
locale(xdg-desktop-portal:sv) \
locale(xdg-desktop-portal:tr) \
locale(xdg-desktop-portal:uk) \
locale(xdg-desktop-portal:zh_CN) \
locale(xdg-desktop-portal:zh_TW) \
xdg-desktop-portal-lang \
xdg-desktop-portal-lang-all"

RDEPENDS:${PN} += "xdg-desktop-portal"

inherit rpm
