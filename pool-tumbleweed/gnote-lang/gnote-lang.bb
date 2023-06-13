SUMMARY = "Translations for package gnote"
DESCRIPTION = "Provides translations for the 'gnote' package."
LICENSE = "GPL-3.0-or-later"

PV = "44.0"

RPM_NAME = "gnote-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "3cfb3f4e5b877852ec16743e4acf2d2f0f7ff90c754a52b37fc82003ea2fb63aea6ad4910a3f42b78939bf7d70d4cc4a25be3a29551e2ba1e26097fda37030dc"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnote-lang \
gnote-lang-all \
locale(gnote:ar) \
locale(gnote:as) \
locale(gnote:bg) \
locale(gnote:bn_IN) \
locale(gnote:bs) \
locale(gnote:ca) \
locale(gnote:ca@valencia) \
locale(gnote:cs) \
locale(gnote:da) \
locale(gnote:de) \
locale(gnote:el) \
locale(gnote:en_GB) \
locale(gnote:eo) \
locale(gnote:es) \
locale(gnote:eu) \
locale(gnote:fi) \
locale(gnote:fr) \
locale(gnote:gl) \
locale(gnote:gu) \
locale(gnote:he) \
locale(gnote:hi) \
locale(gnote:hu) \
locale(gnote:id) \
locale(gnote:it) \
locale(gnote:ja) \
locale(gnote:kn) \
locale(gnote:ko) \
locale(gnote:lt) \
locale(gnote:lv) \
locale(gnote:ml) \
locale(gnote:mr) \
locale(gnote:nb) \
locale(gnote:nl) \
locale(gnote:oc) \
locale(gnote:or) \
locale(gnote:pa) \
locale(gnote:pl) \
locale(gnote:pt) \
locale(gnote:pt_BR) \
locale(gnote:ro) \
locale(gnote:ru) \
locale(gnote:sk) \
locale(gnote:sl) \
locale(gnote:sr) \
locale(gnote:sr@latin) \
locale(gnote:sv) \
locale(gnote:ta) \
locale(gnote:te) \
locale(gnote:th) \
locale(gnote:tr) \
locale(gnote:uk) \
locale(gnote:zh_CN) \
locale(gnote:zh_HK) \
locale(gnote:zh_TW)"

RDEPENDS:${PN} += "gnote"

inherit rpm
