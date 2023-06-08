SUMMARY = "Translations for package boinc-client"
DESCRIPTION = "Provides translations for the 'boinc-client' package."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.0"

RPM_NAME = "boinc-client-lang-7.22.0-1.4.noarch.rpm"
RPM_HASH = "1d4ee8de8c26728899cdc7beb1fff0b7cfed70d7e1bd14b360523f8e61556036badb6c75d4608aff2747d4e07a945cad3c52c9488f00b92b60ff6d0f14c810e6"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boinc-client-lang boinc-client-lang-all locale(boinc-client:ar) locale(boinc-client:bg) locale(boinc-client:ca) locale(boinc-client:cs) locale(boinc-client:da) locale(boinc-client:de) locale(boinc-client:el) locale(boinc-client:es) locale(boinc-client:fi) locale(boinc-client:fr) locale(boinc-client:he) locale(boinc-client:hu) locale(boinc-client:it_IT) locale(boinc-client:ja) locale(boinc-client:ka) locale(boinc-client:ko) locale(boinc-client:lt) locale(boinc-client:lv) locale(boinc-client:nb) locale(boinc-client:nl) locale(boinc-client:pl) locale(boinc-client:pt_BR) locale(boinc-client:ro) locale(boinc-client:ru) locale(boinc-client:sk) locale(boinc-client:sv) locale(boinc-client:tr) locale(boinc-client:uk) locale(boinc-client:zh_CN) locale(boinc-client:zh_TW)"
RDEPENDS:${PN} += "boinc-client"

inherit rpm
