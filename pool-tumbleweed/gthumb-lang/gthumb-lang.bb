SUMMARY = "Translations for package gthumb"
DESCRIPTION = "Provides translations for the 'gthumb' package."
LICENSE = "GPL-2.0-or-later"

PV = "3.12.2"

RPM_NAME = "gthumb-lang-3.12.2-3.3.noarch.rpm"
RPM_HASH = "a701b2e63398b391717caa9060b28fb2e111a3ecfe940ea3e9b9cd51332900e75344b9d2c466493315fc70593ddf36ede6f54c5cd39742ddb75e8ebb153cc930"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "gthumb-lang \
gthumb-lang-all \
locale(gthumb:ar) \
locale(gthumb:az) \
locale(gthumb:bg) \
locale(gthumb:bs) \
locale(gthumb:ca) \
locale(gthumb:ca@valencia) \
locale(gthumb:cs) \
locale(gthumb:da) \
locale(gthumb:de) \
locale(gthumb:dz) \
locale(gthumb:el) \
locale(gthumb:en_CA) \
locale(gthumb:en_GB) \
locale(gthumb:eo) \
locale(gthumb:es) \
locale(gthumb:et) \
locale(gthumb:eu) \
locale(gthumb:fa) \
locale(gthumb:fi) \
locale(gthumb:fr) \
locale(gthumb:ga) \
locale(gthumb:gl) \
locale(gthumb:gu) \
locale(gthumb:he) \
locale(gthumb:hi) \
locale(gthumb:hr) \
locale(gthumb:hu) \
locale(gthumb:id) \
locale(gthumb:is) \
locale(gthumb:it) \
locale(gthumb:ja) \
locale(gthumb:kn) \
locale(gthumb:ko) \
locale(gthumb:lt) \
locale(gthumb:lv) \
locale(gthumb:mk) \
locale(gthumb:ml) \
locale(gthumb:ms) \
locale(gthumb:nb) \
locale(gthumb:nds) \
locale(gthumb:ne) \
locale(gthumb:nl) \
locale(gthumb:nn) \
locale(gthumb:oc) \
locale(gthumb:pa) \
locale(gthumb:pl) \
locale(gthumb:pt) \
locale(gthumb:pt_BR) \
locale(gthumb:ro) \
locale(gthumb:ru) \
locale(gthumb:sk) \
locale(gthumb:sl) \
locale(gthumb:sq) \
locale(gthumb:sr) \
locale(gthumb:sr@latin) \
locale(gthumb:sv) \
locale(gthumb:th) \
locale(gthumb:tr) \
locale(gthumb:uk) \
locale(gthumb:vi) \
locale(gthumb:zh_CN) \
locale(gthumb:zh_HK) \
locale(gthumb:zh_TW)"

RDEPENDS:${PN} += "gthumb"

inherit rpm
