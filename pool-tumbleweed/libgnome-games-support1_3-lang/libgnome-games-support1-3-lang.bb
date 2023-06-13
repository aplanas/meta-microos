SUMMARY = "Translations for package libgnome-games-support1_3"
DESCRIPTION = "Provides translations for the 'libgnome-games-support1_3' package."
LICENSE = "LGPL-3.0-or-later"

PV = "1.8.2"

RPM_NAME = "libgnome-games-support1_3-lang-1.8.2-1.7.noarch.rpm"
RPM_HASH = "b08f88ff107ef84ae9006e0862e8bff6dcae133712873ec0ae1bba6577f1cf068d023c7ad61759601f20e0f4a92399176e0007eaf0bf8007e0b3aa417266ea8d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgnome-games-support1_3-lang \
libgnome-games-support1_3-lang-all \
locale(libgnome-games-support1_3:af) \
locale(libgnome-games-support1_3:ar) \
locale(libgnome-games-support1_3:be) \
locale(libgnome-games-support1_3:bg) \
locale(libgnome-games-support1_3:ca) \
locale(libgnome-games-support1_3:ca@valencia) \
locale(libgnome-games-support1_3:cs) \
locale(libgnome-games-support1_3:da) \
locale(libgnome-games-support1_3:de) \
locale(libgnome-games-support1_3:el) \
locale(libgnome-games-support1_3:en_GB) \
locale(libgnome-games-support1_3:eo) \
locale(libgnome-games-support1_3:es) \
locale(libgnome-games-support1_3:eu) \
locale(libgnome-games-support1_3:fa) \
locale(libgnome-games-support1_3:fi) \
locale(libgnome-games-support1_3:fr) \
locale(libgnome-games-support1_3:fur) \
locale(libgnome-games-support1_3:gl) \
locale(libgnome-games-support1_3:he) \
locale(libgnome-games-support1_3:hr) \
locale(libgnome-games-support1_3:hu) \
locale(libgnome-games-support1_3:id) \
locale(libgnome-games-support1_3:is) \
locale(libgnome-games-support1_3:it) \
locale(libgnome-games-support1_3:ja) \
locale(libgnome-games-support1_3:kk) \
locale(libgnome-games-support1_3:ko) \
locale(libgnome-games-support1_3:lt) \
locale(libgnome-games-support1_3:lv) \
locale(libgnome-games-support1_3:ml) \
locale(libgnome-games-support1_3:ms) \
locale(libgnome-games-support1_3:nb) \
locale(libgnome-games-support1_3:ne) \
locale(libgnome-games-support1_3:nl) \
locale(libgnome-games-support1_3:oc) \
locale(libgnome-games-support1_3:pa) \
locale(libgnome-games-support1_3:pl) \
locale(libgnome-games-support1_3:pt) \
locale(libgnome-games-support1_3:pt_BR) \
locale(libgnome-games-support1_3:ro) \
locale(libgnome-games-support1_3:ru) \
locale(libgnome-games-support1_3:sk) \
locale(libgnome-games-support1_3:sl) \
locale(libgnome-games-support1_3:sr) \
locale(libgnome-games-support1_3:sr@latin) \
locale(libgnome-games-support1_3:sv) \
locale(libgnome-games-support1_3:ta) \
locale(libgnome-games-support1_3:tr) \
locale(libgnome-games-support1_3:uk) \
locale(libgnome-games-support1_3:zh_CN) \
locale(libgnome-games-support1_3:zh_TW)"

RDEPENDS:${PN} += "libgnome-games-support1_3"

inherit rpm
