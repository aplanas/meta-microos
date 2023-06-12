SUMMARY = "Translations for package akonadi-server"
DESCRIPTION = "Provides translations for the 'akonadi-server' package."
LICENSE = "LGPL-2.1-or-later"

PV = "23.04.1"

RPM_NAME = "akonadi-server-lang-23.04.1-1.1.noarch.rpm"
RPM_HASH = "102c6c976c95c3282d82f72f2c5419e60e279c9d5d573700a27b03837521ce524eb89bc948827fae4b4c8f5bb2115b568dee5b04e0e19135eb704588b26f98cf"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-server-lang akonadi-server-lang-all locale(akonadi-server:ar) locale(akonadi-server:az) locale(akonadi-server:be) locale(akonadi-server:bg) locale(akonadi-server:bs) locale(akonadi-server:ca) locale(akonadi-server:ca@valencia) locale(akonadi-server:cs) locale(akonadi-server:da) locale(akonadi-server:de) locale(akonadi-server:el) locale(akonadi-server:en_GB) locale(akonadi-server:eo) locale(akonadi-server:es) locale(akonadi-server:et) locale(akonadi-server:eu) locale(akonadi-server:fi) locale(akonadi-server:fr) locale(akonadi-server:ga) locale(akonadi-server:gl) locale(akonadi-server:hu) locale(akonadi-server:ia) locale(akonadi-server:id) locale(akonadi-server:it) locale(akonadi-server:ja) locale(akonadi-server:ka) locale(akonadi-server:kk) locale(akonadi-server:km) locale(akonadi-server:ko) locale(akonadi-server:lt) locale(akonadi-server:lv) locale(akonadi-server:mai) locale(akonadi-server:mr) locale(akonadi-server:nb) locale(akonadi-server:nds) locale(akonadi-server:nl) locale(akonadi-server:nn) locale(akonadi-server:pa) locale(akonadi-server:pl) locale(akonadi-server:pt) locale(akonadi-server:pt_BR) locale(akonadi-server:ro) locale(akonadi-server:ru) locale(akonadi-server:sk) locale(akonadi-server:sl) locale(akonadi-server:sq) locale(akonadi-server:sr) locale(akonadi-server:sr@ijekavian) locale(akonadi-server:sr@ijekavianlatin) locale(akonadi-server:sr@latin) locale(akonadi-server:sv) locale(akonadi-server:th) locale(akonadi-server:tr) locale(akonadi-server:ug) locale(akonadi-server:uk) locale(akonadi-server:zh_CN) locale(akonadi-server:zh_TW)"
RDEPENDS:${PN} += "akonadi-server"

inherit rpm
