SUMMARY = "Translations for package audacity"
DESCRIPTION = "Provides translations for the 'audacity' package."
LICENSE = "CC-BY-3.0 & GPL-2.0-or-later & GPL-3.0-only"

PV = "3.3.1"

RPM_NAME = "audacity-lang-3.3.1-1.2.noarch.rpm"
RPM_HASH = "152453532f4fcd03e056d70b915b5fcf850eae6132140f1dadb98f80749dc8f95b97202d0eb0f44320d7e88e855742f9a1d34b983cbcf1c9e42ac91d80765efa"
REPO_ARCH = "noarch"

RPROVIDES:${PN} += "audacity-lang audacity-lang-all locale(audacity:af) locale(audacity:ar) locale(audacity:be) locale(audacity:bg) locale(audacity:bn) locale(audacity:bs) locale(audacity:ca) locale(audacity:cs) locale(audacity:cy) locale(audacity:da) locale(audacity:de) locale(audacity:el) locale(audacity:es) locale(audacity:eu) locale(audacity:fa) locale(audacity:fi) locale(audacity:fr) locale(audacity:ga) locale(audacity:gl) locale(audacity:he) locale(audacity:hi) locale(audacity:hr) locale(audacity:hu) locale(audacity:id) locale(audacity:it) locale(audacity:ja) locale(audacity:ka) locale(audacity:km) locale(audacity:ko) locale(audacity:lt) locale(audacity:mk) locale(audacity:mr) locale(audacity:nb) locale(audacity:nl) locale(audacity:oc) locale(audacity:pl) locale(audacity:pt_BR) locale(audacity:pt_PT) locale(audacity:ro) locale(audacity:ru) locale(audacity:sk) locale(audacity:sl) locale(audacity:sv) locale(audacity:ta) locale(audacity:tr) locale(audacity:uk) locale(audacity:vi) locale(audacity:zh_CN) locale(audacity:zh_TW)"
RDEPENDS:${PN} += "audacity"

inherit rpm
