SUMMARY = "Translations for package dc3dd"
DESCRIPTION = "Provides translations for the 'dc3dd' package."
LICENSE = "GPL-3.0-only"

PV = "7.2.646"

RPM_NAME = "dc3dd-lang-7.2.646-4.9.noarch.rpm"
RPM_HASH = "55a1ba51cd7ad6d7c9c6150833e44e616fff9593515715ecfe3594346ec9751296a107de377fb4f3f441859678d4d3da16b1789320002d103b51b6b90a57e402"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dc3dd-lang dc3dd-lang-all locale(dc3dd:af) locale(dc3dd:be) locale(dc3dd:bg) locale(dc3dd:ca) locale(dc3dd:cs) locale(dc3dd:da) locale(dc3dd:de) locale(dc3dd:el) locale(dc3dd:es) locale(dc3dd:et) locale(dc3dd:eu) locale(dc3dd:fi) locale(dc3dd:fr) locale(dc3dd:ga) locale(dc3dd:gl) locale(dc3dd:hu) locale(dc3dd:it) locale(dc3dd:ja) locale(dc3dd:ko) locale(dc3dd:lt) locale(dc3dd:ms) locale(dc3dd:nb) locale(dc3dd:nl) locale(dc3dd:pl) locale(dc3dd:pt) locale(dc3dd:pt_BR) locale(dc3dd:ru) locale(dc3dd:sk) locale(dc3dd:sl) locale(dc3dd:sv) locale(dc3dd:tr) locale(dc3dd:uk) locale(dc3dd:vi) locale(dc3dd:zh_CN) locale(dc3dd:zh_TW)"
RDEPENDS:${PN} += "dc3dd"

inherit rpm
