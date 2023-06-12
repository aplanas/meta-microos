SUMMARY = "Language translations for authselect"
DESCRIPTION = "This package contains the language translation files for authselect"
LICENSE = "GPL-3.0-or-later"

PV = "1.4.0+git.0.2c30265"

RPM_NAME = "authselect-lang-1.4.0+git.0.2c30265-3.2.aarch64.rpm"
RPM_HASH = "27a7f77da9139e2e2f6b2aa82147a3634c5b2ed504a8007c425fc1aac39c53e45a636d6dc4dd561c399af82f14f2cf123d894000c9151ded1d4d1a6cd3b095aa"

RPROVIDES:${PN} += "authselect-lang \
authselect-lang(aarch-64) \
locale(authselect:ca) \
locale(authselect:cs) \
locale(authselect:de) \
locale(authselect:es) \
locale(authselect:fa) \
locale(authselect:fi) \
locale(authselect:fr) \
locale(authselect:hu) \
locale(authselect:id) \
locale(authselect:it) \
locale(authselect:ja) \
locale(authselect:ka) \
locale(authselect:ko) \
locale(authselect:nl) \
locale(authselect:pl) \
locale(authselect:pt) \
locale(authselect:pt_BR) \
locale(authselect:ru) \
locale(authselect:si) \
locale(authselect:sv) \
locale(authselect:tr) \
locale(authselect:uk) \
locale(authselect:zh_CN) \
locale(authselect:zh_TW)"
RDEPENDS:${PN} += ""

inherit rpm
