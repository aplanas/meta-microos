SUMMARY = "Translations for package almanah"
DESCRIPTION = "Provides translations for the 'almanah' package."
LICENSE = "GPL-3.0+"

PV = "0.12.3"

RPM_NAME = "almanah-lang-0.12.3-2.9.noarch.rpm"
RPM_HASH = "4cd75f64c065996ca0c19d37c317f7b3567624850887a2651359441475db520945db070cef19cfd9cd3600852b6c1f3e9e27f8d4665ddd620991f0a60480bf6d"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "almanah-lang almanah-lang-all locale(almanah:ar) locale(almanah:bs) locale(almanah:ca) locale(almanah:cs) locale(almanah:da) locale(almanah:de) locale(almanah:el) locale(almanah:en_GB) locale(almanah:eo) locale(almanah:es) locale(almanah:eu) locale(almanah:fi) locale(almanah:fr) locale(almanah:fur) locale(almanah:gl) locale(almanah:hu) locale(almanah:id) locale(almanah:lv) locale(almanah:ms) locale(almanah:nb) locale(almanah:nl) locale(almanah:oc) locale(almanah:pl) locale(almanah:pt) locale(almanah:pt_BR) locale(almanah:ro) locale(almanah:ru) locale(almanah:sl) locale(almanah:sr) locale(almanah:sr@latin) locale(almanah:sv) locale(almanah:th) locale(almanah:tr) locale(almanah:uk) locale(almanah:zh_CN)"
RDEPENDS:${PN} += "almanah"

inherit rpm
