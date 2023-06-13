SUMMARY = "Translations for package kdenetwork-filesharing"
DESCRIPTION = "Provides translations for the 'kdenetwork-filesharing' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "kdenetwork-filesharing-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "8062af4820e95df8cefa1a482955b0746c6ddab9500268e67ab2d3fef563f53baea88d7dbdece9f8ba44359bf0862196dbb7015336fe5521ce37d895c1dcf0e5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "kdenetwork-filesharing-lang \
kdenetwork-filesharing-lang-all \
locale(kdenetwork-filesharing:ar) \
locale(kdenetwork-filesharing:az) \
locale(kdenetwork-filesharing:be) \
locale(kdenetwork-filesharing:bg) \
locale(kdenetwork-filesharing:br) \
locale(kdenetwork-filesharing:bs) \
locale(kdenetwork-filesharing:ca) \
locale(kdenetwork-filesharing:ca@valencia) \
locale(kdenetwork-filesharing:cs) \
locale(kdenetwork-filesharing:cy) \
locale(kdenetwork-filesharing:da) \
locale(kdenetwork-filesharing:de) \
locale(kdenetwork-filesharing:el) \
locale(kdenetwork-filesharing:en_GB) \
locale(kdenetwork-filesharing:eo) \
locale(kdenetwork-filesharing:es) \
locale(kdenetwork-filesharing:et) \
locale(kdenetwork-filesharing:eu) \
locale(kdenetwork-filesharing:fa) \
locale(kdenetwork-filesharing:fi) \
locale(kdenetwork-filesharing:fr) \
locale(kdenetwork-filesharing:ga) \
locale(kdenetwork-filesharing:gl) \
locale(kdenetwork-filesharing:he) \
locale(kdenetwork-filesharing:hi) \
locale(kdenetwork-filesharing:hr) \
locale(kdenetwork-filesharing:hu) \
locale(kdenetwork-filesharing:ia) \
locale(kdenetwork-filesharing:id) \
locale(kdenetwork-filesharing:is) \
locale(kdenetwork-filesharing:it) \
locale(kdenetwork-filesharing:ja) \
locale(kdenetwork-filesharing:ka) \
locale(kdenetwork-filesharing:kk) \
locale(kdenetwork-filesharing:km) \
locale(kdenetwork-filesharing:ko) \
locale(kdenetwork-filesharing:lt) \
locale(kdenetwork-filesharing:lv) \
locale(kdenetwork-filesharing:mai) \
locale(kdenetwork-filesharing:mk) \
locale(kdenetwork-filesharing:mr) \
locale(kdenetwork-filesharing:ms) \
locale(kdenetwork-filesharing:nb) \
locale(kdenetwork-filesharing:nds) \
locale(kdenetwork-filesharing:ne) \
locale(kdenetwork-filesharing:nl) \
locale(kdenetwork-filesharing:nn) \
locale(kdenetwork-filesharing:oc) \
locale(kdenetwork-filesharing:pa) \
locale(kdenetwork-filesharing:pl) \
locale(kdenetwork-filesharing:pt) \
locale(kdenetwork-filesharing:pt_BR) \
locale(kdenetwork-filesharing:ro) \
locale(kdenetwork-filesharing:ru) \
locale(kdenetwork-filesharing:sk) \
locale(kdenetwork-filesharing:sl) \
locale(kdenetwork-filesharing:sq) \
locale(kdenetwork-filesharing:sr) \
locale(kdenetwork-filesharing:sr@ijekavian) \
locale(kdenetwork-filesharing:sr@ijekavianlatin) \
locale(kdenetwork-filesharing:sr@latin) \
locale(kdenetwork-filesharing:sv) \
locale(kdenetwork-filesharing:ta) \
locale(kdenetwork-filesharing:th) \
locale(kdenetwork-filesharing:tr) \
locale(kdenetwork-filesharing:ug) \
locale(kdenetwork-filesharing:uk) \
locale(kdenetwork-filesharing:vi) \
locale(kdenetwork-filesharing:zh_CN) \
locale(kdenetwork-filesharing:zh_HK) \
locale(kdenetwork-filesharing:zh_TW)"

RDEPENDS:${PN} += "kdenetwork-filesharing"

inherit rpm
