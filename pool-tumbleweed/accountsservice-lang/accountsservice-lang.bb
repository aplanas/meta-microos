SUMMARY = "Translations for package accountsservice"
DESCRIPTION = "Provides translations for the 'accountsservice' package."
LICENSE = "GPL-3.0-or-later"

PV = "22.08.8"

RPM_NAME = "accountsservice-lang-22.08.8-2.4.noarch.rpm"
RPM_HASH = "def9601f2d23abdeffc64f878afc123f70b30b3abc0864517b43f7a0a0308c007b43799eea4809aad82b18b4821045a219eddcf972622c50f65161f66978e937"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "accountsservice-lang \
accountsservice-lang-all \
locale(accountsservice:af) \
locale(accountsservice:ar) \
locale(accountsservice:as) \
locale(accountsservice:ast) \
locale(accountsservice:az) \
locale(accountsservice:be) \
locale(accountsservice:bg) \
locale(accountsservice:bn_IN) \
locale(accountsservice:ca) \
locale(accountsservice:ca@valencia) \
locale(accountsservice:cs) \
locale(accountsservice:cy) \
locale(accountsservice:da) \
locale(accountsservice:de) \
locale(accountsservice:el) \
locale(accountsservice:en) \
locale(accountsservice:en_GB) \
locale(accountsservice:eo) \
locale(accountsservice:es) \
locale(accountsservice:et) \
locale(accountsservice:eu) \
locale(accountsservice:fa) \
locale(accountsservice:fi) \
locale(accountsservice:fr) \
locale(accountsservice:fur) \
locale(accountsservice:ga) \
locale(accountsservice:gl) \
locale(accountsservice:gu) \
locale(accountsservice:he) \
locale(accountsservice:hi) \
locale(accountsservice:hr) \
locale(accountsservice:hu) \
locale(accountsservice:ia) \
locale(accountsservice:id) \
locale(accountsservice:it) \
locale(accountsservice:ja) \
locale(accountsservice:ka) \
locale(accountsservice:kk) \
locale(accountsservice:kn) \
locale(accountsservice:ko) \
locale(accountsservice:lt) \
locale(accountsservice:lv) \
locale(accountsservice:ml) \
locale(accountsservice:mr) \
locale(accountsservice:ms) \
locale(accountsservice:nb) \
locale(accountsservice:nl) \
locale(accountsservice:nn) \
locale(accountsservice:oc) \
locale(accountsservice:or) \
locale(accountsservice:pa) \
locale(accountsservice:pl) \
locale(accountsservice:pt) \
locale(accountsservice:pt_BR) \
locale(accountsservice:ro) \
locale(accountsservice:ru) \
locale(accountsservice:sk) \
locale(accountsservice:sl) \
locale(accountsservice:sq) \
locale(accountsservice:sr) \
locale(accountsservice:sr@latin) \
locale(accountsservice:sv) \
locale(accountsservice:ta) \
locale(accountsservice:te) \
locale(accountsservice:th) \
locale(accountsservice:tr) \
locale(accountsservice:uk) \
locale(accountsservice:vi) \
locale(accountsservice:wa) \
locale(accountsservice:zh_CN) \
locale(accountsservice:zh_HK) \
locale(accountsservice:zh_TW)"
RDEPENDS:${PN} += "accountsservice"

inherit rpm
