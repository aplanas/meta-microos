SUMMARY = "Translations for package polari"
DESCRIPTION = "Provides translations for the 'polari' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "43.0"

RPM_NAME = "polari-lang-43.0-1.3.noarch.rpm"
RPM_HASH = "0f116d8c8708880cbda47b4419bcc4fa71b7b792524eb98a8f13e8b64c78198f1abe0c97223ffaea26c229caf64c13f7bb2a5b0b760f5a5b3ced9a7d889cd770"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(polari:af) \
locale(polari:ar) \
locale(polari:as) \
locale(polari:be) \
locale(polari:bs) \
locale(polari:ca) \
locale(polari:ca@valencia) \
locale(polari:cs) \
locale(polari:da) \
locale(polari:de) \
locale(polari:el) \
locale(polari:en_GB) \
locale(polari:eo) \
locale(polari:es) \
locale(polari:et) \
locale(polari:eu) \
locale(polari:fa) \
locale(polari:fi) \
locale(polari:fr) \
locale(polari:fur) \
locale(polari:gl) \
locale(polari:he) \
locale(polari:hr) \
locale(polari:hu) \
locale(polari:id) \
locale(polari:it) \
locale(polari:ja) \
locale(polari:ka) \
locale(polari:kk) \
locale(polari:ko) \
locale(polari:lt) \
locale(polari:lv) \
locale(polari:ml) \
locale(polari:ms) \
locale(polari:nb) \
locale(polari:ne) \
locale(polari:nl) \
locale(polari:oc) \
locale(polari:pa) \
locale(polari:pl) \
locale(polari:pt) \
locale(polari:pt_BR) \
locale(polari:ro) \
locale(polari:ru) \
locale(polari:sk) \
locale(polari:sl) \
locale(polari:sr) \
locale(polari:sr@latin) \
locale(polari:sv) \
locale(polari:te) \
locale(polari:tr) \
locale(polari:uk) \
locale(polari:vi) \
locale(polari:zh_CN) \
locale(polari:zh_HK) \
locale(polari:zh_TW) \
polari-lang \
polari-lang-all"

RDEPENDS:${PN} += "polari"

inherit rpm
