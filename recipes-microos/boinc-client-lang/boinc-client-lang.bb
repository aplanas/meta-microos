SUMMARY = "Translations for package boinc-client"
DESCRIPTION = "Provides translations for the 'boinc-client' package."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.2"

RPM_NAME = "boinc-client-lang-7.22.2-1.1.noarch.rpm"
RPM_HASH = "c3bd2c65f5f674e1e112d631b908c121e261efc3c60838479c3c9420b9d1e23d6431006333bece4facbc7b95886b7622ad4afaf96c7a85583c8c928d00565835"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boinc-client-lang boinc-client-lang-all locale(boinc-client:ar) locale(boinc-client:bg) locale(boinc-client:ca) locale(boinc-client:cs) locale(boinc-client:da) locale(boinc-client:de) locale(boinc-client:el) locale(boinc-client:es) locale(boinc-client:fi) locale(boinc-client:fr) locale(boinc-client:he) locale(boinc-client:hu) locale(boinc-client:it_IT) locale(boinc-client:ja) locale(boinc-client:ka) locale(boinc-client:ko) locale(boinc-client:lt) locale(boinc-client:lv) locale(boinc-client:nb) locale(boinc-client:nl) locale(boinc-client:pl) locale(boinc-client:pt_BR) locale(boinc-client:ro) locale(boinc-client:ru) locale(boinc-client:sk) locale(boinc-client:sv) locale(boinc-client:tr) locale(boinc-client:uk) locale(boinc-client:zh_CN) locale(boinc-client:zh_TW)"
RDEPENDS:${PN} += "boinc-client"

inherit rpm
