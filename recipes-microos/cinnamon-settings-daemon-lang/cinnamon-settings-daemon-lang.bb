SUMMARY = "Translations for package cinnamon-settings-daemon"
DESCRIPTION = "Provides translations for the 'cinnamon-settings-daemon' package."
LICENSE = "GPL-2.0-or-later"

PV = "5.8.0"

RPM_NAME = "cinnamon-settings-daemon-lang-5.8.0-1.1.noarch.rpm"
RPM_HASH = "c7a3f056b82b27b43fae0f1fdcdf660b2521d341a825c8d7a87a0c35261910f5696fa7b1f6f59e7007177a62d4a8fe7b60ddbc9a24a79dafd6a0cc280aad79d1"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "cinnamon-settings-daemon-lang \
cinnamon-settings-daemon-lang-all \
locale(cinnamon-settings-daemon:af) \
locale(cinnamon-settings-daemon:ar) \
locale(cinnamon-settings-daemon:as) \
locale(cinnamon-settings-daemon:ast) \
locale(cinnamon-settings-daemon:az) \
locale(cinnamon-settings-daemon:be) \
locale(cinnamon-settings-daemon:be@latin) \
locale(cinnamon-settings-daemon:bg) \
locale(cinnamon-settings-daemon:bn) \
locale(cinnamon-settings-daemon:bn_IN) \
locale(cinnamon-settings-daemon:br) \
locale(cinnamon-settings-daemon:bs) \
locale(cinnamon-settings-daemon:ca) \
locale(cinnamon-settings-daemon:ca@valencia) \
locale(cinnamon-settings-daemon:cs) \
locale(cinnamon-settings-daemon:cy) \
locale(cinnamon-settings-daemon:da) \
locale(cinnamon-settings-daemon:de) \
locale(cinnamon-settings-daemon:dz) \
locale(cinnamon-settings-daemon:el) \
locale(cinnamon-settings-daemon:en@shaw) \
locale(cinnamon-settings-daemon:en_CA) \
locale(cinnamon-settings-daemon:en_GB) \
locale(cinnamon-settings-daemon:eo) \
locale(cinnamon-settings-daemon:es) \
locale(cinnamon-settings-daemon:et) \
locale(cinnamon-settings-daemon:eu) \
locale(cinnamon-settings-daemon:fa) \
locale(cinnamon-settings-daemon:fi) \
locale(cinnamon-settings-daemon:fr) \
locale(cinnamon-settings-daemon:fr_CA) \
locale(cinnamon-settings-daemon:ga) \
locale(cinnamon-settings-daemon:gl) \
locale(cinnamon-settings-daemon:gu) \
locale(cinnamon-settings-daemon:he) \
locale(cinnamon-settings-daemon:hi) \
locale(cinnamon-settings-daemon:hr) \
locale(cinnamon-settings-daemon:hu) \
locale(cinnamon-settings-daemon:ia) \
locale(cinnamon-settings-daemon:id) \
locale(cinnamon-settings-daemon:is) \
locale(cinnamon-settings-daemon:it) \
locale(cinnamon-settings-daemon:ja) \
locale(cinnamon-settings-daemon:ka) \
locale(cinnamon-settings-daemon:kk) \
locale(cinnamon-settings-daemon:km) \
locale(cinnamon-settings-daemon:kn) \
locale(cinnamon-settings-daemon:ko) \
locale(cinnamon-settings-daemon:lt) \
locale(cinnamon-settings-daemon:lv) \
locale(cinnamon-settings-daemon:mai) \
locale(cinnamon-settings-daemon:mk) \
locale(cinnamon-settings-daemon:ml) \
locale(cinnamon-settings-daemon:mr) \
locale(cinnamon-settings-daemon:ms) \
locale(cinnamon-settings-daemon:nb) \
locale(cinnamon-settings-daemon:nds) \
locale(cinnamon-settings-daemon:ne) \
locale(cinnamon-settings-daemon:nl) \
locale(cinnamon-settings-daemon:nn) \
locale(cinnamon-settings-daemon:oc) \
locale(cinnamon-settings-daemon:or) \
locale(cinnamon-settings-daemon:pa) \
locale(cinnamon-settings-daemon:pl) \
locale(cinnamon-settings-daemon:pt) \
locale(cinnamon-settings-daemon:pt_BR) \
locale(cinnamon-settings-daemon:ro) \
locale(cinnamon-settings-daemon:ru) \
locale(cinnamon-settings-daemon:si) \
locale(cinnamon-settings-daemon:sk) \
locale(cinnamon-settings-daemon:sl) \
locale(cinnamon-settings-daemon:sq) \
locale(cinnamon-settings-daemon:sr) \
locale(cinnamon-settings-daemon:sr@latin) \
locale(cinnamon-settings-daemon:sv) \
locale(cinnamon-settings-daemon:ta) \
locale(cinnamon-settings-daemon:te) \
locale(cinnamon-settings-daemon:th) \
locale(cinnamon-settings-daemon:tr) \
locale(cinnamon-settings-daemon:ug) \
locale(cinnamon-settings-daemon:uk) \
locale(cinnamon-settings-daemon:vi) \
locale(cinnamon-settings-daemon:wa) \
locale(cinnamon-settings-daemon:zh_CN) \
locale(cinnamon-settings-daemon:zh_HK) \
locale(cinnamon-settings-daemon:zh_TW)"
RDEPENDS:${PN} += "cinnamon-settings-daemon"

inherit rpm
