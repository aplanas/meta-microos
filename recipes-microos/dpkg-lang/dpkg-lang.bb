SUMMARY = "Translations for package dpkg"
DESCRIPTION = "Provides translations for the 'dpkg' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.21.8"

RPM_NAME = "dpkg-lang-1.21.8-1.6.noarch.rpm"
RPM_HASH = "51bb9f6a5f51530a2dfc9107068685858d753f4be41a04807c5aaeeba148aca3f3ae067d6b6218bf1e38d9442b17d512615bae47bc60df4000bdaa7cc3b4144c"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "dpkg-lang dpkg-lang-all locale(dpkg:ast) locale(dpkg:bs) locale(dpkg:ca) locale(dpkg:cs) locale(dpkg:da) locale(dpkg:de) locale(dpkg:dz) locale(dpkg:el) locale(dpkg:eo) locale(dpkg:es) locale(dpkg:et) locale(dpkg:eu) locale(dpkg:fr) locale(dpkg:gl) locale(dpkg:hu) locale(dpkg:id) locale(dpkg:it) locale(dpkg:ja) locale(dpkg:km) locale(dpkg:ko) locale(dpkg:lt) locale(dpkg:mr) locale(dpkg:nb) locale(dpkg:ne) locale(dpkg:nl) locale(dpkg:nn) locale(dpkg:oc) locale(dpkg:pa) locale(dpkg:pl) locale(dpkg:pt) locale(dpkg:pt_BR) locale(dpkg:ro) locale(dpkg:ru) locale(dpkg:sk) locale(dpkg:sv) locale(dpkg:th) locale(dpkg:tr) locale(dpkg:vi) locale(dpkg:zh_CN) locale(dpkg:zh_TW)"
RDEPENDS:${PN} += "dpkg"

inherit rpm
