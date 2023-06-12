SUMMARY = "Translations for package openconnect"
DESCRIPTION = "Provides translations for the 'openconnect' package."
LICENSE = "LGPL-2.1-or-later"

PV = "9.12"

RPM_NAME = "openconnect-lang-9.12-1.1.noarch.rpm"
RPM_HASH = "d17f4e41608a931cd50210bc8907aa2bb9ac9df7a64c6fd9b395071a61093f7c26715859f5fe1bdf6488296b7378d67579c036d1b194530587298141d4077bb8"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(openconnect:ar) \
locale(openconnect:bs) \
locale(openconnect:ca) \
locale(openconnect:cs) \
locale(openconnect:da) \
locale(openconnect:de) \
locale(openconnect:el) \
locale(openconnect:en_GB) \
locale(openconnect:en_US) \
locale(openconnect:es) \
locale(openconnect:eu) \
locale(openconnect:fi) \
locale(openconnect:fr) \
locale(openconnect:gl) \
locale(openconnect:hr) \
locale(openconnect:hu) \
locale(openconnect:id) \
locale(openconnect:it) \
locale(openconnect:ka) \
locale(openconnect:lt) \
locale(openconnect:nl) \
locale(openconnect:pa) \
locale(openconnect:pl) \
locale(openconnect:pt) \
locale(openconnect:pt_BR) \
locale(openconnect:sk) \
locale(openconnect:sl) \
locale(openconnect:sr) \
locale(openconnect:sr@latin) \
locale(openconnect:sv) \
locale(openconnect:tr) \
locale(openconnect:ug) \
locale(openconnect:uk) \
locale(openconnect:zh_CN) \
locale(openconnect:zh_TW) \
openconnect-lang \
openconnect-lang-all"
RDEPENDS:${PN} += "openconnect"

inherit rpm
