SUMMARY = "Translations for package eolie"
DESCRIPTION = "Provides translations for the 'eolie' package."
LICENSE = "GPL-3.0-or-later"

PV = "0.9.101"

RPM_NAME = "eolie-lang-0.9.101-1.10.noarch.rpm"
RPM_HASH = "d519dea9be49137ff30f0ed918e40575d04475ab22d28e9cf853c1962a289eccc97f494a8b148fa8922d5e01c911e46d01c7fd07781aa9223385d112ab6bfbe5"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "eolie-lang \
eolie-lang-all \
locale(eolie:ar) \
locale(eolie:de) \
locale(eolie:el) \
locale(eolie:eo) \
locale(eolie:es) \
locale(eolie:es_EC) \
locale(eolie:fa) \
locale(eolie:fi) \
locale(eolie:fr) \
locale(eolie:hr) \
locale(eolie:hu) \
locale(eolie:it) \
locale(eolie:ko) \
locale(eolie:lt) \
locale(eolie:nb_NO) \
locale(eolie:nl) \
locale(eolie:nl_BE) \
locale(eolie:pl) \
locale(eolie:pt) \
locale(eolie:pt_BR) \
locale(eolie:pt_PT) \
locale(eolie:ru) \
locale(eolie:sv) \
locale(eolie:tr) \
locale(eolie:uk) \
locale(eolie:zh_Hans) \
locale(eolie:zh_Hant)"

RDEPENDS:${PN} += "eolie"

inherit rpm
