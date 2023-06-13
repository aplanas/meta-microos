SUMMARY = "Translations for package orage"
DESCRIPTION = "Provides translations for the 'orage' package."
LICENSE = "GPL-2.0-or-later"

PV = "4.18.0"

RPM_NAME = "orage-lang-4.18.0-1.3.noarch.rpm"
RPM_HASH = "1fa70a53f69f20de09c030f73e36aa9862b28b1b0ee5787e74a8add6c236533f881e9e05ed28b0b3850b375d53113155a2aac7d8c6d62ee0f482a0569d38d047"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(orage:ar) \
locale(orage:ast) \
locale(orage:be) \
locale(orage:bg) \
locale(orage:ca) \
locale(orage:cs) \
locale(orage:da) \
locale(orage:de) \
locale(orage:el) \
locale(orage:en_AU) \
locale(orage:en_GB) \
locale(orage:eo) \
locale(orage:es) \
locale(orage:et) \
locale(orage:eu) \
locale(orage:fi) \
locale(orage:fr) \
locale(orage:gl) \
locale(orage:he) \
locale(orage:hr) \
locale(orage:hu) \
locale(orage:id) \
locale(orage:is) \
locale(orage:it) \
locale(orage:ja) \
locale(orage:kk) \
locale(orage:ko) \
locale(orage:lt) \
locale(orage:lv) \
locale(orage:ms) \
locale(orage:nb) \
locale(orage:nl) \
locale(orage:nn) \
locale(orage:oc) \
locale(orage:pa) \
locale(orage:pl) \
locale(orage:pt) \
locale(orage:pt_BR) \
locale(orage:ro) \
locale(orage:ru) \
locale(orage:si) \
locale(orage:sk) \
locale(orage:sq) \
locale(orage:sr) \
locale(orage:sv) \
locale(orage:th) \
locale(orage:tr) \
locale(orage:ug) \
locale(orage:uk) \
locale(orage:vi) \
locale(orage:zh_CN) \
locale(orage:zh_TW) \
orage-lang \
orage-lang-all"

RDEPENDS:${PN} += "orage"

inherit rpm
