SUMMARY = "Translations for package angelfish"
DESCRIPTION = "Provides translations for the 'angelfish' package."
LICENSE = "GPL-2.0-or-later"

PV = "23.04.0"

RPM_NAME = "angelfish-lang-23.04.0-1.1.noarch.rpm"
RPM_HASH = "c5aeb936fb553931e792ab70aee7e0aa72237c20f4ee4c3675bb4074d5631993cab6395ae652a99201fe77ec9072a27c06671cc1162f8ee2cff41f7fc75492da"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "angelfish-lang angelfish-lang-all locale(angelfish:az) locale(angelfish:ca) locale(angelfish:ca@valencia) locale(angelfish:cs) locale(angelfish:da) locale(angelfish:de) locale(angelfish:el) locale(angelfish:en_GB) locale(angelfish:es) locale(angelfish:et) locale(angelfish:eu) locale(angelfish:fi) locale(angelfish:fr) locale(angelfish:gl) locale(angelfish:hu) locale(angelfish:ia) locale(angelfish:id) locale(angelfish:it) locale(angelfish:ja) locale(angelfish:ka) locale(angelfish:ko) locale(angelfish:lt) locale(angelfish:nl) locale(angelfish:nn) locale(angelfish:pa) locale(angelfish:pl) locale(angelfish:pt) locale(angelfish:pt_BR) locale(angelfish:ru) locale(angelfish:sk) locale(angelfish:sl) locale(angelfish:sv) locale(angelfish:ta) locale(angelfish:tr) locale(angelfish:uk) locale(angelfish:zh_CN) locale(angelfish:zh_TW)"
RDEPENDS:${PN} += "angelfish"

inherit rpm
