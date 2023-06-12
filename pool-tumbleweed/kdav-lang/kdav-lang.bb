SUMMARY = "Translations for package kdav"
DESCRIPTION = "Provides translations for the 'kdav' package."
LICENSE = "LGPL-2.0-or-later"

PV = "5.106.0"

RPM_NAME = "kdav-lang-5.106.0-1.1.noarch.rpm"
RPM_HASH = "d6882a54ce16b370f62b9f87ba3f03a94155727d841856885a47b0b979a3e5641c1f713156a1b3acdbeb83290d1ef0cdde7a94c6b1096c673579959be134fba1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdav-lang \
kdav-lang-all \
locale(kdav:ar) \
locale(kdav:az) \
locale(kdav:bg) \
locale(kdav:ca) \
locale(kdav:ca@valencia) \
locale(kdav:cs) \
locale(kdav:de) \
locale(kdav:el) \
locale(kdav:en_GB) \
locale(kdav:es) \
locale(kdav:et) \
locale(kdav:eu) \
locale(kdav:fi) \
locale(kdav:fr) \
locale(kdav:gl) \
locale(kdav:hi) \
locale(kdav:ia) \
locale(kdav:it) \
locale(kdav:ja) \
locale(kdav:ka) \
locale(kdav:ko) \
locale(kdav:lt) \
locale(kdav:nb) \
locale(kdav:nl) \
locale(kdav:nn) \
locale(kdav:pl) \
locale(kdav:pt) \
locale(kdav:pt_BR) \
locale(kdav:ro) \
locale(kdav:ru) \
locale(kdav:sk) \
locale(kdav:sl) \
locale(kdav:sr) \
locale(kdav:sr@ijekavian) \
locale(kdav:sr@ijekavianlatin) \
locale(kdav:sr@latin) \
locale(kdav:sv) \
locale(kdav:tr) \
locale(kdav:uk) \
locale(kdav:zh_CN) \
locale(kdav:zh_TW)"
RDEPENDS:${PN} += "kdav"

inherit rpm
