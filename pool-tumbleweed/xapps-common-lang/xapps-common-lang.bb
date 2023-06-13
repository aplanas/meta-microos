SUMMARY = "Translations for package xapps-common"
DESCRIPTION = "Provides translations for the 'xapps-common' package."
LICENSE = "GPL-3.0-or-later"

PV = "2.4.1"

RPM_NAME = "xapps-common-lang-2.4.1-1.3.noarch.rpm"
RPM_HASH = "4256c84f732556b9c6e789a6d68037d9df7cf2e849af58e735a0f6e33c73e2b617e6581ea50fbfd6b97a49551ba14916ace889becb0a2acc5804a26d3e3fff65"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(xapps-common:af) \
locale(xapps-common:ar) \
locale(xapps-common:az) \
locale(xapps-common:be) \
locale(xapps-common:bg) \
locale(xapps-common:bn) \
locale(xapps-common:ca) \
locale(xapps-common:ca@valencia) \
locale(xapps-common:cs) \
locale(xapps-common:cy) \
locale(xapps-common:da) \
locale(xapps-common:de) \
locale(xapps-common:el) \
locale(xapps-common:en_GB) \
locale(xapps-common:eo) \
locale(xapps-common:es) \
locale(xapps-common:et) \
locale(xapps-common:eu) \
locale(xapps-common:fi) \
locale(xapps-common:fr) \
locale(xapps-common:fr_CA) \
locale(xapps-common:he) \
locale(xapps-common:hi) \
locale(xapps-common:hr) \
locale(xapps-common:hu) \
locale(xapps-common:ia) \
locale(xapps-common:id) \
locale(xapps-common:is) \
locale(xapps-common:it) \
locale(xapps-common:ja) \
locale(xapps-common:ka) \
locale(xapps-common:kk) \
locale(xapps-common:ko) \
locale(xapps-common:lt) \
locale(xapps-common:mai) \
locale(xapps-common:ms) \
locale(xapps-common:nl) \
locale(xapps-common:oc) \
locale(xapps-common:pl) \
locale(xapps-common:pt) \
locale(xapps-common:pt_BR) \
locale(xapps-common:ro) \
locale(xapps-common:ru) \
locale(xapps-common:sk) \
locale(xapps-common:sl) \
locale(xapps-common:sr) \
locale(xapps-common:sr@latin) \
locale(xapps-common:sv) \
locale(xapps-common:tr) \
locale(xapps-common:uk) \
locale(xapps-common:zh_CN) \
locale(xapps-common:zh_HK) \
locale(xapps-common:zh_TW) \
xapps-common-lang \
xapps-common-lang-all"

RDEPENDS:${PN} += "xapps-common"

inherit rpm
