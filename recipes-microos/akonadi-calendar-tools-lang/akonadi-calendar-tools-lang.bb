SUMMARY = "Translations for package akonadi-calendar-tools"
DESCRIPTION = "Provides translations for the 'akonadi-calendar-tools' package."
LICENSE = "GPL-2.0-or-later & LGPL-2.1-or-later"

PV = "23.04.0"

RPM_NAME = "akonadi-calendar-tools-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "7f234fc928f485a758b1f1dd6eb5144e1e662128ae2911cc31e6a8960514ea4d94681a6409850fe8cd10846bc13af6f47e7c3ad9f403a9d7ae56bcb32a735f63"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "akonadi-calendar-tools-lang akonadi-calendar-tools-lang-all locale(akonadi-calendar-tools:ar) locale(akonadi-calendar-tools:az) locale(akonadi-calendar-tools:be) locale(akonadi-calendar-tools:bg) locale(akonadi-calendar-tools:br) locale(akonadi-calendar-tools:bs) locale(akonadi-calendar-tools:ca) locale(akonadi-calendar-tools:ca@valencia) locale(akonadi-calendar-tools:cs) locale(akonadi-calendar-tools:cy) locale(akonadi-calendar-tools:da) locale(akonadi-calendar-tools:de) locale(akonadi-calendar-tools:el) locale(akonadi-calendar-tools:en_GB) locale(akonadi-calendar-tools:eo) locale(akonadi-calendar-tools:es) locale(akonadi-calendar-tools:et) locale(akonadi-calendar-tools:eu) locale(akonadi-calendar-tools:fa) locale(akonadi-calendar-tools:fi) locale(akonadi-calendar-tools:fr) locale(akonadi-calendar-tools:ga) locale(akonadi-calendar-tools:gl) locale(akonadi-calendar-tools:he) locale(akonadi-calendar-tools:hi) locale(akonadi-calendar-tools:hr) locale(akonadi-calendar-tools:hu) locale(akonadi-calendar-tools:ia) locale(akonadi-calendar-tools:is) locale(akonadi-calendar-tools:it) locale(akonadi-calendar-tools:ja) locale(akonadi-calendar-tools:ka) locale(akonadi-calendar-tools:kk) locale(akonadi-calendar-tools:km) locale(akonadi-calendar-tools:ko) locale(akonadi-calendar-tools:lt) locale(akonadi-calendar-tools:mk) locale(akonadi-calendar-tools:mr) locale(akonadi-calendar-tools:ms) locale(akonadi-calendar-tools:nb) locale(akonadi-calendar-tools:nds) locale(akonadi-calendar-tools:ne) locale(akonadi-calendar-tools:nl) locale(akonadi-calendar-tools:nn) locale(akonadi-calendar-tools:pa) locale(akonadi-calendar-tools:pl) locale(akonadi-calendar-tools:pt) locale(akonadi-calendar-tools:pt_BR) locale(akonadi-calendar-tools:ro) locale(akonadi-calendar-tools:ru) locale(akonadi-calendar-tools:sk) locale(akonadi-calendar-tools:sl) locale(akonadi-calendar-tools:sq) locale(akonadi-calendar-tools:sv) locale(akonadi-calendar-tools:ta) locale(akonadi-calendar-tools:tr) locale(akonadi-calendar-tools:ug) locale(akonadi-calendar-tools:uk) locale(akonadi-calendar-tools:zh_CN) locale(akonadi-calendar-tools:zh_TW)"
RDEPENDS:${PN} += "akonadi-calendar-tools"

inherit rpm
