SUMMARY = "Translation files for freeciv"
DESCRIPTION = "Translation files for freeciv main package and clients."
LICENSE = "GPL-2.0-or-later"

PV = "3.0.7"

RPM_NAME = "freeciv-lang-3.0.7-1.2.noarch.rpm"
RPM_HASH = "e531d63a1124e8ccc275c6a681c6f0076933a299ad3ea16169d7de9756ea8ee9ba47c7cdc8f8f4ab6ebfb5a26ff43ccc758f8ce51b2c914e912be94c2573dd16"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "freeciv-lang locale(freeciv:ar) locale(freeciv:bg) locale(freeciv:ca) locale(freeciv:cs) locale(freeciv:da) locale(freeciv:de) locale(freeciv:el) locale(freeciv:en_GB) locale(freeciv:eo) locale(freeciv:es) locale(freeciv:et) locale(freeciv:fa) locale(freeciv:fi) locale(freeciv:fr) locale(freeciv:ga) locale(freeciv:gd) locale(freeciv:he) locale(freeciv:hu) locale(freeciv:id) locale(freeciv:it) locale(freeciv:ja) locale(freeciv:ko) locale(freeciv:lt) locale(freeciv:nb) locale(freeciv:nl) locale(freeciv:pl) locale(freeciv:pt) locale(freeciv:pt_BR) locale(freeciv:ro) locale(freeciv:ru) locale(freeciv:sr) locale(freeciv:sv) locale(freeciv:tr) locale(freeciv:uk) locale(freeciv:zh_CN) locale(freeciv:zh_TW)"
RDEPENDS:${PN} += "freeciv"

inherit rpm
