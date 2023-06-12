SUMMARY = "Translations for package glib2"
DESCRIPTION = "Provides translations for the 'glib2' package."
LICENSE = "LGPL-2.1-or-later"

PV = "2.76.3"

RPM_NAME = "glib2-lang-2.76.3-1.1.noarch.rpm"
RPM_HASH = "ba9cce97cd0e2baff2544cc325091cc6ab4f7bf04f81c129bcbe2249462afadc15df11b0d0d2432f1c599b8e73406ec93fb8a37c2f67b00ecb0fac3c9336bda7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "glib2-lang \
glib2-lang-all \
locale(glib2:af) \
locale(glib2:ar) \
locale(glib2:as) \
locale(glib2:ast) \
locale(glib2:az) \
locale(glib2:be) \
locale(glib2:be@latin) \
locale(glib2:bg) \
locale(glib2:bn) \
locale(glib2:bn_IN) \
locale(glib2:bs) \
locale(glib2:ca) \
locale(glib2:ca@valencia) \
locale(glib2:cs) \
locale(glib2:cy) \
locale(glib2:da) \
locale(glib2:de) \
locale(glib2:dz) \
locale(glib2:el) \
locale(glib2:en@shaw) \
locale(glib2:en_CA) \
locale(glib2:en_GB) \
locale(glib2:eo) \
locale(glib2:es) \
locale(glib2:et) \
locale(glib2:eu) \
locale(glib2:fa) \
locale(glib2:fi) \
locale(glib2:fr) \
locale(glib2:fur) \
locale(glib2:ga) \
locale(glib2:gd) \
locale(glib2:gl) \
locale(glib2:gu) \
locale(glib2:he) \
locale(glib2:hi) \
locale(glib2:hr) \
locale(glib2:hu) \
locale(glib2:id) \
locale(glib2:is) \
locale(glib2:it) \
locale(glib2:ja) \
locale(glib2:ka) \
locale(glib2:kk) \
locale(glib2:kn) \
locale(glib2:ko) \
locale(glib2:lt) \
locale(glib2:lv) \
locale(glib2:mai) \
locale(glib2:mk) \
locale(glib2:ml) \
locale(glib2:mr) \
locale(glib2:ms) \
locale(glib2:nb) \
locale(glib2:nds) \
locale(glib2:ne) \
locale(glib2:nl) \
locale(glib2:nn) \
locale(glib2:oc) \
locale(glib2:or) \
locale(glib2:pa) \
locale(glib2:pl) \
locale(glib2:pt) \
locale(glib2:pt_BR) \
locale(glib2:ro) \
locale(glib2:ru) \
locale(glib2:si) \
locale(glib2:sk) \
locale(glib2:sl) \
locale(glib2:sq) \
locale(glib2:sr) \
locale(glib2:sr@ije) \
locale(glib2:sr@latin) \
locale(glib2:sv) \
locale(glib2:ta) \
locale(glib2:te) \
locale(glib2:th) \
locale(glib2:tr) \
locale(glib2:ug) \
locale(glib2:uk) \
locale(glib2:vi) \
locale(glib2:wa) \
locale(glib2:zh_CN) \
locale(glib2:zh_HK) \
locale(glib2:zh_TW)"
RDEPENDS:${PN} += "glib2"

inherit rpm
