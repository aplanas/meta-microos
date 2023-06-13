SUMMARY = "Translations for package gnome-logs"
DESCRIPTION = "Provides translations for the 'gnome-logs' package."
LICENSE = "GPL-3.0-or-later"

PV = "43.0"

RPM_NAME = "gnome-logs-lang-43.0-1.3.noarch.rpm"
RPM_HASH = "a853fa4800f9c25706af0633624a2e4791e27cf299f90f555da4e8940cff5b3ffe9eab49bd24f08ae0941c025fe32028804bab05663a428ab40c270c6cdc46cd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gnome-logs-lang \
gnome-logs-lang-all \
locale(gnome-logs:ar) \
locale(gnome-logs:as) \
locale(gnome-logs:be) \
locale(gnome-logs:bg) \
locale(gnome-logs:bs) \
locale(gnome-logs:ca) \
locale(gnome-logs:ca@valencia) \
locale(gnome-logs:cs) \
locale(gnome-logs:da) \
locale(gnome-logs:de) \
locale(gnome-logs:el) \
locale(gnome-logs:en_GB) \
locale(gnome-logs:eo) \
locale(gnome-logs:es) \
locale(gnome-logs:eu) \
locale(gnome-logs:fa) \
locale(gnome-logs:fi) \
locale(gnome-logs:fr) \
locale(gnome-logs:fur) \
locale(gnome-logs:ga) \
locale(gnome-logs:gd) \
locale(gnome-logs:gl) \
locale(gnome-logs:he) \
locale(gnome-logs:hr) \
locale(gnome-logs:hu) \
locale(gnome-logs:id) \
locale(gnome-logs:is) \
locale(gnome-logs:it) \
locale(gnome-logs:ja) \
locale(gnome-logs:ka) \
locale(gnome-logs:kk) \
locale(gnome-logs:ko) \
locale(gnome-logs:lt) \
locale(gnome-logs:lv) \
locale(gnome-logs:ml) \
locale(gnome-logs:ms) \
locale(gnome-logs:nb) \
locale(gnome-logs:ne) \
locale(gnome-logs:nl) \
locale(gnome-logs:oc) \
locale(gnome-logs:pa) \
locale(gnome-logs:pl) \
locale(gnome-logs:pt) \
locale(gnome-logs:pt_BR) \
locale(gnome-logs:ro) \
locale(gnome-logs:ru) \
locale(gnome-logs:sk) \
locale(gnome-logs:sl) \
locale(gnome-logs:sr) \
locale(gnome-logs:sr@latin) \
locale(gnome-logs:sv) \
locale(gnome-logs:ta) \
locale(gnome-logs:te) \
locale(gnome-logs:th) \
locale(gnome-logs:tr) \
locale(gnome-logs:uk) \
locale(gnome-logs:vi) \
locale(gnome-logs:zh_CN) \
locale(gnome-logs:zh_HK) \
locale(gnome-logs:zh_TW)"

RDEPENDS:${PN} += "gnome-logs"

inherit rpm
