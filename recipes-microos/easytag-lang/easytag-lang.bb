SUMMARY = "Translations for package easytag"
DESCRIPTION = "Provides translations for the 'easytag' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.4.3"

RPM_NAME = "easytag-lang-2.4.3-7.4.noarch.rpm"
RPM_HASH = "0c81e8dc1ea504f3e7e67155a5fd5d35b4f5e151ddeafd6c09a92aad3dfbb20b4994896db507d34de75030b418c11fdfd50226d13c35dabe743bb3919a7d8e77"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "easytag-lang easytag-lang-all locale(easytag:bg) locale(easytag:bs) locale(easytag:ca) locale(easytag:cs) locale(easytag:da) locale(easytag:de) locale(easytag:el) locale(easytag:en_GB) locale(easytag:es) locale(easytag:fr) locale(easytag:he) locale(easytag:hr) locale(easytag:hu) locale(easytag:id) locale(easytag:it) locale(easytag:ja) locale(easytag:ko) locale(easytag:lt) locale(easytag:nb) locale(easytag:nl) locale(easytag:oc) locale(easytag:pl) locale(easytag:pt) locale(easytag:pt_BR) locale(easytag:ro) locale(easytag:ru) locale(easytag:sl) locale(easytag:sr) locale(easytag:sr@latin) locale(easytag:sv) locale(easytag:te) locale(easytag:tr) locale(easytag:uk) locale(easytag:zh_CN) locale(easytag:zh_TW)"
RDEPENDS:${PN} += "easytag"

inherit rpm
