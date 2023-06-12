SUMMARY = "Translations for package boinc-manager"
DESCRIPTION = "Provides translations for the 'boinc-manager' package."
LICENSE = "GPL-3.0-or-later | LGPL-3.0-or-later"

PV = "7.22.2"

RPM_NAME = "boinc-manager-lang-7.22.2-1.1.noarch.rpm"
RPM_HASH = "314527b5bc36c580816a4d9e9df2e17a8ce33d874766147fa55a8939daf39e8e6c98420854f8d5597ed0b7ebf1d9e0fb174b5f65cfacb159cf1c378a82a9f5e3"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "boinc-manager-lang boinc-manager-lang-all locale(boinc-manager:bg) locale(boinc-manager:ca) locale(boinc-manager:cs) locale(boinc-manager:da) locale(boinc-manager:de) locale(boinc-manager:es) locale(boinc-manager:fi) locale(boinc-manager:fr) locale(boinc-manager:he) locale(boinc-manager:hu) locale(boinc-manager:it_IT) locale(boinc-manager:ja) locale(boinc-manager:ka) locale(boinc-manager:ko) locale(boinc-manager:lv) locale(boinc-manager:nb) locale(boinc-manager:nl) locale(boinc-manager:pl) locale(boinc-manager:pt_BR) locale(boinc-manager:ro) locale(boinc-manager:ru) locale(boinc-manager:sk) locale(boinc-manager:sv) locale(boinc-manager:tr) locale(boinc-manager:uk) locale(boinc-manager:zh_CN) locale(boinc-manager:zh_TW)"
RDEPENDS:${PN} += "boinc-manager"

inherit rpm
