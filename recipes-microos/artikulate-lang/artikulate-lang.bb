SUMMARY = "Translations for package artikulate"
DESCRIPTION = "Provides translations for the 'artikulate' package."
LICENSE = "LGPL-3.0-or-later & GPL-2.0-only & BSD-3-Clause"

PV = "23.04.0"

RPM_NAME = "artikulate-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "6c8b6d8ae8494cf4e9754c5cb632bc97479ba7eb09de88bd7d5ec7fb880de9a628b3b2eaf632bf63894aa8e435b9fa77958daa8559cf3f7ce5d6b3eb1b952286"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "artikulate-lang artikulate-lang-all locale(artikulate:ar) locale(artikulate:az) locale(artikulate:bs) locale(artikulate:ca) locale(artikulate:ca@valencia) locale(artikulate:cs) locale(artikulate:da) locale(artikulate:de) locale(artikulate:el) locale(artikulate:en_GB) locale(artikulate:eo) locale(artikulate:es) locale(artikulate:et) locale(artikulate:eu) locale(artikulate:fi) locale(artikulate:fr) locale(artikulate:gl) locale(artikulate:hi) locale(artikulate:hu) locale(artikulate:ia) locale(artikulate:it) locale(artikulate:ja) locale(artikulate:ka) locale(artikulate:ko) locale(artikulate:lt) locale(artikulate:ml) locale(artikulate:mr) locale(artikulate:nds) locale(artikulate:nl) locale(artikulate:nn) locale(artikulate:pl) locale(artikulate:pt) locale(artikulate:pt_BR) locale(artikulate:ro) locale(artikulate:ru) locale(artikulate:sk) locale(artikulate:sl) locale(artikulate:sv) locale(artikulate:tr) locale(artikulate:ug) locale(artikulate:uk) locale(artikulate:zh_CN) locale(artikulate:zh_TW)"
RDEPENDS:${PN} += "artikulate"

inherit rpm
