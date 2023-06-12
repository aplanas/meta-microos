SUMMARY = "Translations for package knights"
DESCRIPTION = "Provides translations for the 'knights' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "knights-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "b902f3dfa0d84275844ecabe113734c435795cd7dc754d85c77c3629a1f24e22d68f890219be4ad312efbe64adffcb4dbc9f91e4666dd52203ce1bbadbf6a53a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "knights-lang \
knights-lang-all \
locale(knights:ar) \
locale(knights:bg) \
locale(knights:bs) \
locale(knights:ca) \
locale(knights:ca@valencia) \
locale(knights:cs) \
locale(knights:da) \
locale(knights:de) \
locale(knights:el) \
locale(knights:en_GB) \
locale(knights:eo) \
locale(knights:es) \
locale(knights:et) \
locale(knights:eu) \
locale(knights:fa) \
locale(knights:fi) \
locale(knights:fr) \
locale(knights:ga) \
locale(knights:gl) \
locale(knights:hu) \
locale(knights:id) \
locale(knights:it) \
locale(knights:ja) \
locale(knights:ka) \
locale(knights:km) \
locale(knights:ko) \
locale(knights:lt) \
locale(knights:ml) \
locale(knights:mr) \
locale(knights:nb) \
locale(knights:nds) \
locale(knights:nl) \
locale(knights:nn) \
locale(knights:pl) \
locale(knights:pt) \
locale(knights:pt_BR) \
locale(knights:ro) \
locale(knights:ru) \
locale(knights:sk) \
locale(knights:sl) \
locale(knights:sr) \
locale(knights:sr@ijekavian) \
locale(knights:sr@ijekavianlatin) \
locale(knights:sr@latin) \
locale(knights:sv) \
locale(knights:tr) \
locale(knights:ug) \
locale(knights:uk) \
locale(knights:zh_CN) \
locale(knights:zh_TW)"
RDEPENDS:${PN} += "knights"

inherit rpm
