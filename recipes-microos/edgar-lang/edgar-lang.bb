SUMMARY = "Translations for package edgar"
DESCRIPTION = "Provides translations for the 'edgar' package."
LICENSE = "GPL-2.0-or-later"

PV = "1.36"

RPM_NAME = "edgar-lang-1.36-1.3.noarch.rpm"
RPM_HASH = "abe4a6ffd90f285b2bf0e716a6be8b840deb0e91d401c8bf96d52074b821d5c4400e36a34cab2b89c0641e812e23ffcbe1282e3614312fda5a4ea6d379587510"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "edgar-lang edgar-lang-all locale(edgar:ar) locale(edgar:cs) locale(edgar:da) locale(edgar:de) locale(edgar:el) locale(edgar:en_GB) locale(edgar:en_US) locale(edgar:eo) locale(edgar:es) locale(edgar:fa) locale(edgar:fr) locale(edgar:hi) locale(edgar:id) locale(edgar:it) locale(edgar:ja) locale(edgar:ko) locale(edgar:lv) locale(edgar:ms) locale(edgar:nl) locale(edgar:pl) locale(edgar:pt) locale(edgar:pt_BR) locale(edgar:ro) locale(edgar:ru) locale(edgar:sk) locale(edgar:sr) locale(edgar:sv) locale(edgar:ta) locale(edgar:tr) locale(edgar:uk) locale(edgar:vi) locale(edgar:zh_CN)"
RDEPENDS:${PN} += "edgar"

inherit rpm
