SUMMARY = "Translations for package ktorrent"
DESCRIPTION = "Provides translations for the 'ktorrent' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "ktorrent-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "11a98e7d7cb066ce2901e3b215784870a224851f8b8b126b25f895b8ec2c3fb58e7637cf56f9a364f677a54101768b48bb133792e959dfa442d953d08a75784a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "ktorrent-lang \
ktorrent-lang-all \
locale(ktorrent:ar) \
locale(ktorrent:be) \
locale(ktorrent:bg) \
locale(ktorrent:bs) \
locale(ktorrent:ca) \
locale(ktorrent:ca@valencia) \
locale(ktorrent:cs) \
locale(ktorrent:da) \
locale(ktorrent:de) \
locale(ktorrent:el) \
locale(ktorrent:en_GB) \
locale(ktorrent:eo) \
locale(ktorrent:es) \
locale(ktorrent:et) \
locale(ktorrent:eu) \
locale(ktorrent:fi) \
locale(ktorrent:fr) \
locale(ktorrent:ga) \
locale(ktorrent:gl) \
locale(ktorrent:he) \
locale(ktorrent:hi) \
locale(ktorrent:hr) \
locale(ktorrent:hu) \
locale(ktorrent:ia) \
locale(ktorrent:is) \
locale(ktorrent:it) \
locale(ktorrent:ja) \
locale(ktorrent:ka) \
locale(ktorrent:kk) \
locale(ktorrent:km) \
locale(ktorrent:ko) \
locale(ktorrent:lt) \
locale(ktorrent:lv) \
locale(ktorrent:mr) \
locale(ktorrent:ms) \
locale(ktorrent:nb) \
locale(ktorrent:nds) \
locale(ktorrent:nl) \
locale(ktorrent:nn) \
locale(ktorrent:oc) \
locale(ktorrent:pl) \
locale(ktorrent:pt) \
locale(ktorrent:pt_BR) \
locale(ktorrent:ro) \
locale(ktorrent:ru) \
locale(ktorrent:si) \
locale(ktorrent:sk) \
locale(ktorrent:sl) \
locale(ktorrent:sq) \
locale(ktorrent:sr) \
locale(ktorrent:sr@ijekavian) \
locale(ktorrent:sr@ijekavianlatin) \
locale(ktorrent:sr@latin) \
locale(ktorrent:sv) \
locale(ktorrent:tr) \
locale(ktorrent:ug) \
locale(ktorrent:uk) \
locale(ktorrent:zh_CN) \
locale(ktorrent:zh_TW)"
RDEPENDS:${PN} += "ktorrent"

inherit rpm
