SUMMARY = "Translations for package libsoup"
DESCRIPTION = "Provides translations for the 'libsoup' package."
LICENSE = "LGPL-2.1-or-later"

PV = "3.4.2"

RPM_NAME = "libsoup-lang-3.4.2-1.1.noarch.rpm"
RPM_HASH = "518e34088711e670d54b8db6b1ce0f5e088590b7623f079af8361855a5e185cb88c313942119490d73397ce135a3f748cb7fac5e97357b9514b08290739c1ea2"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libsoup-lang \
libsoup-lang-all \
locale(libsoup:as) \
locale(libsoup:be) \
locale(libsoup:bg) \
locale(libsoup:bn_IN) \
locale(libsoup:bs) \
locale(libsoup:ca) \
locale(libsoup:ca@valencia) \
locale(libsoup:cs) \
locale(libsoup:da) \
locale(libsoup:de) \
locale(libsoup:el) \
locale(libsoup:en_GB) \
locale(libsoup:eo) \
locale(libsoup:es) \
locale(libsoup:et) \
locale(libsoup:eu) \
locale(libsoup:fa) \
locale(libsoup:fi) \
locale(libsoup:fr) \
locale(libsoup:fur) \
locale(libsoup:gd) \
locale(libsoup:gl) \
locale(libsoup:gu) \
locale(libsoup:he) \
locale(libsoup:hi) \
locale(libsoup:hr) \
locale(libsoup:hu) \
locale(libsoup:id) \
locale(libsoup:it) \
locale(libsoup:ja) \
locale(libsoup:ka) \
locale(libsoup:kn) \
locale(libsoup:ko) \
locale(libsoup:lt) \
locale(libsoup:lv) \
locale(libsoup:ml) \
locale(libsoup:mr) \
locale(libsoup:ms) \
locale(libsoup:nb) \
locale(libsoup:ne) \
locale(libsoup:nl) \
locale(libsoup:oc) \
locale(libsoup:or) \
locale(libsoup:pa) \
locale(libsoup:pl) \
locale(libsoup:pt) \
locale(libsoup:pt_BR) \
locale(libsoup:ro) \
locale(libsoup:ru) \
locale(libsoup:sk) \
locale(libsoup:sl) \
locale(libsoup:sr) \
locale(libsoup:sr@latin) \
locale(libsoup:sv) \
locale(libsoup:ta) \
locale(libsoup:te) \
locale(libsoup:th) \
locale(libsoup:tr) \
locale(libsoup:ug) \
locale(libsoup:uk) \
locale(libsoup:vi) \
locale(libsoup:zh_CN) \
locale(libsoup:zh_HK) \
locale(libsoup:zh_TW)"

RDEPENDS:${PN} += "libsoup"

inherit rpm
