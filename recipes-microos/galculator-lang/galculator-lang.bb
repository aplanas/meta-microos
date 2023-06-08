SUMMARY = "Translations for package galculator"
DESCRIPTION = "Provides translations for the 'galculator' package."
LICENSE = "GPL-2.0-or-later"

PV = "2.1.4"

RPM_NAME = "galculator-lang-2.1.4-3.14.noarch.rpm"
RPM_HASH = "e1d462f18372064553bac5a31f07f46e0221ee06567b48e34b7d8b66b53036082e53e506778c7d11f6b0a8eeb82d7abc46f624399fa4ed472b77fcd3f6612c5a"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "galculator-lang galculator-lang-all locale(galculator:cs) locale(galculator:de) locale(galculator:el) locale(galculator:en_AU) locale(galculator:es) locale(galculator:es_MX) locale(galculator:fr) locale(galculator:gl) locale(galculator:hu) locale(galculator:id) locale(galculator:it) locale(galculator:ja) locale(galculator:kk) locale(galculator:lt) locale(galculator:mr) locale(galculator:pl) locale(galculator:pt) locale(galculator:pt_BR) locale(galculator:ro) locale(galculator:ru) locale(galculator:sk) locale(galculator:sv) locale(galculator:tr) locale(galculator:uk) locale(galculator:zh_CN) locale(galculator:zh_TW)"
RDEPENDS:${PN} += "galculator"

inherit rpm
