SUMMARY = "Translations for package klines"
DESCRIPTION = "Provides translations for the 'klines' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.1"

RPM_NAME = "klines-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "fb3cce49ea1d925212c09ca0f0524d8064c77c371fa62bea19fba6c586bba25afd75b08b9a25e46d9cb11a7b3312ad9cab0351c739babb42741faa17ebba0c87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "klines-lang \
klines-lang-all \
locale(klines:af) \
locale(klines:ar) \
locale(klines:be) \
locale(klines:bg) \
locale(klines:br) \
locale(klines:bs) \
locale(klines:ca) \
locale(klines:ca@valencia) \
locale(klines:cs) \
locale(klines:cy) \
locale(klines:da) \
locale(klines:de) \
locale(klines:el) \
locale(klines:en_GB) \
locale(klines:eo) \
locale(klines:es) \
locale(klines:et) \
locale(klines:eu) \
locale(klines:fa) \
locale(klines:fi) \
locale(klines:fr) \
locale(klines:ga) \
locale(klines:gl) \
locale(klines:he) \
locale(klines:hi) \
locale(klines:hr) \
locale(klines:hu) \
locale(klines:id) \
locale(klines:is) \
locale(klines:it) \
locale(klines:ja) \
locale(klines:ka) \
locale(klines:kk) \
locale(klines:km) \
locale(klines:ko) \
locale(klines:lt) \
locale(klines:lv) \
locale(klines:mai) \
locale(klines:mk) \
locale(klines:ml) \
locale(klines:mr) \
locale(klines:nb) \
locale(klines:nds) \
locale(klines:ne) \
locale(klines:nl) \
locale(klines:nn) \
locale(klines:oc) \
locale(klines:pa) \
locale(klines:pl) \
locale(klines:pt) \
locale(klines:pt_BR) \
locale(klines:ro) \
locale(klines:ru) \
locale(klines:sk) \
locale(klines:sl) \
locale(klines:sq) \
locale(klines:sr) \
locale(klines:sr@ijekavian) \
locale(klines:sr@ijekavianlatin) \
locale(klines:sr@latin) \
locale(klines:sv) \
locale(klines:ta) \
locale(klines:te) \
locale(klines:th) \
locale(klines:tr) \
locale(klines:ug) \
locale(klines:uk) \
locale(klines:zh_CN) \
locale(klines:zh_TW)"
RDEPENDS:${PN} += "klines"

inherit rpm