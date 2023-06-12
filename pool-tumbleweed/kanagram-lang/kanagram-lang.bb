SUMMARY = "Translations for package kanagram"
DESCRIPTION = "Provides translations for the 'kanagram' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kanagram-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "023600d7d85a973f6ec5f973ca7bc7aa6cbd9c90a0cd89809e4706bca99f6e6a11fb5e5c800ec4cc82cd0d30569e9b431909d2ae380c4605c77b7041df6618fd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kanagram-lang \
kanagram-lang-all \
locale(kanagram:ar) \
locale(kanagram:be) \
locale(kanagram:bg) \
locale(kanagram:bn) \
locale(kanagram:br) \
locale(kanagram:bs) \
locale(kanagram:ca) \
locale(kanagram:ca@valencia) \
locale(kanagram:cs) \
locale(kanagram:cy) \
locale(kanagram:da) \
locale(kanagram:de) \
locale(kanagram:el) \
locale(kanagram:en_GB) \
locale(kanagram:eo) \
locale(kanagram:es) \
locale(kanagram:et) \
locale(kanagram:eu) \
locale(kanagram:fa) \
locale(kanagram:fi) \
locale(kanagram:fr) \
locale(kanagram:ga) \
locale(kanagram:gl) \
locale(kanagram:gu) \
locale(kanagram:he) \
locale(kanagram:hi) \
locale(kanagram:hr) \
locale(kanagram:hu) \
locale(kanagram:id) \
locale(kanagram:it) \
locale(kanagram:ja) \
locale(kanagram:ka) \
locale(kanagram:kk) \
locale(kanagram:km) \
locale(kanagram:ko) \
locale(kanagram:lt) \
locale(kanagram:lv) \
locale(kanagram:mk) \
locale(kanagram:ml) \
locale(kanagram:mr) \
locale(kanagram:ms) \
locale(kanagram:nb) \
locale(kanagram:nds) \
locale(kanagram:ne) \
locale(kanagram:nl) \
locale(kanagram:nn) \
locale(kanagram:oc) \
locale(kanagram:pa) \
locale(kanagram:pl) \
locale(kanagram:pt) \
locale(kanagram:pt_BR) \
locale(kanagram:ro) \
locale(kanagram:ru) \
locale(kanagram:si) \
locale(kanagram:sk) \
locale(kanagram:sl) \
locale(kanagram:sq) \
locale(kanagram:sv) \
locale(kanagram:tr) \
locale(kanagram:ug) \
locale(kanagram:uk) \
locale(kanagram:zh_CN) \
locale(kanagram:zh_TW)"
RDEPENDS:${PN} += "kanagram"

inherit rpm
