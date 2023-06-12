SUMMARY = "Translations for package endeavour"
DESCRIPTION = "Provides translations for the 'endeavour' package."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "endeavour-lang-43.0-1.1.noarch.rpm"
RPM_HASH = "f2d6550f5fea226a4bd64554ed4625c49e83976af15c8314453a5a92c2f047c0b5c5ce910fdef9e285bfcb346ff63baa115a914b8a7e6a65c69816b6b81d4f2f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "endeavour-lang \
endeavour-lang-all \
locale(endeavour:af) \
locale(endeavour:ar) \
locale(endeavour:be) \
locale(endeavour:bg) \
locale(endeavour:ca) \
locale(endeavour:ca@valencia) \
locale(endeavour:cs) \
locale(endeavour:da) \
locale(endeavour:de) \
locale(endeavour:el) \
locale(endeavour:en_GB) \
locale(endeavour:eo) \
locale(endeavour:es) \
locale(endeavour:et) \
locale(endeavour:eu) \
locale(endeavour:fa) \
locale(endeavour:fi) \
locale(endeavour:fr) \
locale(endeavour:fur) \
locale(endeavour:gl) \
locale(endeavour:he) \
locale(endeavour:hr) \
locale(endeavour:hu) \
locale(endeavour:id) \
locale(endeavour:is) \
locale(endeavour:it) \
locale(endeavour:ja) \
locale(endeavour:kk) \
locale(endeavour:ko) \
locale(endeavour:lt) \
locale(endeavour:lv) \
locale(endeavour:ml) \
locale(endeavour:ms) \
locale(endeavour:nb) \
locale(endeavour:ne) \
locale(endeavour:nl) \
locale(endeavour:oc) \
locale(endeavour:pa) \
locale(endeavour:pl) \
locale(endeavour:pt) \
locale(endeavour:pt_BR) \
locale(endeavour:ro) \
locale(endeavour:ru) \
locale(endeavour:sk) \
locale(endeavour:sl) \
locale(endeavour:sr) \
locale(endeavour:sr@latin) \
locale(endeavour:sv) \
locale(endeavour:tr) \
locale(endeavour:uk) \
locale(endeavour:vi) \
locale(endeavour:zh_CN) \
locale(endeavour:zh_TW)"
RDEPENDS:${PN} += "endeavour"

inherit rpm
