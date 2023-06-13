SUMMARY = "Translations for package gsettings-desktop-schemas"
DESCRIPTION = "Provides translations for the 'gsettings-desktop-schemas' package."
LICENSE = "LGPL-2.1-or-later"

PV = "44.0"

RPM_NAME = "gsettings-desktop-schemas-lang-44.0-1.1.noarch.rpm"
RPM_HASH = "a45751ebbf43560bfa7cb5c611702481871efbee75040fa2aa2eb69dee7a0f6e11ee474e034d050019aceff216000e9021d0537b24f98249b816d9fa444dfb60"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gsettings-desktop-schemas-lang \
gsettings-desktop-schemas-lang-all \
locale(gsettings-desktop-schemas:as) \
locale(gsettings-desktop-schemas:bg) \
locale(gsettings-desktop-schemas:bs) \
locale(gsettings-desktop-schemas:ca) \
locale(gsettings-desktop-schemas:ca@valencia) \
locale(gsettings-desktop-schemas:cs) \
locale(gsettings-desktop-schemas:da) \
locale(gsettings-desktop-schemas:de) \
locale(gsettings-desktop-schemas:el) \
locale(gsettings-desktop-schemas:en_GB) \
locale(gsettings-desktop-schemas:eo) \
locale(gsettings-desktop-schemas:es) \
locale(gsettings-desktop-schemas:eu) \
locale(gsettings-desktop-schemas:fi) \
locale(gsettings-desktop-schemas:fr) \
locale(gsettings-desktop-schemas:fur) \
locale(gsettings-desktop-schemas:gl) \
locale(gsettings-desktop-schemas:gu) \
locale(gsettings-desktop-schemas:he) \
locale(gsettings-desktop-schemas:hi) \
locale(gsettings-desktop-schemas:hr) \
locale(gsettings-desktop-schemas:hu) \
locale(gsettings-desktop-schemas:id) \
locale(gsettings-desktop-schemas:is) \
locale(gsettings-desktop-schemas:it) \
locale(gsettings-desktop-schemas:ja) \
locale(gsettings-desktop-schemas:ka) \
locale(gsettings-desktop-schemas:kk) \
locale(gsettings-desktop-schemas:lt) \
locale(gsettings-desktop-schemas:lv) \
locale(gsettings-desktop-schemas:ml) \
locale(gsettings-desktop-schemas:ms) \
locale(gsettings-desktop-schemas:nb) \
locale(gsettings-desktop-schemas:ne) \
locale(gsettings-desktop-schemas:nl) \
locale(gsettings-desktop-schemas:oc) \
locale(gsettings-desktop-schemas:or) \
locale(gsettings-desktop-schemas:pa) \
locale(gsettings-desktop-schemas:pl) \
locale(gsettings-desktop-schemas:pt) \
locale(gsettings-desktop-schemas:pt_BR) \
locale(gsettings-desktop-schemas:ro) \
locale(gsettings-desktop-schemas:ru) \
locale(gsettings-desktop-schemas:sk) \
locale(gsettings-desktop-schemas:sl) \
locale(gsettings-desktop-schemas:sr) \
locale(gsettings-desktop-schemas:sr@latin) \
locale(gsettings-desktop-schemas:sv) \
locale(gsettings-desktop-schemas:tr) \
locale(gsettings-desktop-schemas:ug) \
locale(gsettings-desktop-schemas:uk) \
locale(gsettings-desktop-schemas:vi) \
locale(gsettings-desktop-schemas:zh_CN) \
locale(gsettings-desktop-schemas:zh_HK) \
locale(gsettings-desktop-schemas:zh_TW)"

RDEPENDS:${PN} += "gsettings-desktop-schemas"

inherit rpm
