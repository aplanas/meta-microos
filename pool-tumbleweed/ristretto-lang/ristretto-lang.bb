SUMMARY = "Translations for package ristretto"
DESCRIPTION = "Provides translations for the 'ristretto' package."
LICENSE = "GPL-2.0-or-later"

PV = "0.13.1"

RPM_NAME = "ristretto-lang-0.13.1-1.1.noarch.rpm"
RPM_HASH = "b24e114b6ede734ffe721b552126430c2d425602f2ae875dbbcd23b3d9dc23039e9f0c77cd3940677b2437d336b0b4f20fc2315311e1b72067f0138585d79bf7"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "locale(ristretto:ar) \
locale(ristretto:ast) \
locale(ristretto:be) \
locale(ristretto:bg) \
locale(ristretto:ca) \
locale(ristretto:cs) \
locale(ristretto:da) \
locale(ristretto:de) \
locale(ristretto:el) \
locale(ristretto:en_AU) \
locale(ristretto:en_GB) \
locale(ristretto:es) \
locale(ristretto:et) \
locale(ristretto:eu) \
locale(ristretto:fi) \
locale(ristretto:fr) \
locale(ristretto:gl) \
locale(ristretto:he) \
locale(ristretto:hr) \
locale(ristretto:hu) \
locale(ristretto:id) \
locale(ristretto:is) \
locale(ristretto:it) \
locale(ristretto:ja) \
locale(ristretto:kk) \
locale(ristretto:ko) \
locale(ristretto:lt) \
locale(ristretto:lv) \
locale(ristretto:ms) \
locale(ristretto:nb) \
locale(ristretto:nl) \
locale(ristretto:oc) \
locale(ristretto:pl) \
locale(ristretto:pt) \
locale(ristretto:pt_BR) \
locale(ristretto:ro) \
locale(ristretto:ru) \
locale(ristretto:sk) \
locale(ristretto:sl) \
locale(ristretto:sq) \
locale(ristretto:sr) \
locale(ristretto:sv) \
locale(ristretto:te) \
locale(ristretto:th) \
locale(ristretto:tr) \
locale(ristretto:ug) \
locale(ristretto:uk) \
locale(ristretto:vi) \
locale(ristretto:zh_CN) \
locale(ristretto:zh_TW) \
ristretto-lang \
ristretto-lang-all"

RDEPENDS:${PN} += "ristretto"

inherit rpm
