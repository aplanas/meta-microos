SUMMARY = "Translations for package akonadi-search"
DESCRIPTION = "Provides translations for the 'akonadi-search' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later & LGPL-3.0-only"

PV = "23.04.0"

RPM_NAME = "akonadi-search-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "138520375734a0f2ce15e792810b404c25f4bab2fcb92f7611532d19fb40281a0ac71f56be1403e84bbda1aa7844aead586c38887cbf57ca4d36517410b24a53"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-search-lang akonadi-search-lang-all locale(akonadi-search:ar) locale(akonadi-search:az) locale(akonadi-search:bg) locale(akonadi-search:ca) locale(akonadi-search:ca@valencia) locale(akonadi-search:cs) locale(akonadi-search:da) locale(akonadi-search:de) locale(akonadi-search:el) locale(akonadi-search:en_GB) locale(akonadi-search:es) locale(akonadi-search:et) locale(akonadi-search:eu) locale(akonadi-search:fi) locale(akonadi-search:fr) locale(akonadi-search:gl) locale(akonadi-search:hi) locale(akonadi-search:hu) locale(akonadi-search:ia) locale(akonadi-search:it) locale(akonadi-search:ja) locale(akonadi-search:ka) locale(akonadi-search:ko) locale(akonadi-search:lt) locale(akonadi-search:nb) locale(akonadi-search:nl) locale(akonadi-search:nn) locale(akonadi-search:pl) locale(akonadi-search:pt) locale(akonadi-search:pt_BR) locale(akonadi-search:ro) locale(akonadi-search:ru) locale(akonadi-search:sk) locale(akonadi-search:sl) locale(akonadi-search:sr) locale(akonadi-search:sr@ijekavian) locale(akonadi-search:sr@ijekavianlatin) locale(akonadi-search:sr@latin) locale(akonadi-search:sv) locale(akonadi-search:tr) locale(akonadi-search:uk) locale(akonadi-search:zh_CN) locale(akonadi-search:zh_TW)"
RDEPENDS:${PN} += "akonadi-search"

inherit rpm
