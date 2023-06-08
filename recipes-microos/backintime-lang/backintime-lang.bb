SUMMARY = "Translations for package backintime"
DESCRIPTION = "Provides translations for the 'backintime' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.3.3"

RPM_NAME = "backintime-lang-1.3.3-2.1.noarch.rpm"
RPM_HASH = "21434ef1cc64a4c529e617d7a3126f7f000f5f8b82a05d166768631dd1c9e6160145b88e9356c90c60f0cee668eea867c99e45c6ebc0229533e97863d039da1f"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "backintime-lang backintime-lang-all locale(backintime:ar) locale(backintime:bg) locale(backintime:bs) locale(backintime:ca) locale(backintime:cs) locale(backintime:da) locale(backintime:de) locale(backintime:el) locale(backintime:en_CA) locale(backintime:en_GB) locale(backintime:eo) locale(backintime:es) locale(backintime:et) locale(backintime:eu) locale(backintime:fi) locale(backintime:fr) locale(backintime:gl) locale(backintime:he) locale(backintime:hr) locale(backintime:hu) locale(backintime:id) locale(backintime:is) locale(backintime:it) locale(backintime:ja) locale(backintime:ko) locale(backintime:lt) locale(backintime:nb) locale(backintime:nl) locale(backintime:nn) locale(backintime:pl) locale(backintime:pt) locale(backintime:pt_BR) locale(backintime:ro) locale(backintime:ru) locale(backintime:sk) locale(backintime:sl) locale(backintime:sr) locale(backintime:sv) locale(backintime:th) locale(backintime:tr) locale(backintime:uk) locale(backintime:zh_CN) locale(backintime:zh_TW)"
RDEPENDS:${PN} += "backintime"

inherit rpm
