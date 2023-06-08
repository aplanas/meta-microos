SUMMARY = "Translations for package budgie-desktop"
DESCRIPTION = "Provides translations for the 'budgie-desktop' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "10.7.1+20"

RPM_NAME = "budgie-desktop-lang-10.7.1+20-1.1.noarch.rpm"
RPM_HASH = "aad939dc3a36fe998556ae04018cb9b3d9ada4b47b0c27aa8d9d77372916bff59af9fca8d1f0810f6c1be069ab3a791c5d84f0242a669d92dc96b765facee110"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "budgie-desktop-lang budgie-desktop-lang-all locale(budgie-desktop:af) locale(budgie-desktop:ar) locale(budgie-desktop:be) locale(budgie-desktop:bg) locale(budgie-desktop:bn) locale(budgie-desktop:br) locale(budgie-desktop:bs) locale(budgie-desktop:ca) locale(budgie-desktop:cs) locale(budgie-desktop:da) locale(budgie-desktop:de) locale(budgie-desktop:de_CH) locale(budgie-desktop:el_GR) locale(budgie-desktop:en_AU) locale(budgie-desktop:en_GB) locale(budgie-desktop:en_US) locale(budgie-desktop:eo) locale(budgie-desktop:es) locale(budgie-desktop:es_AR) locale(budgie-desktop:es_CL) locale(budgie-desktop:es_MX) locale(budgie-desktop:es_PE) locale(budgie-desktop:eu) locale(budgie-desktop:fi) locale(budgie-desktop:fr) locale(budgie-desktop:fr_FR) locale(budgie-desktop:ga) locale(budgie-desktop:gl) locale(budgie-desktop:he) locale(budgie-desktop:hi) locale(budgie-desktop:hr) locale(budgie-desktop:hu) locale(budgie-desktop:id) locale(budgie-desktop:it) locale(budgie-desktop:ja) locale(budgie-desktop:ka) locale(budgie-desktop:ko) locale(budgie-desktop:lt) locale(budgie-desktop:lv) locale(budgie-desktop:ne) locale(budgie-desktop:nl) locale(budgie-desktop:nl_BE) locale(budgie-desktop:nn) locale(budgie-desktop:oc) locale(budgie-desktop:pa) locale(budgie-desktop:pl) locale(budgie-desktop:pt) locale(budgie-desktop:pt_BR) locale(budgie-desktop:ro) locale(budgie-desktop:ru) locale(budgie-desktop:si) locale(budgie-desktop:sk) locale(budgie-desktop:sl) locale(budgie-desktop:sq) locale(budgie-desktop:sv) locale(budgie-desktop:tr) locale(budgie-desktop:uk) locale(budgie-desktop:uk_UA) locale(budgie-desktop:vi) locale(budgie-desktop:zh) locale(budgie-desktop:zh_HK) locale(budgie-desktop:zh_TW)"
RDEPENDS:${PN} += "budgie-desktop"

inherit rpm
