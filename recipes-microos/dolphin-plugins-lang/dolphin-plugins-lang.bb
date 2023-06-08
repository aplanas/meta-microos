SUMMARY = "Translations for package dolphin-plugins"
DESCRIPTION = "Provides translations for the 'dolphin-plugins' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "dolphin-plugins-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "26f6fae049e2a438a79ea5934bb5e78baabbb7d1cace9c4b4384ff6f71332ae73b62b1f719deefecba65399030cecc0a1ed8ef20a9a888e2623dd95e8ac8ece6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dolphin-plugins-lang dolphin-plugins-lang-all locale(dolphin-plugins:ar) locale(dolphin-plugins:az) locale(dolphin-plugins:bg) locale(dolphin-plugins:bs) locale(dolphin-plugins:ca) locale(dolphin-plugins:ca@valencia) locale(dolphin-plugins:cs) locale(dolphin-plugins:da) locale(dolphin-plugins:de) locale(dolphin-plugins:el) locale(dolphin-plugins:en_GB) locale(dolphin-plugins:eo) locale(dolphin-plugins:es) locale(dolphin-plugins:et) locale(dolphin-plugins:eu) locale(dolphin-plugins:fi) locale(dolphin-plugins:fr) locale(dolphin-plugins:ga) locale(dolphin-plugins:gl) locale(dolphin-plugins:hu) locale(dolphin-plugins:ia) locale(dolphin-plugins:id) locale(dolphin-plugins:it) locale(dolphin-plugins:ja) locale(dolphin-plugins:ka) locale(dolphin-plugins:kk) locale(dolphin-plugins:ko) locale(dolphin-plugins:lt) locale(dolphin-plugins:mr) locale(dolphin-plugins:nb) locale(dolphin-plugins:nds) locale(dolphin-plugins:nl) locale(dolphin-plugins:nn) locale(dolphin-plugins:pa) locale(dolphin-plugins:pl) locale(dolphin-plugins:pt) locale(dolphin-plugins:pt_BR) locale(dolphin-plugins:ro) locale(dolphin-plugins:ru) locale(dolphin-plugins:sk) locale(dolphin-plugins:sl) locale(dolphin-plugins:sv) locale(dolphin-plugins:ta) locale(dolphin-plugins:tr) locale(dolphin-plugins:ug) locale(dolphin-plugins:uk) locale(dolphin-plugins:vi) locale(dolphin-plugins:zh_CN) locale(dolphin-plugins:zh_TW)"
RDEPENDS:${PN} += "dolphin-plugins"

inherit rpm
