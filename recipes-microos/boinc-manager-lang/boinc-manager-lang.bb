SUMMARY = "Translations for package boinc-manager"
DESCRIPTION = "Provides translations for the 'boinc-manager' package."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.0"

RPM_NAME = "boinc-manager-lang-7.22.0-1.4.noarch.rpm"
RPM_HASH = "c20afe2a6d6230c7f7cb90e1625a1e6c40c91f00c7ba4cafc4f33cbcc08aafc02e2fbade62f685586ebc40b4e53ca274f305cef5bc6e67074cd74176bb4b4f87"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boinc-manager-lang boinc-manager-lang-all locale(boinc-manager:bg) locale(boinc-manager:ca) locale(boinc-manager:cs) locale(boinc-manager:da) locale(boinc-manager:de) locale(boinc-manager:es) locale(boinc-manager:fi) locale(boinc-manager:fr) locale(boinc-manager:he) locale(boinc-manager:hu) locale(boinc-manager:it_IT) locale(boinc-manager:ja) locale(boinc-manager:ka) locale(boinc-manager:ko) locale(boinc-manager:lv) locale(boinc-manager:nb) locale(boinc-manager:nl) locale(boinc-manager:pl) locale(boinc-manager:pt_BR) locale(boinc-manager:ro) locale(boinc-manager:ru) locale(boinc-manager:sk) locale(boinc-manager:sv) locale(boinc-manager:tr) locale(boinc-manager:uk) locale(boinc-manager:zh_CN) locale(boinc-manager:zh_TW)"
RDEPENDS:${PN} += "boinc-manager"

inherit rpm
