SUMMARY = "Translations for package falkon"
DESCRIPTION = "Provides translations for the 'falkon' package."
LICENSE = "GPL-3.0-or-later"

PV = "23.04.1"

RPM_NAME = "falkon-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "327842eb83c01ee8f254459521a7f0805a5f9f73b85d1243d0631789b200a93f51f7c0761cd7dc780e46c9734bffedafcaf9a51c7ffe4276ddf5e8e3b14b9e79"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "falkon-lang \
falkon-lang-all \
locale(falkon:ar) \
locale(falkon:az) \
locale(falkon:bg) \
locale(falkon:ca) \
locale(falkon:ca@valencia) \
locale(falkon:cs) \
locale(falkon:da) \
locale(falkon:de) \
locale(falkon:el) \
locale(falkon:en) \
locale(falkon:en_GB) \
locale(falkon:es) \
locale(falkon:et) \
locale(falkon:eu) \
locale(falkon:fa) \
locale(falkon:fi) \
locale(falkon:fr) \
locale(falkon:gl) \
locale(falkon:hu) \
locale(falkon:ia) \
locale(falkon:id) \
locale(falkon:is) \
locale(falkon:it) \
locale(falkon:ja) \
locale(falkon:ka) \
locale(falkon:ko) \
locale(falkon:lt) \
locale(falkon:lv) \
locale(falkon:nb) \
locale(falkon:nl) \
locale(falkon:nn) \
locale(falkon:pa) \
locale(falkon:pl) \
locale(falkon:pt) \
locale(falkon:pt_BR) \
locale(falkon:ro) \
locale(falkon:ru) \
locale(falkon:sk) \
locale(falkon:sl) \
locale(falkon:sr) \
locale(falkon:sr@ijekavian) \
locale(falkon:sr@ijekavianlatin) \
locale(falkon:sr@latin) \
locale(falkon:sv) \
locale(falkon:ta) \
locale(falkon:tr) \
locale(falkon:uk) \
locale(falkon:zh_CN) \
locale(falkon:zh_HK) \
locale(falkon:zh_TW)"

RDEPENDS:${PN} += "falkon"

inherit rpm
