SUMMARY = "Translations for package libgsf"
DESCRIPTION = "Provides translations for the 'libgsf' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "1.14.50"

RPM_NAME = "libgsf-lang-1.14.50-1.5.noarch.rpm"
RPM_HASH = "fe75dfb6b02606acdff0036e25b4acdefd304bd962b44d5383d409a94d476a3f853f8fcb8984033ae988ee46b4100cdc4e99b678c424042a62c4a5668a0b9ce4"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "libgsf-lang \
libgsf-lang-all \
locale(libgsf:as) \
locale(libgsf:bs) \
locale(libgsf:ca) \
locale(libgsf:ca@valencia) \
locale(libgsf:cs) \
locale(libgsf:da) \
locale(libgsf:de) \
locale(libgsf:el) \
locale(libgsf:en_GB) \
locale(libgsf:eo) \
locale(libgsf:es) \
locale(libgsf:eu) \
locale(libgsf:fi) \
locale(libgsf:fr) \
locale(libgsf:gl) \
locale(libgsf:he) \
locale(libgsf:hu) \
locale(libgsf:id) \
locale(libgsf:it) \
locale(libgsf:ja) \
locale(libgsf:ko) \
locale(libgsf:lt) \
locale(libgsf:lv) \
locale(libgsf:ml) \
locale(libgsf:nb) \
locale(libgsf:nl) \
locale(libgsf:nn) \
locale(libgsf:oc) \
locale(libgsf:pa) \
locale(libgsf:pl) \
locale(libgsf:pt) \
locale(libgsf:pt_BR) \
locale(libgsf:ro) \
locale(libgsf:ru) \
locale(libgsf:sk) \
locale(libgsf:sl) \
locale(libgsf:sr) \
locale(libgsf:sr@latin) \
locale(libgsf:sv) \
locale(libgsf:ta) \
locale(libgsf:th) \
locale(libgsf:tr) \
locale(libgsf:uk) \
locale(libgsf:zh_CN) \
locale(libgsf:zh_HK) \
locale(libgsf:zh_TW)"

RDEPENDS:${PN} += "libgsf"

inherit rpm
