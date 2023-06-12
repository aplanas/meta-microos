SUMMARY = "Translations for package libkomparediff2"
DESCRIPTION = "Provides translations for the 'libkomparediff2' package."
LICENSE = "(GPL-2.0-or-later & LGPL-2.0-or-later) & BSD-2-Clause"

PV = "23.04.1"

RPM_NAME = "libkomparediff2-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "9b4727e65d8fbab0e91d6f7aa64d6ba5fecf000c97a5a9b2f3b14ac9dda8c7789a76394090ed93399326d84dbead72fbf7aadbbc34de691b6f9e677b3f48ee8f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libkomparediff2-lang \
libkomparediff2-lang-all \
locale(libkomparediff2:af) \
locale(libkomparediff2:ar) \
locale(libkomparediff2:be) \
locale(libkomparediff2:bg) \
locale(libkomparediff2:br) \
locale(libkomparediff2:bs) \
locale(libkomparediff2:ca) \
locale(libkomparediff2:ca@valencia) \
locale(libkomparediff2:cs) \
locale(libkomparediff2:cy) \
locale(libkomparediff2:da) \
locale(libkomparediff2:de) \
locale(libkomparediff2:el) \
locale(libkomparediff2:en_GB) \
locale(libkomparediff2:eo) \
locale(libkomparediff2:es) \
locale(libkomparediff2:et) \
locale(libkomparediff2:eu) \
locale(libkomparediff2:fa) \
locale(libkomparediff2:fi) \
locale(libkomparediff2:fr) \
locale(libkomparediff2:ga) \
locale(libkomparediff2:gl) \
locale(libkomparediff2:hi) \
locale(libkomparediff2:hr) \
locale(libkomparediff2:hu) \
locale(libkomparediff2:is) \
locale(libkomparediff2:it) \
locale(libkomparediff2:ja) \
locale(libkomparediff2:ka) \
locale(libkomparediff2:kk) \
locale(libkomparediff2:km) \
locale(libkomparediff2:ko) \
locale(libkomparediff2:lt) \
locale(libkomparediff2:lv) \
locale(libkomparediff2:mai) \
locale(libkomparediff2:mk) \
locale(libkomparediff2:mr) \
locale(libkomparediff2:ms) \
locale(libkomparediff2:nb) \
locale(libkomparediff2:nds) \
locale(libkomparediff2:ne) \
locale(libkomparediff2:nl) \
locale(libkomparediff2:nn) \
locale(libkomparediff2:oc) \
locale(libkomparediff2:pa) \
locale(libkomparediff2:pl) \
locale(libkomparediff2:pt) \
locale(libkomparediff2:pt_BR) \
locale(libkomparediff2:ro) \
locale(libkomparediff2:ru) \
locale(libkomparediff2:sk) \
locale(libkomparediff2:sl) \
locale(libkomparediff2:sq) \
locale(libkomparediff2:sr) \
locale(libkomparediff2:sr@ijekavian) \
locale(libkomparediff2:sr@ijekavianlatin) \
locale(libkomparediff2:sr@latin) \
locale(libkomparediff2:sv) \
locale(libkomparediff2:ta) \
locale(libkomparediff2:tr) \
locale(libkomparediff2:ug) \
locale(libkomparediff2:uk) \
locale(libkomparediff2:zh_CN) \
locale(libkomparediff2:zh_TW)"
RDEPENDS:${PN} += "libkomparediff2"

inherit rpm
