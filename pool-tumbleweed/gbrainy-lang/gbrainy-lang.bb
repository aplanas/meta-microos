SUMMARY = "Translations for package gbrainy"
DESCRIPTION = "Provides translations for the 'gbrainy' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.6"

RPM_NAME = "gbrainy-lang-2.4.6-1.2.noarch.rpm"
RPM_HASH = "d51e83a998ce7fc021ed909f1adc3df5d4c26977f86974285bee8fe938d9b156722a14b2c54acfd4295c682aeadc71f293fa07970dd8dabebd6cc210962838eb"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gbrainy-lang \
gbrainy-lang-all \
locale(gbrainy:af) \
locale(gbrainy:ar) \
locale(gbrainy:ast) \
locale(gbrainy:bs) \
locale(gbrainy:ca) \
locale(gbrainy:ca@valencia) \
locale(gbrainy:cs) \
locale(gbrainy:da) \
locale(gbrainy:de) \
locale(gbrainy:el) \
locale(gbrainy:en_GB) \
locale(gbrainy:eo) \
locale(gbrainy:es) \
locale(gbrainy:eu) \
locale(gbrainy:fi) \
locale(gbrainy:fr) \
locale(gbrainy:gl) \
locale(gbrainy:hi) \
locale(gbrainy:hr) \
locale(gbrainy:hu) \
locale(gbrainy:id) \
locale(gbrainy:it) \
locale(gbrainy:ka) \
locale(gbrainy:ko) \
locale(gbrainy:lv) \
locale(gbrainy:nb) \
locale(gbrainy:nl) \
locale(gbrainy:oc) \
locale(gbrainy:pl) \
locale(gbrainy:pt) \
locale(gbrainy:pt_BR) \
locale(gbrainy:ro) \
locale(gbrainy:ru) \
locale(gbrainy:sk) \
locale(gbrainy:sl) \
locale(gbrainy:sr) \
locale(gbrainy:sr@latin) \
locale(gbrainy:sv) \
locale(gbrainy:ta) \
locale(gbrainy:te) \
locale(gbrainy:th) \
locale(gbrainy:tr) \
locale(gbrainy:ug) \
locale(gbrainy:uk) \
locale(gbrainy:vi) \
locale(gbrainy:zh_CN) \
locale(gbrainy:zh_HK) \
locale(gbrainy:zh_TW)"

RDEPENDS:${PN} += "gbrainy"

inherit rpm
