SUMMARY = "Translations for package libgnomekbd"
DESCRIPTION = "Provides translations for the 'libgnomekbd' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.28.1"

RPM_NAME = "libgnomekbd-lang-3.28.1-1.3.noarch.rpm"
RPM_HASH = "dd8e1c404e4ef3637bbb9c28a01ab61bcf2d2d3ca721d68c83cf2c6fca1885cc9e3bad9c1a2ffdf9524bb0c0a5fa0b9b10c9c0d94507f90f60c5964beb35dd1c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgnomekbd-lang \
libgnomekbd-lang-all \
locale(libgnomekbd:ar) \
locale(libgnomekbd:as) \
locale(libgnomekbd:ast) \
locale(libgnomekbd:be) \
locale(libgnomekbd:be@latin) \
locale(libgnomekbd:bg) \
locale(libgnomekbd:bn) \
locale(libgnomekbd:bn_IN) \
locale(libgnomekbd:bs) \
locale(libgnomekbd:ca) \
locale(libgnomekbd:ca@valencia) \
locale(libgnomekbd:cs) \
locale(libgnomekbd:da) \
locale(libgnomekbd:de) \
locale(libgnomekbd:dz) \
locale(libgnomekbd:el) \
locale(libgnomekbd:en@shaw) \
locale(libgnomekbd:en_GB) \
locale(libgnomekbd:eo) \
locale(libgnomekbd:es) \
locale(libgnomekbd:et) \
locale(libgnomekbd:eu) \
locale(libgnomekbd:fa) \
locale(libgnomekbd:fi) \
locale(libgnomekbd:fr) \
locale(libgnomekbd:fur) \
locale(libgnomekbd:ga) \
locale(libgnomekbd:gl) \
locale(libgnomekbd:gu) \
locale(libgnomekbd:he) \
locale(libgnomekbd:hi) \
locale(libgnomekbd:hr) \
locale(libgnomekbd:hu) \
locale(libgnomekbd:id) \
locale(libgnomekbd:it) \
locale(libgnomekbd:ja) \
locale(libgnomekbd:ka) \
locale(libgnomekbd:kk) \
locale(libgnomekbd:km) \
locale(libgnomekbd:kn) \
locale(libgnomekbd:ko) \
locale(libgnomekbd:lt) \
locale(libgnomekbd:lv) \
locale(libgnomekbd:mai) \
locale(libgnomekbd:mk) \
locale(libgnomekbd:ml) \
locale(libgnomekbd:mr) \
locale(libgnomekbd:ms) \
locale(libgnomekbd:nb) \
locale(libgnomekbd:nl) \
locale(libgnomekbd:nn) \
locale(libgnomekbd:oc) \
locale(libgnomekbd:or) \
locale(libgnomekbd:pa) \
locale(libgnomekbd:pl) \
locale(libgnomekbd:pt) \
locale(libgnomekbd:pt_BR) \
locale(libgnomekbd:ro) \
locale(libgnomekbd:ru) \
locale(libgnomekbd:si) \
locale(libgnomekbd:sk) \
locale(libgnomekbd:sl) \
locale(libgnomekbd:sq) \
locale(libgnomekbd:sr) \
locale(libgnomekbd:sr@latin) \
locale(libgnomekbd:sv) \
locale(libgnomekbd:ta) \
locale(libgnomekbd:te) \
locale(libgnomekbd:th) \
locale(libgnomekbd:tr) \
locale(libgnomekbd:ug) \
locale(libgnomekbd:uk) \
locale(libgnomekbd:vi) \
locale(libgnomekbd:zh_CN) \
locale(libgnomekbd:zh_HK) \
locale(libgnomekbd:zh_TW)"

RDEPENDS:${PN} += "libgnomekbd"

inherit rpm
