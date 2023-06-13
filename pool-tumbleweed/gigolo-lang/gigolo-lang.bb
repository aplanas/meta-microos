SUMMARY = "Translations for package gigolo"
DESCRIPTION = "Provides translations for the 'gigolo' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.5.2"

RPM_NAME = "gigolo-lang-0.5.2-1.11.noarch.rpm"
RPM_HASH = "ee66abfcb562e1686dce63868965398259dc3b58f7a383ce543bfb618db82886ae9eb42a3f37a2b6f2d6d986135db6df70c204a7a38d767354bab4851b48e258"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gigolo-lang \
gigolo-lang-all \
locale(gigolo:ar) \
locale(gigolo:ast) \
locale(gigolo:be) \
locale(gigolo:bg) \
locale(gigolo:ca) \
locale(gigolo:cs) \
locale(gigolo:da) \
locale(gigolo:de) \
locale(gigolo:el) \
locale(gigolo:en_AU) \
locale(gigolo:en_CA) \
locale(gigolo:eo) \
locale(gigolo:es) \
locale(gigolo:et) \
locale(gigolo:eu) \
locale(gigolo:fi) \
locale(gigolo:fr) \
locale(gigolo:gl) \
locale(gigolo:he) \
locale(gigolo:hr) \
locale(gigolo:hu) \
locale(gigolo:id) \
locale(gigolo:is) \
locale(gigolo:it) \
locale(gigolo:ja) \
locale(gigolo:kk) \
locale(gigolo:ko) \
locale(gigolo:lt) \
locale(gigolo:lv) \
locale(gigolo:ms) \
locale(gigolo:nb) \
locale(gigolo:nl) \
locale(gigolo:oc) \
locale(gigolo:pl) \
locale(gigolo:pt) \
locale(gigolo:pt_BR) \
locale(gigolo:ru) \
locale(gigolo:sk) \
locale(gigolo:sl) \
locale(gigolo:sq) \
locale(gigolo:sr) \
locale(gigolo:sv) \
locale(gigolo:te) \
locale(gigolo:th) \
locale(gigolo:tr) \
locale(gigolo:ug) \
locale(gigolo:uk) \
locale(gigolo:zh_CN) \
locale(gigolo:zh_TW)"

RDEPENDS:${PN} += "gigolo"

inherit rpm
