SUMMARY = "Translations for package knavalbattle"
DESCRIPTION = "Provides translations for the 'knavalbattle' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "knavalbattle-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "df3bc3d66c1b53e3b08922cbcb8caa8912c0fe96a2f10445402067372a926686ddf2fab805ce9b9cdab7b2e23f2ba508a4a9c3b31e7f93ac98f6a8aaa33f6e68"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "knavalbattle-lang \
knavalbattle-lang-all \
locale(knavalbattle:af) \
locale(knavalbattle:ar) \
locale(knavalbattle:be) \
locale(knavalbattle:bg) \
locale(knavalbattle:bn) \
locale(knavalbattle:br) \
locale(knavalbattle:bs) \
locale(knavalbattle:ca) \
locale(knavalbattle:ca@valencia) \
locale(knavalbattle:cs) \
locale(knavalbattle:cy) \
locale(knavalbattle:da) \
locale(knavalbattle:de) \
locale(knavalbattle:el) \
locale(knavalbattle:en_GB) \
locale(knavalbattle:eo) \
locale(knavalbattle:es) \
locale(knavalbattle:et) \
locale(knavalbattle:eu) \
locale(knavalbattle:fa) \
locale(knavalbattle:fi) \
locale(knavalbattle:fr) \
locale(knavalbattle:ga) \
locale(knavalbattle:gl) \
locale(knavalbattle:he) \
locale(knavalbattle:hi) \
locale(knavalbattle:hr) \
locale(knavalbattle:hu) \
locale(knavalbattle:id) \
locale(knavalbattle:is) \
locale(knavalbattle:it) \
locale(knavalbattle:ja) \
locale(knavalbattle:ka) \
locale(knavalbattle:kk) \
locale(knavalbattle:km) \
locale(knavalbattle:ko) \
locale(knavalbattle:lt) \
locale(knavalbattle:lv) \
locale(knavalbattle:mai) \
locale(knavalbattle:mk) \
locale(knavalbattle:ml) \
locale(knavalbattle:mr) \
locale(knavalbattle:nb) \
locale(knavalbattle:nds) \
locale(knavalbattle:ne) \
locale(knavalbattle:nl) \
locale(knavalbattle:nn) \
locale(knavalbattle:oc) \
locale(knavalbattle:pa) \
locale(knavalbattle:pl) \
locale(knavalbattle:pt) \
locale(knavalbattle:pt_BR) \
locale(knavalbattle:ro) \
locale(knavalbattle:ru) \
locale(knavalbattle:sk) \
locale(knavalbattle:sl) \
locale(knavalbattle:sq) \
locale(knavalbattle:sr) \
locale(knavalbattle:sr@ijekavian) \
locale(knavalbattle:sr@ijekavianlatin) \
locale(knavalbattle:sr@latin) \
locale(knavalbattle:sv) \
locale(knavalbattle:ta) \
locale(knavalbattle:te) \
locale(knavalbattle:tr) \
locale(knavalbattle:ug) \
locale(knavalbattle:uk) \
locale(knavalbattle:vi) \
locale(knavalbattle:zh_CN) \
locale(knavalbattle:zh_TW)"

RDEPENDS:${PN} += "knavalbattle"

inherit rpm
