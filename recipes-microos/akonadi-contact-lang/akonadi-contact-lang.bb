SUMMARY = "Translations for package akonadi-contact"
DESCRIPTION = "Provides translations for the 'akonadi-contact' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-contact-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "cf29571192ca6258b03e803b93b6e453454715dea489dbabf6dc24ab4f9fe488ad1fff0073f75a26225f2347bef04742679f98dd6c8823175053c9855d01bddd"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-contact-lang akonadi-contact-lang-all locale(akonadi-contact:ar) locale(akonadi-contact:az) locale(akonadi-contact:bg) locale(akonadi-contact:bs) locale(akonadi-contact:ca) locale(akonadi-contact:ca@valencia) locale(akonadi-contact:cs) locale(akonadi-contact:da) locale(akonadi-contact:de) locale(akonadi-contact:el) locale(akonadi-contact:en_GB) locale(akonadi-contact:eo) locale(akonadi-contact:es) locale(akonadi-contact:et) locale(akonadi-contact:eu) locale(akonadi-contact:fi) locale(akonadi-contact:fr) locale(akonadi-contact:ga) locale(akonadi-contact:gl) locale(akonadi-contact:he) locale(akonadi-contact:hr) locale(akonadi-contact:hu) locale(akonadi-contact:ia) locale(akonadi-contact:it) locale(akonadi-contact:ja) locale(akonadi-contact:ka) locale(akonadi-contact:kk) locale(akonadi-contact:km) locale(akonadi-contact:ko) locale(akonadi-contact:lt) locale(akonadi-contact:lv) locale(akonadi-contact:mai) locale(akonadi-contact:mr) locale(akonadi-contact:nb) locale(akonadi-contact:nds) locale(akonadi-contact:nl) locale(akonadi-contact:nn) locale(akonadi-contact:pa) locale(akonadi-contact:pl) locale(akonadi-contact:pt) locale(akonadi-contact:pt_BR) locale(akonadi-contact:ro) locale(akonadi-contact:ru) locale(akonadi-contact:sk) locale(akonadi-contact:sl) locale(akonadi-contact:sr) locale(akonadi-contact:sr@ijekavian) locale(akonadi-contact:sr@ijekavianlatin) locale(akonadi-contact:sr@latin) locale(akonadi-contact:sv) locale(akonadi-contact:th) locale(akonadi-contact:tr) locale(akonadi-contact:ug) locale(akonadi-contact:uk) locale(akonadi-contact:zh_CN) locale(akonadi-contact:zh_TW)"
RDEPENDS:${PN} += "akonadi-contact"

inherit rpm
